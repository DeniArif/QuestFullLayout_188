package com.example.praktikum3

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.layout.RemeasurementModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Layout(modifier: Modifier = Modifier){
    Column(modifier = Modifier.fillMaxSize()) {
        TampilanHeader()
        DetailMahasiswa(
            judul = "Nama", Isinya = "Farhan"
        )
        DetailMahasiswa(
            judul = "NIM", Isinya = "2020"
        )
    }
}

@Composable
fun TampilanHeader() {
    Box(
        Modifier.fillMaxWidth()
            .background(Color.DarkGray).padding(20.dp)
    ) {
        Row {
            Box(
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painterResource(R.drawable.umy),
                    contentDescription = null
                )

                Icon(
                    Icons.Default.Done,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    tint = Color.Red
                )
            }
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Teknologi Informasi",
                    color = Color.White,
                    fontSize = 28.sp
                )
                Spacer(modifier = Modifier.padding(3.dp))

                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Universitas Muhammadiyah Yogyakarta",
                        color = Color.White,
                        fontSize = 17.sp
                    )
                }
            }

        }
    }
}

@Composable
fun DetailMahasiswa(
    judul:String,
    Isinya:String
){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween){
        Text(judul, modifier = Modifier.weight(0.8f))
        Text(":", modifier = Modifier.weight(0.2f))
        Text(Isinya, modifier = Modifier.weight(2f))

    }
}



