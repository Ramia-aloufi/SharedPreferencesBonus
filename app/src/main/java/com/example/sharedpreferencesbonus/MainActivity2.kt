package com.example.sharedpreferencesbonus

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var sp :SharedPreferences
    lateinit var tvv:TextView
    lateinit var tv11:TextView
    lateinit var btt:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tvv = findViewById(R.id.textView)
        tv11 = findViewById(R.id.textView2)
        btt = findViewById(R.id.button3)

        btt.setOnClickListener {
            sp = this.getSharedPreferences("hyy", MODE_PRIVATE)
            tvv.text = sp.getString("qqq","")
            tv11.text = sp.getString("lpp","")
        }

        tvv.text = intent.getStringExtra("ll")
        tv11.text = intent.getStringExtra("ll2")

    }
}