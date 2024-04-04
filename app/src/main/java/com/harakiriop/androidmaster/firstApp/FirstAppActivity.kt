package com.harakiriop.androidmaster.firstApp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.harakiriop.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    //onCreate is equal than fun main(), is the first my app execute
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStart = findViewById<AppCompatButton>(R.id.buttonEvent)
        val inputUser = findViewById<AppCompatEditText>(R.id.userInput)
        btnStart.setOnClickListener {
            val name = inputUser.text.toString()
            if(name.isNotEmpty()){
//              1- El intent lo que hace es llamar la clase ResultActivity, ya sea para recibir
//              datos de esa clase o como en este caso para enviar.
                val intent = Intent(this, ResultActivity::class.java)
//              2- El intent cuando lo llamemos la pasaremos una clave y la variable en el cual
//                 enviaremos nuestra variable que queremos que la use a la clase destino o pantalla
//                 destino
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }

    }
}