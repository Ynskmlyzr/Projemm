package com.yunuskemalyazar.aaaaaaaaaaaaaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.yunuskemalyazar.aaaaaaaaaaaaaa.databinding.ActivityKayitEkraniBinding
import com.yunuskemalyazar.aaaaaaaaaaaaaa.databinding.ActivityMainBinding

class KayitEkrani : AppCompatActivity() {
    private lateinit var binding: ActivityKayitEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityKayitEkraniBinding.inflate(layoutInflater)
        setContentView(binding.root)
         binding.apply {
             btnKayitol.setOnClickListener {
                 if (kontrol()) {
                     var intentkayit = Intent(this@KayitEkrani, AnaEkran::class.java)
                     intent.putExtra("isim",tEtIsim.text.toString())
                     intent.putExtra("soyisim",tEtSoyisim.text.toString())
                     startActivity(intentkayit)
                 }
             }
         }
    }
    private fun kontrol()  : Boolean{
        var kontroll = true
        if(binding.tEtIsim.text!!.isEmpty()){
            Toast.makeText(applicationContext, "Lütfen İsminizi Boş Bırakmayınız", Toast.LENGTH_SHORT).show()
            kontroll=false
        }
        else if (binding.tEtSoyisim.text!!.isEmpty()){
            Toast.makeText(applicationContext, "Lütfen Soyisminizi Boş Bırakmayınız", Toast.LENGTH_SHORT).show()
            kontroll=false
        }
        else if (binding.tEtEposta.text!!.isEmpty()){
            Toast.makeText(applicationContext, "Lütfen Eposta Adresiniz Boş Bırakmayınız", Toast.LENGTH_SHORT).show()
            kontroll=false
        }
        else if (binding.tEtSifre.text!!.isEmpty()){
            Toast.makeText(applicationContext, "Lütfen Şifrenizi Boş Bırakmayınız", Toast.LENGTH_SHORT).show()
            kontroll=false
        }

       return kontroll
    }
}