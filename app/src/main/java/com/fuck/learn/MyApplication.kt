package com.fuck.learn

import android.app.Application
import com.fuck.learn.utils.DouyinSignUtils
import com.tencent.mmkv.MMKV

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MMKV.initialize(this)
        DouyinSignUtils.init(this)
    }
}
