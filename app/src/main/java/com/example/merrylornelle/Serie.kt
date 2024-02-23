package com.example.merrylornelle

data class Serie(
    val name: String,
    val date: String,
    val story: String,
    val characters: List<String>,
    val numberOfEpisodes: Int
)