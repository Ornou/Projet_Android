package com.example.merrylornelle
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class SerieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serie_detail)

        showHistoryFragment()

        findViewById<View>(R.id.btnHistory).setOnClickListener {
            showHistoryFragment()
        }

        findViewById<View>(R.id.btnCharacters).setOnClickListener {
            showCharactersFragment()
        }

        findViewById<View>(R.id.btnEpisodes).setOnClickListener {
            showEpisodesFragment()
        }
    }

    private fun showHistoryFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, HistoryFragment())
            .commit()
    }

    private fun showCharactersFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, CharactersFragment())
            .commit()
    }

    private fun showEpisodesFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, EpisodesFragment())
            .commit()
    }
}