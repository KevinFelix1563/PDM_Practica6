package com.example.catalogobajacalifornia.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.catalogobajacalifornia.data.CatalogoLugares
import com.example.catalogobajacalifornia.ui.components.BarraInferior
import com.example.catalogobajacalifornia.ui.components.BarraSuperior
import com.example.catalogobajacalifornia.ui.screens.PantallaAcerca
import com.example.catalogobajacalifornia.ui.screens.PantallaCatalogo
import com.example.catalogobajacalifornia.ui.screens.PantallaDetalle
import com.example.catalogobajacalifornia.ui.screens.PantallaInicio

/**
 * Contenedor principal y grafo de navegación de la aplicación.
 */
@Composable
fun AppGuia() {
    val navController = rememberNavController()
    val entradaActual by navController.currentBackStackEntryAsState()
    val rutaActual = entradaActual?.destination?.route

    val titulo = when (rutaActual) {
        Rutas.Inicio -> "Inicio"
        Rutas.Catalogo -> "Lugares"
        Rutas.Detalle -> "Detalle del lugar"
        Rutas.Acerca -> "Acerca de"
        else -> "Guía de lugares"
    }

    val mostrarVolver = rutaActual != Rutas.Inicio && navController.previousBackStackEntry != null
    val mostrarAcerca = rutaActual != Rutas.Acerca
    val mostrarBarraInferior = rutaActual == Rutas.Inicio || rutaActual == Rutas.Catalogo

    val irAInicio: () -> Unit = {
        if (rutaActual != Rutas.Inicio) {
            navController.navigate(Rutas.Inicio) {
                popUpTo(Rutas.Inicio) { inclusive = false }
                launchSingleTop = true
            }
        }
    }

    val irACatalogo: () -> Unit = {
        if (rutaActual != Rutas.Catalogo) {
            navController.navigate(Rutas.Catalogo) {
                popUpTo(Rutas.Inicio) { saveState = true }
                launchSingleTop = true
                restoreState = true
            }
        }
    }

    val abrirAcerca: () -> Unit = {
        navController.navigate(Rutas.Acerca) {
            launchSingleTop = true
        }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.background,
        topBar = {
            BarraSuperior(
                titulo = titulo,
                mostrarVolver = mostrarVolver,
                mostrarAcerca = mostrarAcerca,
                onVolver = { navController.navigateUp() },
                onAcerca = abrirAcerca
            )
        },
        bottomBar = {
            if (mostrarBarraInferior) {
                BarraInferior(
                    rutaActual = rutaActual,
                    onIrInicio = irAInicio,
                    onIrCatalogo = irACatalogo
                )
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Rutas.Inicio,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            enterTransition = {
                fadeIn(tween(250)) + slideInHorizontally(tween(250)) { ancho -> ancho / 6 }
            },
            exitTransition = {
                fadeOut(tween(200))
            },
            popEnterTransition = {
                fadeIn(tween(250)) + slideInHorizontally(tween(250)) { ancho -> -ancho / 6 }
            },
            popExitTransition = {
                fadeOut(tween(200)) + slideOutHorizontally(tween(200)) { ancho -> ancho / 6 }
            }
        ) {
            composable(route = Rutas.Inicio) {
                PantallaInicio(onExplorar = irACatalogo)
            }

            composable(route = Rutas.Catalogo) {
                PantallaCatalogo(
                    lugares = CatalogoLugares.lugares,
                    onSeleccionar = { lugarId ->
                        navController.navigate(Rutas.detalleConId(lugarId)) {
                            launchSingleTop = true
                        }
                    }
                )
            }

            composable(
                route = Rutas.Detalle,
                arguments = listOf(
                    navArgument(Rutas.ARG_LUGAR_ID) { type = NavType.IntType }
                )
            ) { backStackEntry ->
                val lugarId = backStackEntry.arguments?.getInt(Rutas.ARG_LUGAR_ID) ?: -1
                val lugar = CatalogoLugares.buscarPorId(lugarId)
                PantallaDetalle(
                    lugar = lugar,
                    onVolver = { navController.popBackStack() }
                )
            }

            composable(route = Rutas.Acerca) {
                PantallaAcerca()
            }
        }
    }
}
