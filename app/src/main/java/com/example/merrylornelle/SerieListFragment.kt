package com.example.merrylornelle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SerieListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var serieAdapter: SerieAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_serie_list, container, false)

        recyclerView = view.findViewById(R.id.recyclerViewSeries)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        serieAdapter = SerieAdapter(createFakeSeries())
        recyclerView.adapter = serieAdapter

        return view
    }

    private fun createFakeSeries(): List<Serie> {
        return listOf(
            Serie("Agents of S.H.I.E.L.D", "2013", "Histoire de la série ", listOf("Jemma Simmons", "Quake","Melinda May"),136),
            Serie("The walking Dead", "2010", "Histoire de la série ", listOf("Daryl", "Rick Grimes"),177),
            Serie("Naruto Shippudden", "2007", "Histoire de la série ", listOf("Naruto Uzumaki", "Sasuke Uchiha"),500),
            Serie("Demon Slayer", "2019", "Histoire de la série ", listOf("Kibutsuji Muzan", "Tanjiro Kamado"),55),
            Serie("Mashle", "2023", "Histoire de la série ", listOf("Mash Burnedead", "Finn Ames"),15),
            Serie("Chainsaw Man", "2022", "Histoire de la série ", listOf("Makima", "Aki Hayakawa"),12),
            Serie("Tom and Jerry", "1940", "Histoire de la série ", listOf("Tom", "Jerry"),161),
            Serie("Vinland Saga", "2019", "Histoire de la série ", listOf("Askeladd", "Bjorn"),35),
            Serie("Wednesday", "2022", "Histoire de la série ", listOf("Wednesday", "Thing"),8),
            Serie("SPY x Family", "2022", "Histoire de la série ", listOf("Anya Forger", "Loid Forger"),12),
        )
    }
}