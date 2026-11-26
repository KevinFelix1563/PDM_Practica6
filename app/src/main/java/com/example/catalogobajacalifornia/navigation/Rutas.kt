package com.example.catalogobajacalifornia.navigation

/**
 * Rutas de navegación de la aplicación según la Unidad V.
 */
object Rutas {
    const val Inicio = "inicio"
    const val Catalogo = "catalogo"
    const val ARG_LUGAR_ID = "lugarId"
    const val Detalle = "detalle/{$ARG_LUGAR_ID}"
    const val Acerca = "acerca"

    fun detalleConId(lugarId: Int): String = "detalle/$lugarId"
}
