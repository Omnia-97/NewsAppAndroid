package com.example.newsappandroid.data.remote.dto

import com.example.newsappandroid.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)