package com.example.demo_kotlin_broadcast_receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeEnable = intent?.getBooleanExtra("state", false) ?: return
        if (isAirplaneModeEnable) {
            Toast.makeText(context, "Airplane Mode is enable", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "Airplane Mode is disable", Toast.LENGTH_SHORT).show()
        }
    }
}