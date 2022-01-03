package com.example.testforlecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var jobEditText: EditText
    private lateinit var goToNextActivityButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameEditText = findViewById(R.id.nameEditText)
        lastNameEditText = findViewById(R.id.lastNameEditText)
        jobEditText = findViewById(R.id.jobEditText)
        goToNextActivityButton = findViewById(R.id.goToNextActivityButton)
        val person = Person(nameEditText.text.toString(), lastNameEditText.text.toString(), jobEditText.text.toString())
        goToNextActivityButton.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("person", person)
            startActivity(intent)
        }
    }
}