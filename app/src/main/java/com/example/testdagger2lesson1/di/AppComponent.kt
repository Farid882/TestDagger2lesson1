package com.example.testdagger2lesson1.di

import com.example.testdagger2lesson1.MainActivity
import dagger.Component

@Component(modules=[AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}