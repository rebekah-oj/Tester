package me.tap.tester.db.model

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import me.tap.tester.db.api.ServiceBuilder


class LoginViewModel(application: Application) : AndroidViewModel(application) {
    private val form = LoginForm()

    private val response = MutableLiveData<LoginBody>()

    val _response: LiveData<LoginBody>
        get() = response

    private fun isFormFilled(): Boolean = with(form) {
        userName.isNotEmpty() && passWord.isNotEmpty()
    }

    private fun showError() = with(form) {
        when {
            userName.isEmpty() -> {
                form.userNameError.value = "This field is required"
            }
            passWord.isEmpty() -> {
                form.passWordError.value = "This field is required"
            }
        }
    }

    private fun sendLoginAsync(loginBody: LoginBody) {
        val sendLoginDeferred = ServiceBuilder.retrofitService.sendLoginAsync()
        try {
            val result = sendLoginDeferred
            response.value = LoginBody(response)
        } catch (e: Exception) {
            response.value = LoginBody(error("Login failed"))
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("LoginViewModel", "LoginViewModel destroyed!")
    }
}