package com.fuck.learn.utils

import android.animation.ValueAnimator
import android.os.Build
import java.lang.reflect.Method

object AnimationScaleUtil {

    fun getDurationScale(): Float {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            return ValueAnimator.getDurationScale()
        }

        try {
            val method: Method = ValueAnimator::class.java.getMethod("getDurationScale")
            return method.invoke(null) as Float
        } catch (e: Exception) {
            LogUtils.e(e.printStackTrace().toString())
            return 1.0f
        }
    }
}