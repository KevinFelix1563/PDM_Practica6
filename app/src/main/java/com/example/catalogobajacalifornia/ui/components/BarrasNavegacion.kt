package com.example.catalogobajacalifornia.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import com.example.catalogobajacalifornia.navigation.Rutas

/**
 * Barra superior dinámica que muestra el título de la ruta actual,
 * el botón de regreso cuando corresponde y el acceso a "Acerca de".
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraSuperior(
    titulo: String,
    mostrarVolver: Boolean,
    mostrarAcerca: Boolean,
    onVolver: () -> Unit,
    onAcerca: () -> Unit
) {
    TopAppBar(
        title = {
            Text(
                text = titulo,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        navigationIcon = {
            if (mostrarVolver) {
                IconButton(onClick = onVolver) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Regresar"
                    )
                }
            }
        },
        actions = {
            if (mostrarAcerca) {
                IconButton(onClick = onAcerca) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "Acerca de"
                    )
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.background,
            titleContentColor = MaterialTheme.colorScheme.onBackground,
            navigationIconContentColor = MaterialTheme.colorScheme.onBackground,
            actionIconContentColor = MaterialTheme.colorScheme.primary
        )
    )
}

/**
 * Barra de navegación inferior para las secciones principales: Inicio y Catálogo.
 */
@Composable
fun BarraInferior(
    rutaActual: String?,
    onIrInicio: () -> Unit,
    onIrCatalogo: () -> Unit
) {
    val coloresItem = NavigationBarItemDefaults.colors(
        selectedIconColor = MaterialTheme.colorScheme.primary,
        selectedTextColor = MaterialTheme.colorScheme.primary,
        indicatorColor = MaterialTheme.colorScheme.secondaryContainer
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surfaceContainerLowest
    ) {
        NavigationBarItem(
            selected = rutaActual == Rutas.Inicio,
            onClick = onIrInicio,
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Inicio"
                )
            },
            label = { Text("Inicio") },
            colors = coloresItem
        )
        NavigationBarItem(
            selected = rutaActual == Rutas.Catalogo,
            onClick = onIrCatalogo,
            icon = {
                Icon(
                    imageVector = Icons.Default.Place,
                    contentDescription = "Catálogo"
                )
            },
            label = { Text("Catálogo") },
            colors = coloresItem
        )
    }
}
