package com.example.conditionpattern

import android.content.Context
import com.example.conditionpattern.behaviors.StartFirstActivity
import com.example.conditionpattern.behaviors.StartSecondActivity

class PolicyContext {

    var context: Context
    var firstActivity: Policy ?= null
    var secondActivity: Policy ?= null

    constructor(number: Int, context: Context) {
        this.context = context

        when(number) {
            1 -> { firstActivity = StartFirstActivity()
            firstActivity!!.value()}
            2-> { secondActivity = StartSecondActivity() }
        }
    }

//    fun executeFirstActivity() {
//
//    }
}