package com.haroldadmin.moonshot.notifications

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.preference.PreferenceManager

class BootCompleteReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "android.intent.action.BOOT_COMPLETED") {
            val isNotificationsEnabled = PreferenceManager
                .getDefaultSharedPreferences(context)
                .getBoolean(KEY_LAUNCH_NOTIFICATIONS, true)

            if (isNotificationsEnabled)
                LaunchNotificationManager(context).scheduleNotifications()
        }
    }
}