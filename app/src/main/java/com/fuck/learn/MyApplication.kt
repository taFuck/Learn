package com.fuck.learn

import android.app.Application
import android.os.Build
import android.provider.Settings
import com.fuck.learn.utils.DouyinSignUtils
import com.tencent.bugly.crashreport.CrashReport
import com.tencent.bugly.crashreport.CrashReport.UserStrategy
import com.tencent.mmkv.MMKV

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MMKV.initialize(this)
        DouyinSignUtils.init(this)

        val strategy = UserStrategy(applicationContext)
        strategy.deviceID = Settings.Secure.ANDROID_ID
        strategy.deviceModel = Build.MODEL
        CrashReport.initCrashReport(applicationContext, "26c27754f2", false)
    }
}
