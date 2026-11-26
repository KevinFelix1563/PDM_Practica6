package com.example.catalogobajacalifornia.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

/**
 * Muestra la fotografía remota de un lugar turístico usando Coil 3,
 * o un recuadro informativo cuando la URL está vacía.
 */
@Composable
fun ImagenLugar(
    url: String?,
    descripcion: String,
    modifier: Modifier = Modifier,
    forma: Shape = RoundedCornerShape(12.dp)
) {
    if (!url.isNullOrBlank()) {
        AsyncImage(
            model = url,
            contentDescription = descripcion,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .clip(forma)
                .background(MaterialTheme.colorScheme.surfaceVariant)
        )
    } else {
        Box(
            modifier = modifier
                .clip(forma)
                .background(MaterialTheme.colorScheme.surfaceVariant),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Imagen no disponible",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
