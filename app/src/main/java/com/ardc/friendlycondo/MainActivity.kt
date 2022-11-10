package com.ardc.friendlycondo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.ardc.friendlycondo.features.login.LoginState
import dagger.hilt.android.AndroidEntryPoint
import org.slf4j.Logger
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var log: Logger
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log.debug("Initializing, now with 101% more HILT")
    }
}
@Composable
fun AppCanvas(content: @Composable () -> Unit) {
    val login = content
    println(login.toString())
}

@Composable
fun Greeting(log: Logger? = null) {
    var loginState by remember {
        mutableStateOf(LoginState())
    }
            loginState =
                if (loginState.isLoggedIn)
                    loginState.unauthorize()
                else loginState.authorize(log.toString())
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    println("Validando")
}