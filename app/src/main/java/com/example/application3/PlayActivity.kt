package com.example.application3

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity (modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()) {

        SectionHeader()

        Column (modifier = Modifier.padding(15.dp)) {
            Text(text = "kepada Yth :")
            Text(text = "Jodi")
            Spacer(modifier = Modifier.padding(10.dp))
            MainSection(
                judulParam = "Nama", isiParam = "Yafi Daffa Andriansyah"
            )
            MainSection(
                judulParam = "Kelas", isiParam = "B"
            )
            MainSection(
                judulParam = "NIM", isiParam = "20220140083"
            )
            MainSection(
                judulParam = "Ket", isiParam = "Sehat"
            )
        }

    }
}

@Composable
fun SectionHeader() {
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.DarkGray)
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .padding(15.dp)
        ) {
            Box(contentAlignment = Alignment.BottomEnd) {
                Image(painter = painterResource(id = R.drawable.uilogo), contentDescription = null, Modifier.size(100.dp)
                    .clip(shape = CircleShape))
                Icon(Icons.Filled.Check, contentDescription = null,
                    Modifier
                    .padding(end = 5.dp)
                    .size(30.dp), tint = Color.Red

                )
            }
            Column(modifier = Modifier.padding(15.dp)) {
                Text(text = "Teknologi Informasi"
                    , color = Color.White
                    )
                Spacer(Modifier.size(5.dp))
                Text(text = "Universitas Gamping Mengidul"
                    , color = Color.White
                )
            }
        }
    }
}

@Composable
fun MainSection (judulParam: String, isiParam:String) {

        Row (modifier = Modifier.fillMaxWidth().padding(5.dp)) {
            Text(text = judulParam, modifier = Modifier.weight(0.1f))
            Text(text = " : ", modifier = Modifier.weight(0.1f))
            Text(text = isiParam, modifier = Modifier.weight(0.4f))
        }

}