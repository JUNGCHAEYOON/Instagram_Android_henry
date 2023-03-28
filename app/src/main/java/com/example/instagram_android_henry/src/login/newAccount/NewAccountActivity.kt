package com.example.instagram_android_henry.src.login.newAccount

import android.os.Bundle
import android.util.Log
import com.example.instagram_android_henry.config.ApplicationClass
import com.example.instagram_android_henry.config.ApplicationClass.Companion.auth
import com.example.instagram_android_henry.config.BaseActivity
import com.example.instagram_android_henry.databinding.ActivityNewAccountBinding
import com.google.firebase.FirebaseException
import com.google.firebase.FirebaseTooManyRequestsException
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthOptions
import com.google.firebase.auth.PhoneAuthProvider
import java.util.concurrent.TimeUnit

class NewAccountActivity : BaseActivity<ActivityNewAccountBinding>(ActivityNewAccountBinding::inflate){

    // 전역변수
    val TAG = "NewAccountActivity"
    lateinit var phoneNumber : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //뒤로가기 버튼
        binding.newaccountBtnBack.setOnClickListener {
            finish()
        }
    }

    override fun onResume() {
        super.onResume()

        // 다음 버튼
        binding.newaccountBtnNext.setOnClickListener {
            //전화번호 저장 및 인증
            //인증된경우 NewAccountNameActivity 로 이동
            phoneNumber = binding.newaccountEtvPhoneNumber.text.toString()
        }
    }


}