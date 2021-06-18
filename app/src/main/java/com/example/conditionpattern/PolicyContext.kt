package com.example.conditionpattern

import android.content.Context
import com.example.conditionpattern.behaviors.StartFirstActivity
import com.example.conditionpattern.behaviors.StartSecondActivity
import com.example.conditionpattern.behaviors.StartThirdActivity

class PolicyContext(var context: Context, var policy: Policy) {

    fun execute() {
        policy.shiftActivity(context)
    }
}