package com.muratguzel.hiltusagekotlin

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor (var adres: Adres) {
    fun basvuruYap(){
        Log.d("Sonuç","İnternet başvurusu ${adres.adresBilgisi} adresine yapıldı")
    }
}