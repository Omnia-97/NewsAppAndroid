# News App 📰

Welcome to the **News App**, your go-to app for the latest news from around the world! Stay informed with our seamless and modern interface, built using **Android Jetpack Compose** and following **MVVM**, **MVI**, and **Clean Architecture** principles. You can view, search, save, share, and even bookmark news articles to stay up-to-date.

## Table of Contents 📜
- [Features](#features) ✨
- [Screenshots](#screenshots) 📸
- [Technologies Used](#technologies-used) 🛠️
- [Architecture](#architecture) 🏗️
- [Installation](#installation) ⚙️
- [Contributing](#contributing) 🤝
- [Contact](#contact) 📧

---

<a id="features"></a>
## Features ✨

- 🔍 **Search News**: Quickly search for news articles by keywords.
- 📰 **View Latest News**: Stay updated with a list of the latest news articles.
- 🔖 **Bookmark News**: Save articles to read later with the bookmark feature.
- 📤 **Share News**: Easily share articles with friends via other apps.
- 🌐 **Read Full Article**: Open the complete article in a web browser with just one tap.

---

<a id="screenshots"></a>
## Screenshots 📸

<div align="center">
  <img src="https://via.placeholder.com/300x600" alt="News List Screen" width="250" />
  <img src="https://via.placeholder.com/300x600" alt="News Details Screen" width="250" />
  <img src="https://via.placeholder.com/300x600" alt="Bookmarks Screen" width="250" />
</div>

---

<a id="technologies-used"></a>
## Technologies Used 🛠️

- 📱 **Kotlin**: For Android app development.
- 🎨 **Jetpack Compose**: For building the UI with a declarative approach.
- 🏛️ **MVVM (Model-View-ViewModel)**: Ensures a separation of concerns and clean UI logic.
- 🔄 **MVI (Model-View-Intent)**: Provides a unidirectional data flow for managing state immutably.
- 🏗️ **Clean Architecture**: Modular and testable code organization.
- 📡 **Retrofit**: For making API calls to fetch news data.
- 🗂️ **Room Database**: Local storage for saving bookmarked news articles.
- 📄 **Paging 3**: For efficiently handling large datasets and paginated news lists.
- ⚙️ **Dagger-Hilt**: For dependency injection.
- ⚡ **Coroutines & Flow**: To handle asynchronous tasks and data streams.
- 💾 **DataStore Preferences**: For managing user settings and preferences.

---

<a id="architecture"></a>
## Architecture 🏗️

This project follows a combination of **MVVM** and **MVI** architectures along with **Clean Architecture** principles to ensure modularity, scalability, and maintainability.

- **MVVM** (Model-View-ViewModel) separates the UI and business logic, ensuring ease of maintenance.
- **MVI** (Model-View-Intent) helps manage a unidirectional flow of data and state using immutable state objects.
- **Clean Architecture** divides the codebase into:
  - **Domain Layer**: Business logic and use cases.
  - **Data Layer**: Handling network and local data sources, including Retrofit, Room, and DataStore.
  - **Presentation Layer**: UI components, ViewModels, and state management using Jetpack Compose.

---

<a id="installation"></a>
## Installation ⚙️

To get started with the project locally, follow these steps:

### Prerequisites 📋
Ensure you have the following tools installed:
- [Android Studio](https://developer.android.com/studio)
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Git](https://git-scm.com)

### Steps to Install 🌀

1. Clone the repository:

   ```bash
   git clone https://github.com/username/news-app.git
   cd news-app
