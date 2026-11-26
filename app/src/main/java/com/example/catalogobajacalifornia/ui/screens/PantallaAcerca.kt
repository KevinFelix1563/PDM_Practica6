package com.example.catalogobajacalifornia.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalogobajacalifornia.ui.theme.CatalogoBajaCaliforniaTheme

/**
 * Pantalla informativa con el propósito, contenido, autor y datos académicos de la aplicación.
 */
@Composable
fun PantallaAcerca(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Text(
                text = "GUÍA BAJA CALIFORNIA",
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "Tu guía para descubrir más.",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
        }

        TarjetaInfo(
            etiqueta = "Propósito",
            contenido = "Explorar los principales atractivos turísticos de Baja California",
            destacada = true
        )

        TarjetaInfo(
            etiqueta = "Contenido",
            contenido = "Catálogo con 12 destinos representativos de los 7 municipios del estado"
        )

        TarjetaInfo(
            etiqueta = "Autor",
            contenido = "Kevin Yassir Félix Sánchez"
        )

        TarjetaInfo(
            etiqueta = "Formación académica",
            contenido = "Programación de Dispositivos Móviles — UABC, Facultad de Ingeniería"
        )
    }
}

@Composable
private fun TarjetaInfo(
    etiqueta: String,
    contenido: String,
    destacada: Boolean = false
) {
    val colorFondo = if (destacada) {
        MaterialTheme.colorScheme.secondaryContainer
    } else {
        MaterialTheme.colorScheme.surfaceContainerLowest
    }
    val colorEtiqueta = if (destacada) {
        MaterialTheme.colorScheme.primary
    } else {
        MaterialTheme.colorScheme.secondary
    }
    val colorContenido = if (destacada) {
        MaterialTheme.colorScheme.onSecondaryContainer
    } else {
        MaterialTheme.colorScheme.onSurface
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = colorFondo),
        elevation = CardDefaults.cardElevation(defaultElevation = if (destacada) 0.dp else 1.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Text(
                text = etiqueta,
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.Bold,
                color = colorEtiqueta
            )
            Text(
                text = contenido,
                style = MaterialTheme.typography.bodyLarge,
                color = colorContenido
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PantallaAcercaPreview() {
    CatalogoBajaCaliforniaTheme {
        PantallaAcerca()
    }
}
