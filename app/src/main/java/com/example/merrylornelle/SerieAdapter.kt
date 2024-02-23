package com.example.merrylornelle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
class SerieAdapter(private val series: List<Serie>) : RecyclerView.Adapter<SerieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_serie, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val serie = series[position]

        // Utiliser Glide pour charger l'image depuis l'URL
        Glide.with(holder.itemView.context)
            .load("https://images.app.goo.gl/WMfGTSTMMVftFeaD7") // Remplacer serie.imageUrl par le champ approprié de votre modèle Serie
            .placeholder(R.drawable.astronaut) // Image de remplacement en cas de chargement ou d'erreur
            .into(holder.imageViewSerie)
        holder.bind(serie)
    }

    override fun getItemCount(): Int {
        return series.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val txtName: TextView = itemView.findViewById(R.id.txtName)
        private val txtDate: TextView = itemView.findViewById(R.id.txtYear)
        private val txtEpisodes: TextView = itemView.findViewById(R.id.txtEpisodes)
        val imageViewSerie: ImageView = itemView.findViewById(R.id.imageViewSerie)
        fun bind(serie: Serie) {
            txtName.text = serie.name
            txtDate.text = serie.date
            txtEpisodes.text = "Number of Episodes: ${serie.numberOfEpisodes}"
        }
    }
}