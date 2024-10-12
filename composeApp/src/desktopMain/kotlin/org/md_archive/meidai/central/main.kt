package org.md_archive.meidai.central

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Meidai Central",
    ) {
        App()
    }
}