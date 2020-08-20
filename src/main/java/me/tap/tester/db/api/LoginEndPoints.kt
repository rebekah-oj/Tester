package me.tap.tester.db.api

import kotlinx.coroutines.Deferred
import me.tap.tester.db.model.LoginBody
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginEndPoints {

    @POST(" /login/organization")
    suspend fun sendLoginAsync(
            @Body body: LoginBody
    ): Deferred<LoginResponse>

    fun sendLoginAsync(): Deferred<LoginResponse>

}