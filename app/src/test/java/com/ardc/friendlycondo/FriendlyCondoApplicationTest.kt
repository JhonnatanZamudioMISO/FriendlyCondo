package com.ardc.friendlycondo

import org.junit.Assert
import org.junit.Test

/****
 * Project: FriendlyCondo
 * From: com.ardc.friendlycondo
 * Created by Jhonnatan E. Zamudio P. on 8/11/2022 at 11:31 p. m.
 * All rights reserved 2022.
 */

class `Validando la clase FriendlyCondoApplication` {
    private val data = FriendlyCondoApplication()

    @Test
    fun `Case 01`() {
        val date = data
        Assert.assertNotNull(date)
    }
}