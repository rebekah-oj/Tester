package me.tap.tester.db.model

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import me.tap.tester.R
import me.tap.tester.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
                DataBindingUtil.setContentView<ActivityLoginBinding>(
                        this,
                        R.layout.activity_login
                )
                        .apply {
                            lifecycleOwner = this@LoginActivity
                            viewModel = this@LoginActivity.viewModel
                        }
        binding.login.setOnClickListener {
            startActivity(Intent(this, EmptyActivity::class.java))
        }
    }

}