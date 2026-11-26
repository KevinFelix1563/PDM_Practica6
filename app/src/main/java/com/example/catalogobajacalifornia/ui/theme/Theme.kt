package com.example.catalogobajacalifornia.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val EsquemaOscuro = darkColorScheme(
    primary = VerdePrimarioOscuro,
    onPrimary = SobreVerdePrimarioOscuro,
    primaryContainer = ContenedorPrimarioOscuro,
    onPrimaryContainer = SobreContenedorPrimarioOscuro,
    secondary = VerdeSecundarioOscuro,
    onSecondary = SobreVerdeSecundarioOscuro,
    secondaryContainer = ContenedorSecundarioOscuro,
    onSecondaryContainer = SobreContenedorSecundarioOscuro,
    background = FondoOscuro,
    onBackground = TextoClaro,
    surface = SuperficieOscura,
    onSurface = TextoClaro,
    surfaceVariant = SuperficieVarianteOscura,
    onSurfaceVariant = TextoSecundarioOscuro
)

private val EsquemaClaro = lightColorScheme(
    primary = VerdePrimarioClaro,
    onPrimary = SobreVerdePrimarioClaro,
    primaryContainer = ContenedorPrimarioClaro,
    onPrimaryContainer = SobreContenedorPrimarioClaro,
    secondary = VerdeSecundarioClaro,
    onSecondary = SobreVerdeSecundarioClaro,
    secondaryContainer = ContenedorSecundarioClaro,
    onSecondaryContainer = SobreContenedorSecundarioClaro,
    background = FondoClaro,
    onBackground = TextoOscuro,
    surface = SuperficieClara,
    onSurface = TextoOscuro,
    surfaceVariant = SuperficieVarianteClara,
    onSurfaceVariant = TextoSecundarioClaro
)

@Composable
fun CatalogoBajaCaliforniaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> EsquemaOscuro
        else -> EsquemaClaro
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
