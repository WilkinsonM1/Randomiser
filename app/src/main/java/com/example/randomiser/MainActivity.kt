package com.example.randomiser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val titleView = findViewById<TextView>(R.id.titleView
        )

        rollButton.setOnClickListener {
            var rand = 0

            if(seekBar.progress == 0) {
               rand = 0
            } else {
                rand = Random.nextInt(seekBar.progress) + 1
            }

            resultsTextView.text = rand.toString()
        }
    }
}
