package com.harakiriop.androidmaster.firstApp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.harakiriop.androidmaster.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val resultView = findViewById<TextView>(R.id.resultView)
//      Aca llamamos a que si ese intent tiene un extras que es como la peticion de esa clase
//      
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        println("name")
        println(name)
        resultView.text = "hola $name"
    }
}