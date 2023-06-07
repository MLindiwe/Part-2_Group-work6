package com.example.part_2_group_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TimesheetEntry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timesheet_entry)




        val btnback = findViewById<Button>(R.id.btnback)
        //create an setonclickListener for that id

        //button back
        btnback.setOnClickListener {

            //reference the activity using This@(current activity),login::class.java
            val intent1 = Intent(this@TimesheetEntry, Main_dashboard::class.java)
            //call the intent
            startActivity(intent1)

        }
    }
}