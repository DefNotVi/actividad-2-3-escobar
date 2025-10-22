package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import com.example.myapplication.viewmodel.UsuarioviewModel

@composable
fun RegistroScreen(

    viewModel: UsuarioviewModel
){
    val estado by viewModel.estado.collectAsState()

    column(
        Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    )

}
