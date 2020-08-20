package me.tap.tester.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import me.tap.tester.db.model.Data
import me.tap.tester.db.model.Login

@Dao
interface LoginDao {
    @Query("SELECT * FROM Login")
    fun getAllField(): LiveData<List<Login>>

    @Insert
    fun save(data: Data)

    @Delete
    fun delete(login: Login)
}