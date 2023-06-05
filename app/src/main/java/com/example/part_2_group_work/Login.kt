package com.example.part_2_group_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)




//INTENT
        //create val button
        //reference  the id for the button or value
        val btnback = findViewById<Button>(R.id.btnback)
        val btnlogin = findViewById<Button>(R.id.btnlogin)
        //create an setonclickListener for that id

        //button back
        btnback.setOnClickListener {

            //reference the activity using This@(current activity),login::class.java
            val intent1 = Intent(this@Login, MainActivity::class.java)
            //call the intent
            startActivity(intent1)

        }

//signup button id:btnLogin
        btnlogin.setOnClickListener {

            //reference the activity using This@(current activity),signup::class.java
            val intent1 = Intent(this@Login, Main_dashboard::class.java)
            //call the intent
            startActivity(intent1)
        }

























    }
}