package com.example.divulgapet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

    class MainActivity : AppCompatActivity() {
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            supportActionBar?.hide()

            Handler(Looper.getMainLooper()).postDelayed({},5000)
            val enter = findViewById<Button>(R.id.bt_login)
            enter.setOnClickListener {
                irParaTelaPrincipal()
            }

            val cadastro = findViewById<Button>(R.id.bt_cadastro)
            cadastro.setOnClickListener {
                telaCadastro()
            }
        }

        private fun irParaTelaPrincipal() {
            val enter = Intent(this, Principal::class.java)
            startActivity(enter)
        }

        private fun telaCadastro() {
            val cad = Intent(this, Cadastro::class.java)
            startActivity(cad)
        }
    }
