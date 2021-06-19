package com.example.conditionpattern.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conditionpattern.Content
import com.example.conditionpattern.PolicyContext
import com.example.conditionpattern.R
import com.example.conditionpattern.behaviors.StartMainActivity
import com.example.conditionpattern.behaviors.StartSecondActivity
import com.example.conditionpattern.behaviors.StartThirdActivity
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class FirstActivity : AppCompatActivity() {

    lateinit var policy: PolicyContext

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        /**
         * onclick
         */
        firstRunnerMainActivityButton.setOnClickListener {
            policy = PolicyContext(this@FirstActivity, StartMainActivity(), Content.MAIN_ACTIVITY_NUMBER)
            policy.execute()
        }

        /**
         * onclick
         */
        firstRunnerSecondActivityButton.setOnClickListener {
            policy = PolicyContext(this@FirstActivity, StartSecondActivity(), Content.SECOND_ACTIVITY_NUMBER)
            policy.execute()
        }

        /**
         * onclick
         */
        firstRunnerThirdActivityButton.setOnClickListener {
            policy = PolicyContext(this@FirstActivity, StartThirdActivity(), Content.THIRD_ACTIVITY_NUMBER)
            policy.execute()
        }
    }
}