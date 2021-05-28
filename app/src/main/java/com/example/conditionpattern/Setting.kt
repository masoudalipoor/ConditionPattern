package com.example.conditionpattern

class Setting constructor(
    var condition: Condition,
    var activityNumber: Int,
) {

    fun doStrategy() {
        condition.action(activityNumber)
    }
}