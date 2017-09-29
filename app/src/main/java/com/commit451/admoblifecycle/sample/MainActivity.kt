package com.commit451.admoblifecycle.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.commit451.admoblifecycle.AdViewLifecycleObserver
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class MainActivity : AppCompatActivity() {

    lateinit var adView: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adView = findViewById(R.id.adview)

        val lifecycleObserver = AdViewLifecycleObserver(adView)
        lifecycle.addObserver(lifecycleObserver)

        val adRequest = AdRequest.Builder()
                .build()
        adView.loadAd(adRequest)

    }
}
