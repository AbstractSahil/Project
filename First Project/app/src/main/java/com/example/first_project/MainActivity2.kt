package com.example.first_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class SecondActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var heightEditText: EditText
    private lateinit var weightEditText: EditText
    private lateinit var bmiResultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        heightEditText = findViewById(R.id.heightEditText)
        weightEditText = findViewById(R.id.weightEditText)
        bmiResultTextView = findViewById(R.id.bmiResultTextView)

        val calculateBmiButton = findViewById<Button>(R.id.calculateBmiButton)
        calculateBmiButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.calculateBmiButton) {
            calculateBmi()
        }
    }

    private fun calculateBmi() {
        val heightCm = heightEditText.text.toString().toFloatOrNull() ?: 0f
        val weightKg = weightEditText.text.toString().toFloatOrNull() ?: 0f

        val heightM = heightCm / 100
        val bmi = weightKg / (heightM.pow(2))

        bmiResultTextView.text = String.format("BMI: %.2f", bmi)
    }
}
