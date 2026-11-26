package com.example.catalogobajacalifornia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.catalogobajacalifornia.navigation.AppGuia
import com.example.catalogobajacalifornia.ui.theme.CatalogoBajaCaliforniaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CatalogoBajaCaliforniaTheme {
                AppGuia()
            }
        }
    }
}
