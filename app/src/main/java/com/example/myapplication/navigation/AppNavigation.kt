package com.example.myapplication.navigation

import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.screen.RegistroScreen
import com.example.myapplication.ui.screen.ResumenScreen
import com.example.myapplication.viewmodel.UsuarioviewModel

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    val usuarioViewModel: UsuarioviewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "Registro"
    ){
        composable("registro"){
            RegistroScreen(navController, usuarioViewModel)
        }
        composable("resumen"){
            ResumenScreen(usuarioViewModel)
        }
    }
}