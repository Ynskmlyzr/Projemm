package com.yunuskemalyazar.aaaaaaaaaaaaaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yunuskemalyazar.aaaaaaaaaaaaaa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
           btKayit.setOnClickListener{
               var kayit = Intent(this@MainActivity,KayitEkrani::class.java)
               startActivity(kayit)
           }
            btGiris.setOnClickListener {
                var ana = Intent(this@MainActivity,AnaEkran::class.java)
                startActivity(ana)
            }
        }
    }
}