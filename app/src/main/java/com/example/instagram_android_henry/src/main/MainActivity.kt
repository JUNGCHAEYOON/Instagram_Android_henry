package com.example.instagram_android_henry.src.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.instagram_android_henry.R
import com.example.instagram_android_henry.config.BaseActivity
import com.example.instagram_android_henry.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate){
    override fun onCreate(savedInstanceState: Bundle?,) {
        super.onCreate(savedInstanceState)

        //add버튼은 액티비티 이동 왼쪽으로
//        val intentAdd = Intent(this,AddActivity::class.java)

        //바텀네비 클릭
        binding.mainBnv.run{
            setOnItemSelectedListener { item ->
                when(item.itemId){
                    R.id.main_btn_nav_home->{
                        showCustomToast("홈")
                    }
                    R.id.main_btn_nav_search->{
                        showCustomToast("검색")
                    }
                    R.id.main_btn_nav_add->{
                        showCustomToast("글쓰기")
                    }
                    R.id.main_btn_nav_reals->{
                        showCustomToast("릴스")
                    }
                    R.id.main_btn_nav_profile->{
                        showCustomToast("프로필")
                    }
                }
                true
            }
            selectedItemId = R.id.main_btn_nav_home
        }
    }
}

