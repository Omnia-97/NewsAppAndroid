package com.example.newsappandroid.domain.usecases.appEntry

import com.example.newsappandroid.domain.manager.LocalUserManger
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

class SaveAppEntry @Inject constructor(
    private val localUserManger: LocalUserManger
) {

    suspend operator fun invoke() {
        localUserManger.saveAppEntry()
    }

}