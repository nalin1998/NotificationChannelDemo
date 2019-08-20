package com.example.notificationchanneldemo

import android.app.Notification
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var notificationManager: NotificationManagerCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        notificationManager = NotificationManagerCompat.from(this)

    }

    fun sendOnChannel1(mView: View) {
        val notification: Notification = NotificationCompat.Builder(this, ch_1_ID)
            .setSmallIcon(R.drawable.ic_one)
            .setContentTitle(edit_text_title.text)
            .setContentText(edit_text_message.text)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setCategory(NotificationCompat.CATEGORY_MESSAGE)
            .build()
        notificationManager?.notify(1,notification)

    }

    fun sendOnChannel2(mView: View) {
        val notification: Notification = NotificationCompat.Builder(this, ch_2_ID)
            .setSmallIcon(R.drawable.ic_two)
            .setContentTitle(edit_text_title.text)
            .setContentText(edit_text_message.text)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .build()
        notificationManager?.notify(2,notification)


    }
}
