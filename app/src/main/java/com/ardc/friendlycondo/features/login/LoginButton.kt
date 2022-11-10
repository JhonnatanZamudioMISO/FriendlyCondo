package com.ardc.friendlycondo.features.login

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * ## LoginButton
 * Allows an user to log into the application.
 * @param state current state of login within the App
 * @param onButtonClicked delegate to execute when the button is clicked
 */
@Composable
fun LoginButton(
    state: LoginState,
    onButtonClicked: () -> Unit
) {
    Button(
        onClick = onButtonClicked,
        modifier = Modifier
            .fillMaxWidth()
            .height(58.dp)
    ) {
       Spacer(Modifier.width(16.dp))
        println(state)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtons() {
    val prueba = false
}