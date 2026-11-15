package com.example.shop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import com.example.shop.ui.ShopScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkTheme = isSystemInDarkTheme()
            val colors = if (darkTheme) darkColorScheme() else lightColorScheme()
            MaterialTheme(colorScheme = colors) {
                Surface {
                    ShopScreen()
                }
            }
        }
    }
}