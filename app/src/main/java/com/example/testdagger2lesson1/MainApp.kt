package com.example.testdagger2lesson1

import android.app.Application
import android.content.Context
import com.example.testdagger2lesson1.di.AppComponent
import com.example.testdagger2lesson1.di.DaggerAppComponent

class MainApp : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}
val Context.appComponent: AppComponent
    get() = when(this) {
        is MainApp-> appComponent
        else->applicationContext.appComponent
    }