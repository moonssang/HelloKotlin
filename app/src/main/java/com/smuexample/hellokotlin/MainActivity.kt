package com.smuexample.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
     //var btnHello : Button
    //val btnHello : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJava  = findViewById<Button>(R.id.btnJava)
        val btnKotlin = findViewById<Button>(R.id.btnKotlin)
        val btnVarJava = findViewById<Button>(R.id.btnVarJava)
        val btnVarKotlin = findViewById<Button>(R.id.btnVarKotlin)
        val btnFlowControlJavaActivity = findViewById<Button>(R.id.btnFlowControlJava)
        val btnFlowControlKotlinActivity = findViewById<Button>(R.id.btnFlowControlKotlin)

        var intent : Intent

        btnJava.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }
        btnKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }

        btnVarJava.setOnClickListener {
            startActivity(Intent(this@MainActivity, VariableJavaActivity::class.java))
        }
        btnVarKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity, VariableKotlinActivity::class.java))
        }
        btnFlowControlJavaActivity.setOnClickListener {
            startActivity(Intent(this@MainActivity, FlowControlJavaActivity::class.java))
        }
        btnFlowControlKotlinActivity.setOnClickListener {
            startActivity(Intent(this@MainActivity, FlowControlKotlinActivity::class.java))
        }

        }
    }
