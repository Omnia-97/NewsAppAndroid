package com.example.newsappandroid.domain.usecases

import com.example.newsappandroid.domain.usecases.appEntry.ReadAppEntry
import com.example.newsappandroid.domain.usecases.appEntry.SaveAppEntry


data class AppEntryUseCases(
 val readAppEntry: ReadAppEntry,
 val saveAppEntry: SaveAppEntry
)
