package com.example.greetings

import RustGreetings
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        init {
            // SS: load native libraries
            System.loadLibrary("cargo")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val g = RustGreetings()
        val r = g.sayHello("from Rust")
        (findViewById<View>(R.id.greetingField) as TextView).text = r
    }
}