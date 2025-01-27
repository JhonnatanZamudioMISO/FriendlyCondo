package com.ardc.friendlycondo.features.login
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * ## LoginState
 * This class represents the Login (Authentication) state for the application and its components.
 * @param userId The user's unique identifier.
 */


data class LoginState(var userId: String = "") {

    val isLoggedIn: Boolean
        get() = !userId.isNullOrBlank()

    /**
     * Authorizes an user by storing its identifier.
     */
    fun authorize(authorizedId: String): LoginState {
        if (authorizedId.isNullOrBlank()) throw IllegalArgumentException("Cannot authorize an empty user!")
        return copy(userId = authorizedId)
    }

    /**
     * Unauthorizes an user by removing its identifier.
     */
    fun unauthorize(): LoginState {
        return copy(userId = "")
    }

    /**
     * Authorizes an user by storing its identifier.
     */
    fun testingQA(authorizedId: String): LoginState {
        return copy(authorizedId)
    }

    suspend fun getUsers(dispatcher: CoroutineDispatcher = Dispatchers.IO): List<Any> {
        return withContext(dispatcher) {
            emptyList()
        }
    }
}