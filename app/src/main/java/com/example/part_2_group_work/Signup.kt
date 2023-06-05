package com.example.part_2_group_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)




        //INTENT
        //create val button
        //reference  the id for the button or value
        val btnback = findViewById<Button>(R.id.btnback)
        val btnsignup = findViewById<Button>(R.id.btnsignup)
        //create an setonclickListener for that id


        btnsignup.setOnClickListener {

            //reference the activity using This@(current activity),login::class.java
            val intent1 = Intent(this@Signup, Login::class.java)
            //call the intent
            startActivity(intent1)

        }


        btnback.setOnClickListener {

            //reference the activity using This@(current activity),signup::class.java
            val intent1 = Intent(this@Signup, MainActivity::class.java)
            //call the intent
            startActivity(intent1)
        }

    }















}