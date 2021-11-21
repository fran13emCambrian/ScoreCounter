package com.example.scorecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    //companion object
    companion object ScoreValue{
        const val ZERO = 0
    }
    private lateinit var textViewHomeScore: TextView
    private lateinit var textViewAwayScore: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textViewHomeScore = findViewById(R.id.textViewHomeScore)
        textViewAwayScore = findViewById(R.id.textViewAwayScore)
    }

    //Create Menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu);
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


       val id = item.getItemId()
// Click on toast
      if (id== R.id.settings){
            Toast.makeText(this,"Settings Clicked", Toast.LENGTH_LONG).show()
            return true
        }

        if (id== R.id.info){
            Toast.makeText(this,"Code by Francisco Escobar", Toast.LENGTH_SHORT).show()
            Toast.makeText(this,"Course JAV 1001", Toast.LENGTH_SHORT).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }



    // functions to increment x1
    fun incrementHomeScore(view: View){
        val currentHomeScore = textViewHomeScore.text.toString()
        val incrementedHomeScore = currentHomeScore.toInt().inc()
        textViewHomeScore.text = incrementedHomeScore.toString()
    }

    fun incrementAwayScore(view: View){
        val currentAwayScore = textViewAwayScore.text.toString()
        val incrementedAwayScore = currentAwayScore.toInt().inc()
        textViewAwayScore.text = incrementedAwayScore.toString()
    }


    // functions to increment x2
    fun incrementHomeScoretwo(view: View){
        val currentHomeScoretwo = textViewHomeScore.text.toString()
        val incrementedHomeScoretwo = currentHomeScoretwo.toInt().inc()+1
        textViewHomeScore.text = incrementedHomeScoretwo.toString()
    }

    fun incrementAwayScoretwo(view: View){
        val currentAwayScoretwo = textViewAwayScore.text.toString()
        val incrementedAwayScoretwo = currentAwayScoretwo.toInt().inc()+1
        textViewAwayScore.text = incrementedAwayScoretwo.toString()
    }

// functions to decrease x1
    fun decrementHomeScore(view: View){
        val currentHomeScore = textViewHomeScore.text.toString()
        val decrementedHomeScore = currentHomeScore.toInt().dec()
        textViewHomeScore.text = decrementedHomeScore.toString()
    }

    fun decrementAwayScore(view: View){
        val currentAwayScore = textViewAwayScore.text.toString()
        val decrementedAwayScore = currentAwayScore.toInt().dec()
        textViewAwayScore.text = decrementedAwayScore.toString()
    }
//function to dreset
    fun resetScore(view: View){
        textViewHomeScore.text = ZERO.toString()
        textViewAwayScore.text = ZERO.toString()
    }

}