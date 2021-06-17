package com.example.conditionpattern.behaviors

import android.content.Context
import android.content.Intent
import com.example.conditionpattern.FirstActivity
import com.example.conditionpattern.Policy

class StartFirstActivity : Policy {
    override fun value(): Boolean {
        return true
    }

    override fun shiftActivity(context: Context, cl: Class<*>) {
        value()
        context.startActivity(Intent(context, FirstActivity::class.java))
    }
}