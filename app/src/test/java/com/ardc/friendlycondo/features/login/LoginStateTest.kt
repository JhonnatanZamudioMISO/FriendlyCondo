@file:Suppress("ClassName")

package com.ardc.friendlycondo.features.login

import kotlinx.coroutines.*
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class `Given an User is Authorized` {
    private val subject = LoginState("anUser")

    @Test
    fun `Case 01`() {
        subject.isLoggedIn.let {
            Assert.assertTrue(it)
        }
    }

    @Test
    fun `Case 02`(): Unit {
        val got = subject.unauthorize()
        got.isLoggedIn.let {
            Assert.assertFalse(it)
        }
    }
}

@ExperimentalCoroutinesApi
class `Given an User is not Authorized` {
    private val subject = LoginState()
    private val mainThreadSurrogate = newSingleThreadContext("UI thread")

    @Before
    fun setup() {
        Dispatchers.setMain(mainThreadSurrogate)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `Case 03`(): Unit {
        subject.isLoggedIn.let {
            Assert.assertFalse(it)
        }
    }

    @Test
    fun `Case 04`(): Unit {
        val anId = "pudim"
        val got = subject.authorize(anId)
        got.isLoggedIn.let {
            Assert.assertTrue(it)
        }
    }

    @Test
    fun `Case 05`(): Unit {
        Assert.assertThrows(IllegalArgumentException::class.java) {
            subject.authorize("")
        }
    }

    @Test
    fun `Case 06`(): Unit {
        val got = subject.authorize("hola")
        Assert.assertNotNull(got)
    }

    @Test
    fun `Case 07`(): Unit {
        val got = subject.testingQA("hola")
        Assert.assertNotNull(got)
    }

    @Test
    fun `Caso 08`(): Unit = runBlocking {
        launch(Dispatchers.Main) {
            val data = subject.getUsers()
            Assert.assertNotNull(data)
        }
    }
}
