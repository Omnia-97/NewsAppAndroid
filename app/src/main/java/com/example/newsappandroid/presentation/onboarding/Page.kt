package com.example.newsappandroid.presentation.onboarding

import androidx.annotation.DrawableRes

import com.loc.newsapp.R


data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Stay Updated",
        description = "Keep up with the latest news from around the world. Get instant updates on important events and featured articles.",
        image = R.drawable.onboarding1,
    ),
    Page(
        title = "Read Full Stories",
        description = "Enjoy reading detailed and comprehensive articles. Get all the details on the news that interests you.",
        image = R.drawable.onboarding2,
    ),
    Page(
        title = "Customize Your Experience",
        description = "Select your favorite topics to receive only the news that matters to you. Make your experience with us more personalized and convenient.",
        image = R.drawable.onboarding3,
    )
)