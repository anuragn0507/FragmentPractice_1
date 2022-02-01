package com.anurag.fragmentpractice_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class DrawerActivity : AppCompatActivity() {
    lateinit var  drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawer)

        drawerLayout = findViewById(R.id.drawer_layout)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationView: NavigationView = findViewById(R.id.navigation_view)

        val drawerToggle =
            ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        navigationView.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.first -> {
                    Toast.makeText(this, " First", Toast.LENGTH_LONG).show()
                }
                R.id.second -> {
                    Toast.makeText(this, " Second", Toast.LENGTH_LONG).show()
                }
                R.id.third -> {
                    Toast.makeText(this, "Third", Toast.LENGTH_LONG).show()
                }
                R.id.fourth -> {
                    Toast.makeText(this, "Fourth", Toast.LENGTH_LONG).show()
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }

        override fun onBackPressed() {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                super.onBackPressed()
            }
        }
    }
