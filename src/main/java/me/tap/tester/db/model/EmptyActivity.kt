package me.tap.tester.db.model

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.tap.tester.R

class EmptyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)
    }
}