package com.example.notificationchanneldemo

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build

const val  ch_1_ID = "channel1"
const val  ch_2_ID = "channel2"
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        createNotificationChannels()
    }
    private fun createNotificationChannels(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            var channel1 = NotificationChannel(ch_1_ID,"Channel 1", NotificationManager.IMPORTANCE_HIGH)
            channel1.description = "This is channel 1"

            var channel2 = NotificationChannel(ch_2_ID,"Channel 2", NotificationManager.IMPORTANCE_LOW)
            channel1.description = "This is channel 2"

            var manager : NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel1)
            manager.createNotificationChannel(channel2)

        }
    }


}