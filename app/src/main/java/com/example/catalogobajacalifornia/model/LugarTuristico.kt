package com.example.catalogobajacalifornia.model

/**
 * Representa un destino turístico representativo de Baja California.
 */
data class LugarTuristico(
    val id: Int,
    val nombre: String,
    val municipio: String,
    val descripcion: String,
    val imagenUrl: String
)
