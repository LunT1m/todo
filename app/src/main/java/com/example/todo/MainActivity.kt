package com.example.todo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.collection.emptyLongSet
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textMain = findViewById<TextView>(R.id.textmain)
        val editMain: EditText = findViewById(R.id.editTextMain)
        val button: Button = findViewById(R.id.Mainbutton)

        button.setOnClickListener {
            val text = userData.text.toString().trim()
            if(text == "toast")
                Toast.makeText(this, "User enter toast", Toast.LENGTH_SHORT).show()
            else
                lable.text = text


        }
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}