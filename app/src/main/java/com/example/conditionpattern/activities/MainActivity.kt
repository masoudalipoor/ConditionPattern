package com.example.conditionpattern.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.NumberPicker
import com.example.conditionpattern.Content
import com.example.conditionpattern.PolicyContext
import com.example.conditionpattern.R
import com.example.conditionpattern.behaviors.StartFirstActivity
import com.example.conditionpattern.behaviors.StartSecondActivity
import com.example.conditionpattern.behaviors.StartThirdActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {

    lateinit var policy: PolicyContext

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * onclick
         */
        mainRunnerFirstActivityButton.setOnClickListener {
            val time = measureTimeMillis {
                policy = PolicyContext(this@MainActivity, StartFirstActivity(), Content.FIRST_ACTIVITY_NUMBER)
                policy.execute()
            }
            Log.e("click", "$time")
        }

        /**
         * onclick
         */
        mainRunnerSecondActivityButton.setOnClickListener {
            policy = PolicyContext(this@MainActivity, StartSecondActivity(), Content.SECOND_ACTIVITY_NUMBER)
            policy.execute()
        }

        /**
         * onclick
         */
        mainRunnerThirdActivityButton.setOnClickListener {
            policy = PolicyContext(this@MainActivity, StartThirdActivity(), Content.THIRD_ACTIVITY_NUMBER)
            policy.execute()
        }
    }
}