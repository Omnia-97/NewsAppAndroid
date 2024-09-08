package com.example.newsappandroid.presentation.bookMark

import com.example.newsappandroid.domain.model.Article

data class BookMarkState(
    val articles: List<Article> = emptyList()
)