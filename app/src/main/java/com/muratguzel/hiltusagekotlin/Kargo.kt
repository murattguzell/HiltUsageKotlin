package com.muratguzel.hiltusagekotlin

import android.util.Log
import javax.inject.Inject

class Kargo @Inject constructor (var adres: Adres) {
    fun gonder(){
        Log.d("Sonuç","kargo ${adres.adresBilgisi} adresine gönderildi")
    }
}