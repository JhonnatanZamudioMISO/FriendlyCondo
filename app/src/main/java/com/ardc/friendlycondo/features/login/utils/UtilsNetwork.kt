package com.ardc.friendlycondo.features.login.utils

import android.content.Context
import android.net.ConnectivityManager
import android.os.Build


/****
 * Project: kalunga
 * From: com.jhonnatan.kalunga.domain.models.utils
 * Created by Jhonnatan E. Zamudio P. on 2/07/2021 at 12:30 a. m.
 * More info:  https://venecambios-kalunga.com/
 * All rights reserved 2021.
 ****/

class UtilsNetwork {

    fun isOnline(context: Context?):Boolean{
        var result = false
        val cm = context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            result = true
        } else {
            cm?.run {
                @Suppress("DEPRECATION")
                result = true
            }
        }
        return result
    }

}