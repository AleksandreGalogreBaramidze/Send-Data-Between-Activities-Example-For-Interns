package com.example.testforlecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf

class ResultActivity : AppCompatActivity() {
    private lateinit var nameTextView: TextView
    private lateinit var lastNameTextView: TextView
    private lateinit var jobTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        nameTextView = findViewById(R.id.nameTextView)
        lastNameTextView = findViewById(R.id.lastNameTextView)
        jobTextView = findViewById(R.id.jobTextView)
        val person = intent.extras?.get("person") as Person

        nameTextView.text = person.name
        lastNameTextView.text = person.lastName
        jobTextView.text = person.job
    }
}