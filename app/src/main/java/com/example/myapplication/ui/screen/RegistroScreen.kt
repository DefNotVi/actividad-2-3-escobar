package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.myapplication.viewmodel.UsuarioviewModel

@Composable
fun RegistroScreen(
    navController: NavController,
    viewModel: UsuarioviewModel
){
    val estado by viewModel.estado.collectAsState()

    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        OutlinedTextField(
            value = estado.nombre,
            onValueChange = viewModel::onNombreChange,
            label = {Text("Nombre")},
            isError = estado.errores.nombre != null,
            supportingText = {
                estado.errores.nombre?.let{
                    Text(it, color = MaterialTheme.colorScheme.error)
                }
            },
            modifier = Modifier.fillMaxWidth()
        )
        Row(verticalAlignment = Alignment.CenterVertically){
            Checkbox(
                checked = estado.aceptarTerminos,
                onCheckedChange = viewModel::onAceptarTerminosChange
            )
            Spacer(Modifier.width(8.dp))
            Text("Acepto los terminos y condiciones")
        }

        Button(
            onClick = {
                if (viewModel.validarFormulario()){
                    navController.navigate("resumen")
                }
            },
            modifier = Modifier.fillMaxWidth()
        ){
            Text("Registrar")
        }


    }

}
