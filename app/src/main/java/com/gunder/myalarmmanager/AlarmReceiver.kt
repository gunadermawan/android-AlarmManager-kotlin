package com.gunder.myalarmmanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmReceiver : BroadcastReceiver() {
    companion object{
        const val TYPE_ONE_TIME = "OneTimeAlarm"
        const val TYPE_REPEATING = "RepeatingAlarm"
        const val EXTRA_MESSAGE = "message"
        const val EXTRA_TYPE = "type"
//    siapkan dua id untuk 2 macam alarm, one time dan repeating
        private const val ID_ONETIME = 100
        private const val ID_REPEATING = 101
    }


    override fun onReceive(context: Context, intent: Intent) {

    }
}