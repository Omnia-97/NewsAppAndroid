package com.example.newsappandroid.presentation.mainActivity

import com.example.newsappandroid.domain.usecases.appEntry.ReadAppEntry
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val readAppEntry: ReadAppEntry
) {

}