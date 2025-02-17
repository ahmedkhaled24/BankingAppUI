package com.jetpackcompose.bankingappui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcompose.bankingappui.data.model.CurrencyModel
import com.jetpackcompose.bankingappui.ui.theme.GreenStart

val currencies = listOf(
    CurrencyModel(
        name = "USD",
        buy = 23.35f,
        sell = 23.25f,
        icon = Icons.Rounded.AttachMoney
    ),

    CurrencyModel(
        name = "EUR",
        buy = 13.35f,
        sell = 13.25f,
        icon = Icons.Rounded.Euro
    ),

    CurrencyModel(
        name = "YEN",
        buy = 26.35f,
        sell = 26.35f,
        icon = Icons.Rounded.CurrencyYen
    ),

    CurrencyModel(
        name = "USD",
        buy = 23.35f,
        sell = 23.25f,
        icon = Icons.Rounded.AttachMoney
    ),

    CurrencyModel(
        name = "EUR",
        buy = 63.35f,
        sell = 73.25f,
        icon = Icons.Rounded.Euro
    ),

    CurrencyModel(
        name = "YEN",
        buy = 16.35f,
        sell = 16.35f,
        icon = Icons.Rounded.CurrencyYen
    ),
)

@Preview
@Composable
fun CurrenciesSection() {
    BoxWithConstraints(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        val boxWithConstraintsScope = this
        val width = boxWithConstraintsScope.maxWidth / 3

        Column {
            Text(
                text = "Currencies",
                fontSize = 24.sp,
                color = MaterialTheme.colorScheme.onBackground,
                fontWeight = FontWeight.Bold,
            )

            Row(modifier = Modifier.fillMaxWidth()) {

                Text(
                    modifier = Modifier.width(width),
                    text = "Currency",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )


                Text(
                    modifier = Modifier.width(width),
                    text = "Buy  ",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    textAlign = TextAlign.End
                )


                Text(
                    modifier = Modifier.width(width),
                    text = "Sell  ",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    textAlign = TextAlign.End
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn {
                items(currencies.size) { index ->
                    CurrencyItem(
                        index = index,
                        width = width
                    )
                }
            }


        }

    }
}

@Composable
fun CurrencyItem(index: Int, width: Dp) {
    val currency = currencies[index]

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Row(
            modifier = Modifier.width(width),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(GreenStart)
                    .padding(4.dp)
            ) {
                Icon(
                    modifier = Modifier.size(18.dp),
                    imageVector = currency.icon,
                    contentDescription = currency.name,
                    tint = Color.White
                )
            }

            Text(
                modifier = Modifier
                    .padding(start = 10.dp),
                text = currency.name,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onBackground,
            )
        }

        Text(
            modifier = Modifier
                .width(width)
                .padding(start = 10.dp),
            text = "$ ${currency.buy}",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.End
        )

        Text(
            modifier = Modifier
                .width(width)
                .padding(start = 10.dp),
            text = "$ ${currency.sell}",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.End
        )

    }
}

















