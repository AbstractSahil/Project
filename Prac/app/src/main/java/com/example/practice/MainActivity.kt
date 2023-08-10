package com.example.practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val name = editTextText.text.toString()
            val password = editTextTextPassword.text.toString()

            // Your login logic here
            // For example, you can check the credentials against a database or hardcoded values.
            // For demonstration purposes, let's just show a toast message with the input data.
            val message = "Name: $name\nPassword: $password"
            showToast(message)
        }
    }

    private fun showToast(message: String) {
        android.widget.Toast.makeText(this, message, android.widget.Toast.LENGTH_SHORT).show()
    }
}
