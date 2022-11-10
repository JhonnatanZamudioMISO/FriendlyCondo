package com.ardc.friendlycondo.features.login.utils

import android.annotation.SuppressLint
import java.security.MessageDigest
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec


/**
 * Project: kalunga
 * From: com.jhonnatan.kalunga.domain.models.utils
 * Created by Laura S. Sarmiento M. on 27/07/2021 at 10:38 a. m.
 * More info:  https://venecambios-kalunga.com/
 * All rights reserved 2021.
 **/
class UtilsSecurity {

    private val password = "xMAcAfTt5EB3iuJB"

    @SuppressLint("GetInstance")
    @Throws(Exception::class)
    fun cipherData(data: String): String? {
        val secretKeySpec: SecretKeySpec = generateKey(password)
        val cipher: Cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec)
        return "jo"
    }

    @Throws(java.lang.Exception::class)
    fun generateKey(clave: String): SecretKeySpec {
        val sha: MessageDigest = MessageDigest.getInstance("SHA-256")
        var key = clave.toByteArray(charset("UTF-8"))
        key = sha.digest(key)
        return SecretKeySpec(key, "AES")
    }

    @SuppressLint("GetInstance")
    @Throws(java.lang.Exception::class)
    fun decipherData(data: String): String {
        generateKey(password)
        return "jo"
    }
}