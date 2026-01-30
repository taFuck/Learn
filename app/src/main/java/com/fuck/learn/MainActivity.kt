package com.fuck.learn

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fuck.learn.ui.activity.fans.club.info.QueryFansClubInfoActivity
import com.fuck.learn.ui.activity.live.QueryLivePeopleActivity
import com.fuck.learn.ui.theme.DouyinToolTheme
import com.fuck.learn.utils.DouyinParamUtils

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    private var mPressedTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var isLoading by remember { mutableStateOf(DouyinParamUtils.isNeedRefresh()) }
            var cookieData by remember { mutableStateOf<Triple<String, String, String>?>(null) }
            var loadFailed by remember { mutableStateOf(false) }
            val context = LocalContext.current

            LaunchedEffect(Unit) {
                if (isLoading) {
                    DouyinParamUtils.refreshCookies(context, force = false) { success ->
                        if (success) {
                            cookieData = Triple(
                                DouyinParamUtils.ttWid ?: "",
                                DouyinParamUtils.acNonce ?: "",
                                DouyinParamUtils.acSignature ?: ""
                            )
                            loadFailed = false
                        } else {
                            loadFailed = true
                        }
                    }
                }
            }

            DouyinToolTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    Scaffold(
                        modifier = Modifier.fillMaxSize(),
                        topBar = {
                            TopAppBar(
                                title = { Text(stringResource(R.string.app_name)) },
                                actions = {
                                    IconButton(onClick = {
                                        cookieData = null
                                        loadFailed = false
                                        isLoading = true

                                        DouyinParamUtils.refreshCookies(context, force = true) { success ->
                                            if (success) {
                                                cookieData = Triple(
                                                    DouyinParamUtils.ttWid ?: "",
                                                    DouyinParamUtils.acNonce ?: "",
                                                    DouyinParamUtils.acSignature ?: ""
                                                )
                                                loadFailed = false
                                            } else {
                                                loadFailed = true
                                            }
                                        }
                                    }) {
                                        Icon(Icons.Default.Refresh, contentDescription = "refresh")
                                    }
                                }
                            )
                        }
                    ) { innerPadding ->
                        LazyColumn(
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            item {
                                FlowRow(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp, 0.dp, 16.dp, 16.dp),
                                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                                    verticalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
/*                                    Button(onClick = {
                                        context.startActivity(
                                            Intent(
                                                context, QueryUserInfoActivity::class.java
                                            )
                                        )
                                    }) {
                                        Text(stringResource(R.string.user_info_label))
                                    }*/
                                    Button(onClick = {
                                        context.startActivity(
                                            Intent(
                                                context, QueryFansClubInfoActivity::class.java
                                            )
                                        )
                                    }) {
                                        Text(stringResource(R.string.fans_club_label))
                                    }
/*                                    Button(onClick = {
                                        context.startActivity(
                                            Intent(
                                                context, QueryHotRankActivity::class.java
                                            )
                                        )
                                    }) {
                                        Text(stringResource(R.string.hot_rank_label))
                                    }*/
                                    Button(onClick = {
                                        context.startActivity(
                                            Intent(
                                                context, QueryLivePeopleActivity::class.java
                                            )
                                        )
                                    }) {
                                        Text(stringResource(R.string.live_people_label))
                                    }
                                    Button(onClick = {}) {
                                        Text("To be continued")
                                    }
                                }
                            }
                        }
                    }

                    // mask
                    if (isLoading) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Black.copy(alpha = 0.7f))
                                .clickable(
                                    interactionSource = remember { MutableInteractionSource() },
                                    indication = null,
                                    onClick = {}
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Surface(
                                shape = RoundedCornerShape(16.dp),
                                color = MaterialTheme.colorScheme.surface,
                                modifier = Modifier.padding(32.dp)
                            ) {
                                Column(
                                    modifier = Modifier.padding(24.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    if (cookieData == null && !loadFailed) {
                                        CircularProgressIndicator(modifier = Modifier.size(48.dp))
                                        Spacer(modifier = Modifier.height(16.dp))
                                        Text("getting parameters...", style = MaterialTheme.typography.bodyMedium)
                                    } else if (cookieData != null) {
                                        Text("Success", style = MaterialTheme.typography.titleMedium, color = Color(0xFF4CAF50))
                                        Spacer(modifier = Modifier.height(16.dp))
                                        
                                        ParamItem("ttwid", cookieData!!.first)
                                        ParamItem("__ac_nonce", cookieData!!.second)
                                        ParamItem("__ac_signature", cookieData!!.third)
                                        
                                        Spacer(modifier = Modifier.height(24.dp))
                                        Button(onClick = { isLoading = false }) {
                                            Text("OK")
                                        }
                                    } else {
                                        Text("Fail", color = MaterialTheme.colorScheme.error)
                                        Spacer(modifier = Modifier.height(16.dp))
                                        Button(onClick = {
                                            loadFailed = false
                                            DouyinParamUtils.refreshCookies(context, force = true) { success ->
                                                if (success) {
                                                    cookieData = Triple(
                                                        DouyinParamUtils.ttWid ?: "",
                                                        DouyinParamUtils.acNonce ?: "",
                                                        DouyinParamUtils.acSignature ?: ""
                                                    )
                                                } else {
                                                    loadFailed = true
                                                }
                                            }
                                        }) {
                                            Text("Retry")
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        val onBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val mNowTime = System.currentTimeMillis()
                if (mNowTime - mPressedTime > 2000) {
                    Toast.makeText(this@MainActivity, getString(R.string.exit), Toast.LENGTH_SHORT).show()
                    mPressedTime = mNowTime
                } else {
                    finish()
                }
            }
        }
        onBackPressedDispatcher.addCallback(this, onBackPressedCallback)
    }

    @Composable
    private fun ParamItem(label: String, value: String) {
        Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
            Text(text = label, style = MaterialTheme.typography.labelSmall, color = MaterialTheme.colorScheme.primary)
            Text(
                text = value,
                style = MaterialTheme.typography.bodySmall.copy(
                    fontFamily = FontFamily.Monospace,
                    fontSize = 10.sp
                ),
                maxLines = 1,
                modifier = Modifier.basicMarquee(1)
            )
        }
    }
}
