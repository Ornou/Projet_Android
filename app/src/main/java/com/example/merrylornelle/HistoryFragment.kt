package com.example.merrylornelle
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
class HistoryFragment : Fragment() {

    private lateinit var txtHistory: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_history, container, false)
        txtHistory = view.findViewById(R.id.txtHistory)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val serie = arguments?.getParcelable<Serie>("serie")


        txtHistory.text = serie?.story ?: "Aucune histoire disponible"
    }
}