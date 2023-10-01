package com.example.myapplication
import android.graphics.Color
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View) {
        //text gets displayed on button press
        var displayText : TextView = findViewById(R.id.textHello)
        displayText.setText("Hello World!")

    }

    fun toggleColor(view: View) {
            val colorButton = view as Button
        //possible colors defined
            val colors = arrayOf(Color.RED, Color.GREEN, Color.BLUE)
        //finds current color
            val currentColor = colorButton.currentTextColor
            val currentIndex = colors.indexOf(currentColor)
        //changes color to next color in array
            val nextIndex = (currentIndex + 1) % colors.size
            colorButton.setTextColor(colors[nextIndex])
        }
    }
