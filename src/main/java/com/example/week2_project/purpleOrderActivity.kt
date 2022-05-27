package com.example.week2_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week2_project.databinding.ActivityMainBinding

class purpleOrderActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}