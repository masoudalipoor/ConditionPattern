package com.example.conditionpattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.NumberPicker
import com.example.conditionpattern.behaviors.StartFirstActivity
import com.example.conditionpattern.behaviors.StartSecondActivity
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {

    private var pick: NumberPicker ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pick = findViewById(R.id.numberPicker)
        pick?.minValue = 1 // can be anything you want, for example 50
        pick?.maxValue = 2 // can be anything you want, for example 100

        findViewById<Button>(R.id.selectNumberButton).setOnClickListener {
            val time = measureTimeMillis {
                val setting = PolicyContext(pick!!.value, this@MainActivity)
//                setting.executeFirstActivity()
            }
            Log.e("selectNumberButton", "$time")
        }
    }
}