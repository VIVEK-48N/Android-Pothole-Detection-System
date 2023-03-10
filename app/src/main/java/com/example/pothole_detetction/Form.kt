package com.example.pothole_detetction

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase

class Form : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val edname = findViewById<EditText>(R.id.edname)
        val edaddress = findViewById<EditText>(R.id.edaddress)
        val edanswer1 = findViewById<EditText>(R.id.edanswer1)
        val edanswer2 = findViewById<EditText>(R.id.edanswer2)
        val edanswer3 = findViewById<EditText>(R.id.edanswer3)

        val btn = findViewById<Button>(R.id.btnupload)

        btn.setOnClickListener {

            val name = edname.text.toString()
            val address = edaddress.text.toString()
            val ans1 = edanswer1.text.toString()
            val ans2 = edanswer2.text.toString()
            val ans3 = edanswer3.text.toString()

            val data = FirebaseDatabase.getInstance().reference.child("answer")
            val service = MyAnswer(name,address,ans1,ans2,ans3)


            data.push().setValue(service)

            Toast.makeText(applicationContext,"Uploaded", Toast.LENGTH_LONG).show()
        }



    }
}