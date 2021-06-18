package com.example.conditionpattern.behaviors

import android.content.Context
import android.content.Intent
import com.example.conditionpattern.Policy
import com.example.conditionpattern.activities.ThirdActivity

class StartThirdActivity: Policy {
    override fun shiftActivity(context: Context) {
        context.startActivity(Intent(context, ThirdActivity::class.java))
    }
}