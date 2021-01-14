package com.dev.kotlinmvvmapp.repository

import androidx.lifecycle.LiveData
import com.dev.kotlinmvvmapp.model.User
import kotlinx.coroutines.CompletableJob

object Repository {

    var job: CompletableJob? = null

    fun getUser(userId: String): LiveData<User>{
        return object: LiveData<User>(){
            override fun onActive() {
                super.onActive()
            }
        }
    }
}