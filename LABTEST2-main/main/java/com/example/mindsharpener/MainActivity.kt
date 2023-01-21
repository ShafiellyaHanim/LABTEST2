package com.example.mindsharpener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getSupportActionBar().setTitle("Mind Sharpener");
        val textView1 = findViewById<View>(R.id.tv4) as TextView
        val textView2 = findViewById<View>(R.id.tv5) as TextView
        val textView3 = findViewById<View>(R.id.tv6) as TextView

        val radio_grp = findViewById(R.id.radioGroup) as RadioGroup
        val radioButton1 = findViewById<View>(R.id.rb1) as RadioButton
        val radioButton2 = findViewById<View>(R.id.rb2) as RadioButton
        val radioButton3 = findViewById<View>(R.id.rb3) as RadioButton

        val button1Listener = View.OnClickListener {
            val myRandomValues = Random.nextInt(0, 10)
            val myRandomValues2 = Random.nextInt(0, 10)
            textView1.text = myRandomValues.toString()
            textView2.text = myRandomValues.toString()
            textView3.text = myRandomValues.toString()
        }

        val button2Listener: View.OnClickListener = View.OnClickListener {
            fun onClick(view: View){
            val myRandomValues = Random.nextInt(11, 100)
            val myRandomValues2 = Random.nextInt(11, 100)
            textView1.text = myRandomValues.toString()
            textView2.text = myRandomValues.toString()
            textView3.text = myRandomValues.toString()
        }
    }

        val button3Listener: View.OnClickListener = View.OnClickListener {
            fun onClick(view: View){
                val myRandomValues = Random.nextInt(101, 1000)
                val myRandomValues2 = Random.nextInt(101, 1000)
                textView1.text = myRandomValues.toString()
                textView2.text = myRandomValues.toString()
                textView3.text = myRandomValues.toString()
            }
        }


        radioButton1.setOnClickListener(button1Listener);
        radioButton2.setOnClickListener(button2Listener);
        radioButton3.setOnClickListener(button3Listener);
    }
    }


