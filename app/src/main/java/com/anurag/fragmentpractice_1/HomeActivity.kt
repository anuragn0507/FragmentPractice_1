package com.anurag.fragmentpractice_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        startFirstFragment()

        button2.setOnClickListener {
            startFirstFragment()
        }
        button3.setOnClickListener {
                    startSecondFragment()
                }
    }

    private fun startFirstFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FirstFragment())
            .addToBackStack(null)
            .commit()
    }

    private fun startSecondFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, SecondFragment())
            .addToBackStack(null)
            .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
}