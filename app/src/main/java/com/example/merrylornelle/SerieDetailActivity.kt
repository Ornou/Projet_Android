package com.example.merrylornelle
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class SerieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_detail_serie)

        // Afficher par défaut le fragment de l'histoire
        showHistoryFragment()

        // Gérer les clics sur les boutons
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
        // Supposons que serie.story contient le texte de l'histoire
        val serie = intent.getParcelableExtra<Parcelable>("serie")
        val historyFragment = HistoryFragment().apply {
            arguments = Bundle().apply {
                putParcelable("serie", serie)
            }
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, historyFragment)
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

