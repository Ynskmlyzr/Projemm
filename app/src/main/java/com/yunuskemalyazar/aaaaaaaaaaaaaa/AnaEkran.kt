package com.yunuskemalyazar.aaaaaaaaaaaaaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.yunuskemalyazar.aaaaaaaaaaaaaa.databinding.ActivityAnaekranBinding

class AnaEkran : AppCompatActivity() {
    private lateinit var binding: ActivityAnaekranBinding
    private var username: String =""
    private var surname:String =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAnaekranBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            username =intent.getStringExtra("isim").toString()
            surname = intent.getStringExtra("soyisim").toString()
            tvSevmek.text="Hoşgeldiniz"
        }
    }
}