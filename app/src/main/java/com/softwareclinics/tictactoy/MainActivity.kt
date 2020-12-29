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
import android.widget.*
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

var player:Boolean=true;
var arrayList=ArrayList<Int>();

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrayList.add(0); arrayList.add(0); arrayList.add(0); arrayList.add(0); arrayList.add(0); arrayList.add(0); arrayList.add(0); arrayList.add(0);arrayList.add(0);

        main_activity_first_player_name_text_view.setText(arrayList[5].toString())



        main_activity_play_1_button.setOnClickListener(){
            changeBackgound(main_activity_play_1_button,0);
            checkWinner()
        }
        main_activity_play_2_button.setOnClickListener(){
            changeBackgound(main_activity_play_2_button,1);
            checkWinner()
        }
        main_activity_play_3_button.setOnClickListener(){
            changeBackgound(main_activity_play_3_button,2);
            checkWinner()
        }
        main_activity_play_4_button.setOnClickListener(){
            changeBackgound(main_activity_play_4_button,3);
            checkWinner()
        }
        main_activity_play_5_button.setOnClickListener(){
            changeBackgound(main_activity_play_5_button,4);
            checkWinner()
        }
        main_activity_play_6_button.setOnClickListener(){
            changeBackgound(main_activity_play_6_button,5);
            checkWinner()
        }
        main_activity_play_7_button.setOnClickListener(){
            changeBackgound(main_activity_play_7_button,6);
            checkWinner()
        }
        main_activity_play_8_button.setOnClickListener(){
            changeBackgound(main_activity_play_8_button,7);
            checkWinner()
        }
        main_activity_play_9_button.setOnClickListener(){
            changeBackgound(main_activity_play_9_button,8);
            checkWinner()
        }
    }

    fun changeBackgound(b: TextView, n:Int){
        if(player){
            b.setBackgroundResource(R.drawable.x_backgound)
            b.setText("X")
            arrayList[n]=1;
            b.setTextColor(resources.getColor(R.color.white))
            player=false;
        }else{
            b.setBackgroundResource(R.drawable.o_background)
            b.setText("O")
            arrayList[n]=2;
            b.setTextColor(resources.getColor(R.color.black))
            player=true;
        }
    }

    fun checkWinner(){
        if(((arrayList[0]!=0)&&(arrayList[1]!=0)&&(arrayList[2]!=0))&&arrayList[0]==arrayList[1]&&arrayList[1]==arrayList[2]){
            Toast.makeText(this, arrayList[0].toString(),Toast.LENGTH_LONG).show();
        }else if(((arrayList[3]!=0)&&(arrayList[4]!=0)&&(arrayList[5]!=0))&&arrayList[3]==arrayList[4]&&arrayList[5]==arrayList[4]){
            Toast.makeText(this, arrayList[3].toString(),Toast.LENGTH_LONG).show();
        }else if(((arrayList[6]!=0)&&(arrayList[7]!=0)&&(arrayList[8]!=0))&&arrayList[6]==arrayList[7]&&arrayList[8]==arrayList[7]){
            Toast.makeText(this, arrayList[6].toString(),Toast.LENGTH_LONG).show();
        }else if(((arrayList[7]!=0)&&(arrayList[4]!=0)&&(arrayList[6]!=0))&&arrayList[7]==arrayList[4]&&arrayList[6]==arrayList[4]){
            Toast.makeText(this, arrayList[7].toString(),Toast.LENGTH_LONG).show();
        }else if(((arrayList[0]!=0)&&(arrayList[4]!=0)&&(arrayList[8]!=0))&&arrayList[0]==arrayList[4]&&arrayList[8]==arrayList[4]){
            Toast.makeText(this, arrayList[0].toString(),Toast.LENGTH_LONG).show();
        }else if(((arrayList[0]!=0)&&(arrayList[3]!=0)&&(arrayList[6]!=0))&&arrayList[0]==arrayList[3]&&arrayList[6]==arrayList[3]){
            Toast.makeText(this, arrayList[0].toString(),Toast.LENGTH_LONG).show();
        }else if(((arrayList[2]!=0)&&(arrayList[5]!=0)&&(arrayList[8]!=0))&&arrayList[2]==arrayList[5]&&arrayList[8]==arrayList[5]){
            Toast.makeText(this, arrayList[2].toString(),Toast.LENGTH_LONG).show();
        }
    }

}