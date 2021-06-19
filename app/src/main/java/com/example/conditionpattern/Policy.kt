package com.example.conditionpattern

import android.content.Context

interface Policy {

    fun shiftActivity(context: Context, activityNumber: Int)

}