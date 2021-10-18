package com.example.aibbuttoncounterbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var BTN:Button
    lateinit var TVNum:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BTN=findViewById(R.id.Thebutton)
        TVNum=findViewById(R.id.tvnum)
        var num=26
        BTN.setOnClickListener {

            num++
            TVNum.text=num.toString()

        }
    }
}