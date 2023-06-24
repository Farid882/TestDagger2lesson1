package com.example.testdagger2lesson1.di

import com.example.testdagger2lesson1.MainActivity
import com.example.testdagger2lesson1.MainApp
import com.example.testdagger2lesson1.data.Toyota
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun providesToyota(): Toyota{
        return Toyota()
    }
}