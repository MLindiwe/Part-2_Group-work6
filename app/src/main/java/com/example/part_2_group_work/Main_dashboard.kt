package com.example.part_2_group_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main_dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dashboard)





        val textView10 = findViewById<Button>(R.id.textView10)
        //create an setonclickListener for that id

        //button back
        textView10.setOnClickListener {

            //reference the activity using This@(current activity),login::class.java
            val intent1 = Intent(this@Main_dashboard, MainActivity::class.java)
            //call the intent
            startActivity(intent1)

        }









    }
}