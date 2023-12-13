package com.example.divulgapet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Principal : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    private val homeFragment = FeedFragment()
    private val eventosFragment = EventosFragment()
    private val perfilFragment = PerfilFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        // Define o fragmento inicial
        setCurrentFragment(homeFragment)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    setCurrentFragment(homeFragment)
                    //showToast("Home")
                    true
                }
                R.id.nav_noticia -> {
                    setCurrentFragment(eventosFragment)
                    //showToast("Feed")
                    true
                }
                R.id.nav_profile -> {
                    setCurrentFragment(perfilFragment)
                    //showToast("Pesquisar")
                    true
                }
                else -> false
            }
        }

    }
    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragment)
            commit()
        }
    }
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}