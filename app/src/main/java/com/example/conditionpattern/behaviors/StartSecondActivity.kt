package com.example.conditionpattern.behaviors

import android.content.Context
import android.content.Intent
import com.example.conditionpattern.Content
import com.example.conditionpattern.Policy
import com.example.conditionpattern.activities.SecondActivity

class StartSecondActivity : Policy {
    override fun shiftActivity(context: Context, activityNumber: Int) {
        if (activityNumber == Content.SECOND_ACTIVITY_NUMBER)
            context.startActivity(Intent(context, SecondActivity::class.java))
    }
}