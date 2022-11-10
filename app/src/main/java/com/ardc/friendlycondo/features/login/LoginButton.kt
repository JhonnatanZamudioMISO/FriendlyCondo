package com.ardc.friendlycondo.features.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginButton(
    state: LoginState
) {
     println(state)
}

@Preview(showBackground = true)
@Composable
fun PreviewButtons() {
    println(false)
}