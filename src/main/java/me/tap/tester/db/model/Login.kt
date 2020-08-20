package me.tap.tester.db.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Login(
        @PrimaryKey
        @ColumnInfo(name = "Password") val Password: String,
        @ColumnInfo(name = "Username") val Username: String
)