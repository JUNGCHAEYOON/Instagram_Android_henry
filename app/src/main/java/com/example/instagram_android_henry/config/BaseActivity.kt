package com.example.instagram_android_henry.config

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

class BaseActivity<B : ViewBinding>(private val inflate : (LayoutInflater) -> B) : AppCompatActivity(){
    protected lateinit var binding : B
        private set

    // 뷰바인딩 객체를 inflate 하여 화면구성
    // 매번 setContentView 할필요도 없고 바인딩 바로 사용가능함
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)
    }

    // 토스트를 쉽게 띄울 수 있게 해줌.
    fun showCustomToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}