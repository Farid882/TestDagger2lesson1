package com.example.testdagger2lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testdagger2lesson1.data.Toyota
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var toyota: Toyota
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appComponent.inject(this)
        println(toyota.id)
    }
}