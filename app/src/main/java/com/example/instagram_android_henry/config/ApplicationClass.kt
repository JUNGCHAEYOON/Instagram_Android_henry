package com.example.instagram_android_henry.config

import android.app.Application
import android.content.SharedPreferences

class ApplicationClass : Application() {

    // 전역변수
    companion object{

        // 앱 실행시 사용할 SharedPreference 객체, 이 변수만 사용합니다 다른거 만들지 마!
        lateinit var sSharedPreferences: SharedPreferences

        // 파이어베이스 연동시 사용할 토큰 등
    }

    // 앱실행시 액티비티 실행보다 먼저 실행되는 onCreate, SP 객체 생성
    override fun onCreate() {
        super.onCreate()
        sSharedPreferences = applicationContext.getSharedPreferences("HENRY_TEMPLATE_APP", MODE_PRIVATE)
    }
}