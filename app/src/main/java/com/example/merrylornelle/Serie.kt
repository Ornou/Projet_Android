package com.example.merrylornelle
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class Serie(
    val name: String,
    val date: String,
    val story: String,
    val characters: List<String>,
    val numberOfEpisodes: Int
): Parcelable