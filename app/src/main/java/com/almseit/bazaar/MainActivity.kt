package com.almseit.bazaar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.almseit.bazaar.presentation.bottomNavigation.MainScreen
import com.almseit.bazaar.ui.theme.BazaArTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BazaArTheme {
                MainScreen()
            }
        }
    }
}

