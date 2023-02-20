package com.example.netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class PaginaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_principal)

        var perfil = findViewById<ImageView>(R.id.perfil)
        var frase = intent.getStringExtra("perfil")
        var cambio : Intent

        when(frase){
            "tigre" -> perfil.setImageResource(R.drawable.tigre)
            "hija" -> perfil.setImageResource(R.drawable.laura)
            "papa" -> perfil.setImageResource(R.drawable.papa)
            "mama" -> perfil.setImageResource(R.drawable.mama)
        }

        perfil.setOnClickListener(){
            cambio=Intent(this, MainActivity::class.java)
            startActivity(cambio)
        }

    }
}