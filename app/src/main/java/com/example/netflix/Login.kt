package com.example.netflix

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(1500)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var cambioRegistro : Intent

        var registro = findViewById<TextView>(R.id.registro)
        var login = findViewById<Button>(R.id.login)


        registro.setOnClickListener(){
            cambioRegistro = Intent(this, Registro::class.java)
            startActivity(cambioRegistro)
        }

        login.setOnClickListener(){
            cambioRegistro=Intent(this, PaginaPrincipal::class.java)
            startActivity(cambioRegistro)
        }

    }
}