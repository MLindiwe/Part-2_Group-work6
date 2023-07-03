package com.example.part_2_group_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Signup : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Initialize Firebase Auth
        auth = Firebase.auth


        //INTENT
        //create val button
        //reference  the id for the button or value
        val btnback = findViewById<Button>(R.id.btnback)
        val btnsignup:Button = findViewById(R.id.btnsignup)
        //create an setonclickListener for that id


        btnsignup.setOnClickListener {

            performSignUp()

        }


        btnback.setOnClickListener {

            //reference the activity using This@(current activity),signup::class.java
            val intent1 = Intent(this@Signup, MainActivity::class.java)
            //call the intent
            startActivity(intent1)
        }
    }

    private fun performSignUp(){
        val email = findViewById<EditText>(R.id.emailEnter)
        val password = findViewById<EditText>(R.id.pwrd)

        if(email.text.isEmpty() || password.text.isEmpty()){
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT)
                .show()
            return
        }

        val inputEmail = email.text.toString()
        val inputPassword = password.text.toString()


        auth.createUserWithEmailAndPassword(inputEmail, inputPassword)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success,
                    //reference the activity using This@(current activity),login::class.java
                    val intent1 = Intent(this@Signup, Login::class.java)
                    //call the intent
                    startActivity(intent1)

                    Toast.makeText(
                        baseContext,
                        "Success.",
                        Toast.LENGTH_SHORT,
                    ).show()

                } else {
                    // If sign in fails, display a message to the user.

                    Toast.makeText(
                        baseContext,
                        "Authentication failed.",
                        Toast.LENGTH_SHORT,
                    ).show()
                }
            }
            .addOnFailureListener{
                Toast.makeText(this,"Error occurred.${it.localizedMessage}", Toast.LENGTH_SHORT,).show()
            }
    }
}