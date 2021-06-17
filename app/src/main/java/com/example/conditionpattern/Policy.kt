package com.example.conditionpattern

import android.content.Context

interface Policy {

//    fun shiftActivity(context: Context, cl: Class<*>) {
//        context.startActivity(Intent(context, cl))
//        Log.e("shiftActivity : ", "$cl")
//    }

    fun value(): Boolean
    fun shiftActivity(context: Context, cl: Class<*>)

    fun shiftFragment() {

    }
}