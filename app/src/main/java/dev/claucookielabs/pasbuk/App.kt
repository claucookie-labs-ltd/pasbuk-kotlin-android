package dev.claucookielabs.pasbuk

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}