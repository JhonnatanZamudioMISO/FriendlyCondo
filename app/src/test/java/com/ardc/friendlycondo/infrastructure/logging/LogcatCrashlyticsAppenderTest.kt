package com.ardc.friendlycondo.infrastructure.logging

import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito
import org.mockito.Mockito.*


/****
 * Project: FriendlyCondo
 * From: com.ardc.friendlycondo.infrastructure.logging
 * Created by Jhonnatan E. Zamudio P. on 8/11/2022 at 11:37 p. m.
 * All rights reserved 2022.
 */

class `Validando la clase LogcatCrashlyticsAppender` {
    private val mock: LogcatCrashlyticsAppender = mock(LogcatCrashlyticsAppender::class.java)

    @Test
    fun `Case 01`() {
        mock.formatPhone("3112949556")
        verify(mock).formatPhone("3112949556")
    }

    @Test
    fun `Case 02`() {
        mock.append(event = null)
        verify(mock).append(event = null)
    }

}