package com.softwareclinics.tictactoy

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.TextView
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

var player:Boolean=true;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        main_activity_play_1_button.setOnClickListener(){
            changeBackgound(main_activity_play_1_button);
        }

    }

    fun changeBackgound(b: TextView){
        if(player){
            b.setBackgroundResource(R.drawable.x_backgound)
            b.setText("X")
            player=false;
        }else{
            b.setBackgroundResource(R.drawable.o_background)
            b.setText("O")
            player=true;
        }
    }

}