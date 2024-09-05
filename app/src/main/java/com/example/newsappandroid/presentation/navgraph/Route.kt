package com.example.newsappandroid.presentation.navgraph

sealed class Route(val route: String) {
    object OnBoardingScreen : Route(route = "onBoardingScreen")
    object HomeScreen : Route(route = "homeScreen")
    object BookMarkScreen : Route(route = "bookmarkScreen")
    object DetailsScreen : Route(route = "detailsScreen")
    object AppStarNavigation : Route(route = "appStarNavigation")
    object NewsNavigation : Route(route = "newsNavigation")
    object NewsNavigatorScreen : Route(route = "news")
}