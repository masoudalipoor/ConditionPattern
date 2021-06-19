package com.example.conditionpattern.behaviors

import android.content.Context
import android.content.Intent
import com.example.conditionpattern.Content
import com.example.conditionpattern.activities.FirstActivity
import com.example.conditionpattern.Policy

class StartFirstActivity : Policy {
    override fun shiftActivity(context: Context, activityNumber: Int) {
        if (activityNumber == Content.FIRST_ACTIVITY_NUMBER)
            context.startActivity(Intent(context, FirstActivity::class.java))
    }
}