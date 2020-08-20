package me.tap.tester.db.api

import me.tap.tester.db.model.Error
import me.tap.tester.db.model.Success

data class LoginResponse(
        val error: Error,
        val success: Success
)