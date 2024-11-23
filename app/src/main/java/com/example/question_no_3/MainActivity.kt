package com.example.question_no_3

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private var isHeightChanged = false
    private var isTextChanged = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        // Button 1: Increment counter
        button1.setOnClickListener {
            counter++
            textView.text = "Counter: $counter"
        }

        // Button 2: Toggle height
        button2.setOnClickListener {
            val params = textView.layoutParams
            if (!isHeightChanged) {
                params.height = 200 // Change height to 200 pixels
                isHeightChanged = true
            } else {
                params.height = ViewGroup.LayoutParams.WRAP_CONTENT // Reset height
                isHeightChanged = false
            }
            textView.layoutParams = params
        }

        // Button 3: Toggle text
        button3.setOnClickListener {
            if (!isTextChanged) {
                textView.text = "Changed" // Change text
                isTextChanged = true
            } else {
                textView.text = "Counter: $counter" // Reset to counter text
                isTextChanged = false
            }
        }
    }
}
