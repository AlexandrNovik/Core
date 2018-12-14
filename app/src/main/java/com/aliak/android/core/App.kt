package com.aliak.android.core

import android.app.Application
import com.arellomobile.mvp.RegisterMoxyReflectorPackages

@RegisterMoxyReflectorPackages("com.aliak.android.presentation")
class App : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}