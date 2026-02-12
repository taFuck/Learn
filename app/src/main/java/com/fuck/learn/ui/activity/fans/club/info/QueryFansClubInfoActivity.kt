package com.fuck.learn.ui.activity.fans.club.info

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuAnchorType
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import com.fuck.learn.R
import com.fuck.learn.data.db.HistoryForFansClub
import com.fuck.learn.ui.theme.DouyinToolTheme
import com.fuck.learn.utils.LogUtils
import com.fuck.learn.utils.NumberUtils
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
class QueryFansClubInfoActivity : ComponentActivity() {

    private val viewModel: QueryFansClubInfoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val fansClubUiState by viewModel.fansClubUiState.collectAsState()
            var currentTime by remember { mutableStateOf("") }

            LaunchedEffect(true) {
                val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
                while (true) {
                    currentTime = sdf.format(Date())
                    delay(1000)
                }
            }

            DouyinToolTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(), topBar = {
                        Column {
                            TopAppBar(
                                title = { Text(stringResource(R.string.fans_club_label)) },
                                navigationIcon = {
                                    IconButton(onClick = { finish() }) {
                                        Icon(
                                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                            contentDescription = stringResource(R.string.content_description_back)
                                        )
                                    }
                                })
                            HorizontalDivider()

                            Text(
                                text = currentTime,
                                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )

                            HorizontalDivider()
                        }
                    }) { innerPadding ->
                    FansClubInfoScreen(
                        viewModel = viewModel, modifier = Modifier.padding(innerPadding)
                    )
                }
            }

            when (val state = fansClubUiState) {
                is FansClubUiState.Loading -> {
                    // Now handled by the button's state
                }

                is FansClubUiState.Success -> {
                    Toast.makeText(this, "Done", Toast.LENGTH_LONG).show()
                }

                is FansClubUiState.Error -> {
                    LaunchedEffect(state) {
                        Toast.makeText(
                            this@QueryFansClubInfoActivity,
                            state.message,
                            Toast.LENGTH_LONG
                        ).show()
                        LogUtils.e("${getString(R.string.error)} ${state.message}")
                    }
                }

                is FansClubUiState.Initial -> { /* Do nothing */
                }
            }
        }

        intent.getStringExtra("USER_PROFILE_URL")?.let {
            viewModel.onSecUidChange(it)
            if (intent.getBooleanExtra("AUTO_QUERY", false)) {
                viewModel.executeQuery()
            }
        }
    }

    override fun onStop() {
        super.onStop()
        viewModel.stopQuery()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FansClubInfoScreen(viewModel: QueryFansClubInfoViewModel, modifier: Modifier = Modifier) {
    val secUid by viewModel.secUid.collectAsStateWithLifecycle()
    val uiFansClubItems by viewModel.uiFansClubItems.collectAsStateWithLifecycle()
    val uiUserInfoItems by viewModel.uiUserInfoItems.collectAsStateWithLifecycle()
    val history by viewModel.history.collectAsStateWithLifecycle()
    val isQuerying by viewModel.isQuerying.collectAsStateWithLifecycle()
    val context = LocalContext.current

    FansClubInfoContent(
        modifier = modifier,
        secUid = secUid,
        uiFansClubItems = uiFansClubItems,
        uiUserInfoItems = uiUserInfoItems,
        history = history,
        isQuerying = isQuerying,
        onSecUidChange = viewModel::onSecUidChange,
        onExecuteQuery = viewModel::executeQuery,
        onStopQuery = viewModel::stopQuery,
        onDeleteHistory = viewModel::onDeleteHistory,
        onManageStreamers = {
            context.startActivity(
                Intent(
                    context, AddLiveStreamerActivity::class.java
                )
            )
        })
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FansClubInfoContent(
    secUid: String,
    uiFansClubItems: List<UiFansClubItem>,
    uiUserInfoItems: UiUserInfoItem,
    history: List<HistoryForFansClub>,
    isQuerying: Boolean,
    onSecUidChange: (String) -> Unit,
    onExecuteQuery: () -> Unit,
    onStopQuery: () -> Unit,
    onDeleteHistory: (HistoryForFansClub) -> Unit,
    onManageStreamers: () -> Unit,
    modifier: Modifier = Modifier
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    var expanded by remember { mutableStateOf(false) }

    var textFieldValue by remember { mutableStateOf(TextFieldValue(secUid)) }

    var sortState by remember { mutableStateOf<Pair<Int, Boolean>?>(null) }

    val sortedFansClubItems = remember(uiFansClubItems, sortState) {
        val state = sortState
        if (state == null) {
            uiFansClubItems
        } else {
            when (state.first) {
                0 -> if (state.second) uiFansClubItems.sortedBy { it.nickname } else uiFansClubItems.sortedByDescending { it.nickname }
                1 -> if (state.second) uiFansClubItems.sortedByDescending {
                    it.level?.toIntOrNull() ?: -1
                } else uiFansClubItems.sortedBy {
                    it.level?.toIntOrNull() ?: -1
                }

                2 -> if (state.second) uiFansClubItems.sortedByDescending {
                    when (it.vip) {
                        "\u5df2\u5f00\u901a" -> 2
                        "\u672a\u5f00\u901a" -> 1
                        else -> 0
                    }
                } else uiFansClubItems.sortedBy {
                    when (it.vip) {
                        "\u5df2\u5f00\u901a" -> 2
                        "\u672a\u5f00\u901a" -> 1
                        else -> 0
                    }
                }

                4 -> if (state.second) uiFansClubItems.sortedByDescending { it.star } else uiFansClubItems.sortedBy { it.star }
                else -> uiFansClubItems
            }
        }
    }

    LaunchedEffect(secUid) {
        if (textFieldValue.text != secUid) {
            textFieldValue = TextFieldValue(secUid, TextRange(secUid.length))
        }
    }
    LazyColumn(modifier = modifier.padding(16.dp, 8.dp, 16.dp, 0.dp)) {
        item {
            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = { expanded = !expanded },
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = textFieldValue,
                    onValueChange = {
                        textFieldValue = it
                        onSecUidChange(it.text)
                    },
                    label = { Text(stringResource(R.string.add_live_steamer_input_label)) },
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .menuAnchor(type = ExposedDropdownMenuAnchorType.PrimaryEditable),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions(onDone = {
                        onExecuteQuery()
                        expanded = false
                    })
                )
                ExposedDropdownMenu(
                    expanded = expanded, onDismissRequest = { expanded = false }) {
                    history.forEach { item ->
                        DropdownMenuItem(text = { Text(item.nickname) }, onClick = {
                            onSecUidChange(item.url)
                            expanded = false
                        }, trailingIcon = {
                            IconButton(onClick = { onDeleteHistory(item) }) {
                                Icon(
                                    Icons.Default.Delete,
                                    contentDescription = stringResource(R.string.delete_history),
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        })
                    }
                }
            }
        }

        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = {
                        keyboardController?.hide()
                        if (isQuerying) onStopQuery() else onExecuteQuery()
                    }, modifier = Modifier.weight(1f)
                ) {
                    Text(stringResource(if (isQuerying) R.string.user_info_stop_query else R.string.user_info_query))
                }
                Button(
                    onClick = onManageStreamers, modifier = Modifier.weight(1f)
                ) {
                    Text(stringResource(R.string.add_live_steamer_label))
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(8.dp))
        }

        if (!uiUserInfoItems.nickname.isNullOrBlank()) {
            stickyHeader {
                Column(modifier = Modifier.background(MaterialTheme.colorScheme.surface)) {
                    UserInfoItem(uiUserInfoItems)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        ClickableHeaderText(
                            text = "Name", weight = 1f, isSelected = sortState?.first == 0
                        ) {
                            sortState = when (sortState) {
                                0 to true -> 0 to false
                                0 to false -> null
                                else -> 0 to true
                            }
                        }
                        VerticalDivider(modifier = Modifier.height(16.dp))
                        ClickableHeaderText(
                            text = "Level", weight = 1f, isSelected = sortState?.first == 1
                        ) {
                            sortState = when (sortState) {
                                1 to true -> 1 to false
                                1 to false -> null
                                else -> 1 to true
                            }
                        }
                        VerticalDivider(modifier = Modifier.height(16.dp))
                        ClickableHeaderText(
                            text = "Vip", weight = 1f, isSelected = sortState?.first == 3
                        ) {
                            sortState = when (sortState) {
                                3 to true -> 3 to false
                                3 to false -> null
                                else -> 3 to true
                            }
                        }
                        VerticalDivider(modifier = Modifier.height(16.dp))
                        ClickableHeaderText(
                            text = "Star", weight = 1f, isSelected = sortState?.first == 4
                        ) {
                            sortState = when (sortState) {
                                4 to true -> 4 to false
                                4 to false -> null
                                else -> 4 to true
                            }
                        }
                    }
                }
            }

            items(sortedFansClubItems) { item ->
                FansClubItemRow(item = item)
            }

        }
    }
}

@Composable
fun RowScope.ClickableHeaderText(
    text: String, weight: Float, isSelected: Boolean, onClick: () -> Unit
) {
    Text(
        text = text,
        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .weight(weight)
            .clickable(onClick = onClick)
    )
}


@Composable
fun UserInfoItem(item: UiUserInfoItem) {
    if (item.nickname != null) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    contentAlignment = Alignment.Center, modifier = Modifier.padding(start = 8.dp)
                ) {
                    AsyncImage(
                        model = item.avatarUrl,
                        contentDescription = "Avatar",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )

                    item.skinUrl?.let {
                        AsyncImage(
                            model = it,
                            contentDescription = "Skin",
                            modifier = Modifier.size(80.dp),
                            contentScale = ContentScale.FillBounds
                        )
                    }
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column(
                    modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = item.nickname,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.basicMarquee(1)
                    )

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Text(text = "ID: ${item.account ?: "N/FansClubInfoBean"}", fontSize = 14.sp)
                        item.ip?.let {

                        }
                    }

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Text(text = "Level: ${item.level}", fontSize = 14.sp)
                    }

                    Text(
                        text = "\uD83D\uDC8E: ${NumberUtils.withCommas(item.consumeMin)} - ${
                            NumberUtils.withCommas(
                                item.consumeMax
                            )
                        }", fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Composable
private fun FansClubItemRow(item: UiFansClubItem) {
    LogUtils.e("""${item.clubName}
        ${item.levelUrl}
        ${item.vipUrl}
    """.trimMargin())
    Row(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 4.dp)
            .fillMaxWidth()
            .height(24.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = item.nickname ?: "N/FansClubInfoBean",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .weight(1f)
                .basicMarquee(1),
            maxLines = 1,
        )

        Text(
            text = item.level ?: "N/FansClubInfoBean",
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f),
            color = if (1 == item.state) {
                Color.Yellow
            } else {
                MaterialTheme.colorScheme.onSurface
            }
        )

        var text = "×"
        if ("\u5df2\u5f00\u901a" == item.vip) {
            text = "√"
        }
        Text(
            text = text,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f),
            color = if ("\u5df2\u5f00\u901a" == item.vip) {
                Color.Yellow
            } else {
                MaterialTheme.colorScheme.onSurface
            }
        )

        Text(
            text = item.star ?: "N/FansClubInfoBean",
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f),
            color = if ("√" == item.star) {
                Color.Yellow
            } else {
                MaterialTheme.colorScheme.onSurface
            }
        )
    }
}
