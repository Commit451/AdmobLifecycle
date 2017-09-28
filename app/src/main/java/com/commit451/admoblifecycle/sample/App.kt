package com.commit451.admoblifecycle.sample

import android.app.Application
import com.google.android.gms.ads.MobileAds


class App: Application() {

    override fun onCreate() {
        super.onCreate()
        //sample admob app id
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713")
    }
}