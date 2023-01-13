package com.kegri.kegculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    var birinciSayi : Double? = null
    var ikinciSayi : Double? = null
    var sonuc : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toplama(view: View) {
        birinciSayi = editText.text.toString().toDoubleOrNull()
        ikinciSayi = editText2.text.toString().toDoubleOrNull()

        if (birinciSayi == null || ikinciSayi == null) {
            sonucText.text = "Bir sayı girmediniz."
        } else {
            sonuc = birinciSayi!! + ikinciSayi!!
            sonucText.text = "Sonuç: ${sonuc}"
        }
    }

    fun cikartma(view: View) {
        birinciSayi = editText.text.toString().toDoubleOrNull()
        ikinciSayi = editText2.text.toString().toDoubleOrNull()

        if (birinciSayi == null || ikinciSayi == null) {
            sonucText.text = "Bir sayı girmediniz."
        } else {
            sonuc = birinciSayi!! - ikinciSayi!!
            sonucText.text = "Sonuç: ${sonuc}"
        }
    }

    fun carpma(view: View) {
        birinciSayi = editText.text.toString().toDoubleOrNull()
        ikinciSayi = editText2.text.toString().toDoubleOrNull()

        if (birinciSayi == null || ikinciSayi == null) {
            sonucText.text = "Bir sayı girmediniz."
        } else {
            sonuc = birinciSayi!! * ikinciSayi!!
            sonucText.text = "Sonuç: ${sonuc}"
        }
    }

    fun bolme(view: View) {
        birinciSayi = editText.text.toString().toDoubleOrNull()
        ikinciSayi = editText2.text.toString().toDoubleOrNull()

        if (birinciSayi == null || ikinciSayi == null) {
            sonucText.text = "Bir sayı girmediniz."
        } else {
            sonuc = birinciSayi!! / ikinciSayi!!
            sonucText.text = "Sonuç: ${sonuc}"
        }
    }
}