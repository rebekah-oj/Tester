package me.tap.tester.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import me.tap.tester.db.model.Login

@Database(entities = [Login::class], version = 1)
abstract class LoginDatabase(applicationContext: Context) : RoomDatabase() {

    abstract fun loginDao(): LoginDao

    companion object {
        @Volatile
        private var INSTANCE: LoginDatabase? = null

        fun getDatabase(context: Context): LoginDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        LoginDatabase::class.java, "Login-database"
                ).build()
                INSTANCE = instance
                return instance

            }
        }
    }
}