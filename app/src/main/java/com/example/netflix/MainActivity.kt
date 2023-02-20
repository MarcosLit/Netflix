package com.example.netflix

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Netflix)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var hijo = findViewById<ImageButton>(R.id.usuarioHijo)
        var hija = findViewById<ImageButton>(R.id.usuarioHija)
        var papa = findViewById<ImageButton>(R.id.usuarioPapa)
        var mama = findViewById<ImageButton>(R.id.usuarioMama)
        var cambio : Intent
        var frase : String

        hijo.setOnClickListener(){
            frase="tigre"
            cambio=Intent(this, PaginaPrincipal::class.java)
            cambio.putExtra("perfil", frase)
            startActivity(cambio)
        }

        hija.setOnClickListener(){
            frase="hija"
            cambio=Intent(this, PaginaPrincipal::class.java)
            cambio.putExtra("perfil", frase)
            startActivity(cambio)
        }

        papa.setOnClickListener(){
            frase="papa"
            cambio=Intent(this, PaginaPrincipal::class.java)
            cambio.putExtra("perfil", frase)
            startActivity(cambio)
        }

        mama.setOnClickListener(){
            frase="mama"
            cambio=Intent(this, PaginaPrincipal::class.java)
            cambio.putExtra("perfil", frase)
            startActivity(cambio)
        }

    }
}