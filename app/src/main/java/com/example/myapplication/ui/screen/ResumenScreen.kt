package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import com.example.myapplication.viewmodel.UsuarioviewModel


@Composable
fun ResumenScreen(viewModel: UsuarioviewModel) {
    val estado by viewModel.estado.collectAsState()

    Column(Modifier.padding(16.dp)){
        Text("Resumen del Registro", style = MaterialTheme.typography.headlineMedium)
        Text("Nombre: ${estado.nombre}")
        Text("Correo: ${estado.correo}")
        Text("Direccion: ${estado.direccion}")
        Text("Contraseña: ${"*".repeat(estado.clave.length)}")
        Text("Términos: ${if (estado.aceptarTerminos)  "Aceptar" else "No aceptados"}")
    }
}