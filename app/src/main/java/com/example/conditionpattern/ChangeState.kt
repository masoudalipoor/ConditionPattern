package com.example.conditionpattern

import android.content.Context
import android.content.Intent


class ChangeState constructor(var context: Context) : Condition {

    override fun action(activityNumber: Int) {

        when (activityNumber) {
            1 ->
            { context.startActivity(Intent(context, FirstActivity::class.java)) }
            2 ->
            { context.startActivity(Intent(context, SecondActivity::class.java)) }
        }
    }
}