package com.example.divulgapet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cadastro : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        supportActionBar?.hide()

        val cadastrar = findViewById<Button>(R.id.bt_cadastrar)
        cadastrar.setOnClickListener {
            irParaTelaPrincipal()
        }
    }

    private fun irParaTelaPrincipal() {
        val enter = Intent(this, Principal::class.java)
        startActivity(enter)
    }
}