package com.example.part_2_group_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView

class Main_dashboard : AppCompatActivity() {
    private lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dashboard)

        val Card1: CardView =findViewById(R.id.Card1);

        Card1.setOnClickListener {
            image = findViewById(R.id.Imguload)
            UploadImage(image);


        }



        val textView10 = findViewById<Button>(R.id.textView10)
        val viewlist = findViewById<ImageView>(R.id.viewlist)



        textView10.setOnClickListener {

            //reference the activity using This@(current activity),login::class.java
            val intent1 = Intent(this@Main_dashboard, TimesheetEntry::class.java)
            //call the intent
            startActivity(intent1)

        }



        viewlist.setOnClickListener {

            //reference the activity using This@(current activity),login::class.java
            val intent1 = Intent(this@Main_dashboard, Entrylist::class.java)
            //call the intent
            startActivity(intent1)

        }









    }





    private fun UploadImage(image: ImageView){
        val intent= Intent ()
        intent.action =Intent.ACTION_GET_CONTENT
        intent.type = "image/*"
        startActivityForResult(intent, 1)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1){
            image.setImageURI(data?.data)
        }
    }






}