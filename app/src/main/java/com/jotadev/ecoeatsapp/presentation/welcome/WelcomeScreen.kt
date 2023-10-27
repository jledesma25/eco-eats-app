package com.jotadev.ecoeatsapp.presentation.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jotadev.ecoeatsapp.R
import com.jotadev.ecoeatsapp.presentation.common.SpacerComponent
import com.jotadev.ecoeatsapp.ui.theme.Primary
import com.jotadev.ecoeatsapp.ui.theme.Secundary

@Composable
fun WelcomeScreen() {

    Column(modifier = Modifier.fillMaxSize()) {
        HeaderWelcome()
        ContentWelcome()
    }

}

@Composable
fun ColumnScope.HeaderWelcome() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .weight(1f),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.eco_logo),
                contentDescription = "Eco Logo",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(25.dp)
            )
            SpacerComponent(
                modifier = Modifier.height(12.dp)
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Una vida saludable",
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = Secundary
            )
        }

    }
}

@Composable
fun ColumnScope.ContentWelcome() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .weight(1f),
        contentAlignment = Alignment.BottomCenter
    ) {
        Image(
            painter = painterResource(id = R.drawable.fruits_image),
            contentDescription = "Fruit Image",
            modifier = Modifier.fillMaxSize()
        )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Primary,
                contentColor = Color.White
            ),
            modifier = Modifier.padding(bottom = 50.dp)
        ) {
            Text(
                text = "Empezar",
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}