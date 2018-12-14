package com.aliak.android.core

import android.app.Application
import com.aliak.android.core.di.component.AppComponent
import com.aliak.android.core.di.component.DaggerAppComponent
import com.arellomobile.mvp.RegisterMoxyReflectorPackages

@RegisterMoxyReflectorPackages("com.aliak.android.presentation")
class App : Application() {
    companion object {
        lateinit var appComponent: AppComponent
    }
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
                .builder()
                .application(this)
                .build()
    }
}