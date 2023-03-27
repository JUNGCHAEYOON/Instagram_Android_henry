package com.example.instagram_android_henry.src.login

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import com.example.instagram_android_henry.config.BaseActivity
import com.example.instagram_android_henry.databinding.ActivityLoginBinding
import com.example.instagram_android_henry.src.main.MainActivity

class LoginActivity : BaseActivity<ActivityLoginBinding>(ActivityLoginBinding::inflate){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 내계정
        binding.loginBtnMyaccount.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        // 다른 계정으로 로그인
        binding.loginBtnAnotheraccount.setOnClickListener {
            showCustomToast("다른 계정으로 로그인!")
        }

        // 새계정 만들기
        binding.loginBtnNewaccount.setOnClickListener {
            showCustomToast("새 계정 만들기!")
        }
    }
}