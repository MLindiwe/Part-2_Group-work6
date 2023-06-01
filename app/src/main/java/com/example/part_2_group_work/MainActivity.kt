package com.example.part_2_group_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//INTENT
        //create val button
        //reference  the id for the button or value
        val btnn = findViewById<Button>(R.id.btnn)
        val btnsignup = findViewById<Button>(R.id.btnsignup)
        //create an setonclickListener for that id

        //signup button id:btnlogin
        btnn.setOnClickListener {

            //reference the activity using This@(current activity),login::class.java
            val intent1 = Intent(this@MainActivity, Login::class.java)
            //call the intent
            startActivity(intent1)

        }

//signup button id:btnsignup
        btnsignup.setOnClickListener {

            //reference the activity using This@(current activity),signup::class.java
            val intent1 = Intent(this@MainActivity, Signup::class.java)
            //call the intent
            startActivity(intent1)
        }
    }

}