package com.ardc.friendlycondo.features.login.utils

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.ardc.friendlycondo.infrastructure.logging.LoggingModule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/****
 * Project: FriendlyCondo
 * From: com.ardc.friendlycondo.features.login.utils
 * Created by Jhonnatan E. Zamudio P. on 9/11/2022 at 12:46 a. m.
 * All rights reserved 2022.
 */


class UtilsNetworkTest {

    val got = UtilsNetwork()

    @Test
    fun `Case 01`(): Unit {
        val data = got.isOnline(null)
        Assert.assertNotNull(data)
    }

}