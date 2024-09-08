package com.example.newsappandroid.presentation.home

data class HomeState(
    val newsTicker: String = "",
    val isLoading: Boolean = false,
)