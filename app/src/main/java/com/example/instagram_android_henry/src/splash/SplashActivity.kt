package com.example.instagram_android_henry.src.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PersistableBundle
import com.example.instagram_android_henry.config.BaseActivity
import com.example.instagram_android_henry.databinding.ActivitySplashBinding
import com.example.instagram_android_henry.src.login.LoginActivity
import com.example.instagram_android_henry.src.main.MainActivity

class SplashActivity : BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler(Looper.getMainLooper()).postDelayed({
            // 자동로그인이 안되는경우

            startActivity(Intent(this,LoginActivity::class.java))

            // 자동로그인이 되는경우
//            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 1500)
    }
}