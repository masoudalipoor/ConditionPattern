package com.example.conditionpattern.behaviors

import android.content.Context
import android.content.Intent
import com.example.conditionpattern.Policy
import com.example.conditionpattern.activities.FirstActivity
import com.example.conditionpattern.activities.MainActivity

class StartMainActivity: Policy {
    override fun shiftActivity(context: Context) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }
}