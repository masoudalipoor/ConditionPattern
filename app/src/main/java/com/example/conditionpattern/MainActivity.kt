package com.example.conditionpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker

class MainActivity : AppCompatActivity() {

    private var pick: NumberPicker ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pick = findViewById(R.id.numberPicker)
        pick?.minValue = 1 // can be anything you want, for example 50
        pick?.maxValue = 2 // can be anything you want, for example 100

        findViewById<Button>(R.id.selectNumberButton).setOnClickListener {
            val setting = Setting(ChangeState(this@MainActivity), pick!!.value)
            setting.doStrategy()
        }
    }
}