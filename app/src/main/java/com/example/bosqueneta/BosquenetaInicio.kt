package com.example.bosqueneta

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bosqueneta.Navigation.Destinations
import com.example.bosqueneta.ui.theme.BosquenetaTheme

@Preview
@Composable
fun Preview(){
    BosquenetaInicio(rememberNavController())
}

@Composable
fun BosquenetaInicio(navController: NavController) {
    BosquenetaTheme {

        Column(
            Modifier
                .fillMaxSize()
                .background(Color(0xFF77ad62))
        ) {


            Column(
                Modifier
                    .background(Color.Transparent)
                    .height(600.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                logo()
            }

            Column(
                Modifier
                    .fillMaxSize()
                    .background(Color.Transparent), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                botonEmpezar(navController)
            }


        }

    }
}

@Composable
fun logo() {


    androidx.compose.material.Surface(
        Modifier.background(Color.Transparent),
        shape = CircleShape,
        elevation = 10.dp
    ) {


        Image(
            painter = painterResource(id = R.drawable.logo_no_background),
            contentDescription = "LOGO",
            contentScale = ContentScale.Crop,
        )


    }


}

@Composable
fun botonEmpezar(navController: NavController) {

    Button(
        onClick = {
                 //Navegar pantalla 2
                  navController.navigate(Destinations.Pantalla2.ruta)

        },
        border = BorderStroke(1.dp, Color.Black),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black),
        shape = RoundedCornerShape(20.dp)
    ) {
        Text(text = "Empezar", color = Color.DarkGray)
    }

}