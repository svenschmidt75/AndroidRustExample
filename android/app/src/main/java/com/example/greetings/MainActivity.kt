package com.example.greetings

import RustGreetings
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        init {
            //here goes static initializer code
            try {
                System.loadLibrary("cargo")
            }
            catch (e: UnsatisfiedLinkError) {
                print(e);
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val g = RustGreetings()
        val r = g.sayHello("world")
        (findViewById<View>(android.R.id.title) as TextView).text = r
    }
}