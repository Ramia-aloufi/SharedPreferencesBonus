package com.example.sharedpreferencesbonus

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var et1:EditText
    lateinit var et2:EditText
    lateinit var sp1 : SharedPreferences
    lateinit var btn1:Button
    lateinit var btn2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1 = findViewById(R.id.editTextTextPersonName)
        et2 = findViewById(R.id.editTextTextPersonName2)

        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)

        btn1.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
                .putExtra("ll","${et1.text}")
                .putExtra("ll2","${et2.text}")
            startActivity(intent)
        }

        btn2.setOnClickListener {
            sp1 = this.getSharedPreferences("hyy", MODE_PRIVATE)
           var sp = sp1.edit()
            sp.putString("qqq","${et1.text}")
            sp.putString("lpp","${et1.text}")
            sp.apply()




        }
    }
}