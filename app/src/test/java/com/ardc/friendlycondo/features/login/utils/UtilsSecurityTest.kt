package com.ardc.friendlycondo.features.login.utils

import org.junit.Assert
import org.junit.Test

/****
 * Project: FriendlyCondo
 * From: com.ardc.friendlycondo.features.login.utils
 * Created by Jhonnatan E. Zamudio P. on 9/11/2022 at 1:08 a. m.
 * All rights reserved 2022.
 */

class UtilsSecurityTest {
    val got = UtilsSecurity()

    @Test
    fun `Case 01`(): Unit {
        val data = got.cipherData("hola")
        Assert.assertNotNull(data)
    }

    @Test
    fun `Case 02`(): Unit {
        val data = got.decipherData("aloh")
        Assert.assertNotNull(data)
    }

    @Test
    fun `Case 03`(): Unit {
        val data = got.generateKey("password")
        Assert.assertNotNull(data)
    }
}