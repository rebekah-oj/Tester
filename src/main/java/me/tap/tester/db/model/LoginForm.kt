package me.tap.tester.db.model

import androidx.lifecycle.MutableLiveData

data class LoginForm(
        var userName: String = "",
        var passWord: String = ""
) {

    val userNameError = MutableLiveData<String>()
    val passWordError = MutableLiveData<String>()
}