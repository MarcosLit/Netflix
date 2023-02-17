package com.example.netflix

import android.annotation.SuppressLint
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

        Toast.makeText(this,hijo.background.toString(), Toast.LENGTH_SHORT).show()
    }
}