package com.fuck.learn.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.platform.LocalView
import kotlin.math.hypot

@Composable
fun CircularReveal(
    targetState: Boolean,
    center: Offset,
    animationDuration: Int = 500,
    onFinish: () -> Unit,
    content: @Composable () -> Unit,
) {
    val view = LocalView.current
    val width = view.width.toFloat()
    val height = view.height.toFloat()

    val maxRadius = hypot(
        (if (center.x > width / 2) center.x else width - center.x),
        (if (center.y > height / 2) center.y else height - center.y)
    )

    var isRevealing by remember { mutableStateOf(false) }

    val radius by animateFloatAsState(
        targetValue = if (isRevealing) maxRadius else 0f,
        animationSpec = tween(durationMillis = animationDuration),
        label = "CircularRevealRadius",
        finishedListener = {
            if (isRevealing) {
                onFinish()
            }
        }
    )

    LaunchedEffect(targetState) {
        if (targetState) {
            isRevealing = true
        }
    }

    if (isRevealing) {
        Box(
            modifier = Modifier.drawWithContent {
                val path = Path().apply {
                    addOval(Rect(center = center, radius = radius))
                }
                clipPath(path) {
                    this@drawWithContent.drawContent()
                }
            }
        ) {
            content()
        }
    }
}