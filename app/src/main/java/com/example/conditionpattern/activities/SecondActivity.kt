package com.example.conditionpattern.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.NumberPicker
import com.example.conditionpattern.PolicyContext
import com.example.conditionpattern.R
import com.example.conditionpattern.behaviors.StartFirstActivity
import kotlin.system.measureTimeMillis

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

    }
}