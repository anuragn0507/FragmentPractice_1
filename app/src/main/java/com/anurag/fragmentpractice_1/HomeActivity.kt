package com.anurag.fragmentpractice_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class HomeActivity : AppCompatActivity() {

    /*companion object{
        const val IMAGE_RESULT = RESULT_FIRST_USER
        const val  AUDIO_RESULT = RESULT_FIRST_USER + 1
    }*/

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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.first_item ->{
                Toast.makeText(this,"First item", Toast.LENGTH_LONG).show()
                true
            }
            R.id.second_item ->{
                Toast.makeText(this,"Second item", Toast.LENGTH_LONG).show()
                true
            }
            R.id.third_item ->{
                Toast.makeText(this,"Third item", Toast.LENGTH_LONG).show()
                true
            }R.id.fourth_item ->{
                Toast.makeText(this,"Fourth item", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}