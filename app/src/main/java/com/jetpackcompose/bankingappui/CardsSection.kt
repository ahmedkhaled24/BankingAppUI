package com.jetpackcompose.bankingappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcompose.bankingappui.ui.theme.BlueEnd
import com.jetpackcompose.bankingappui.ui.theme.BlueStart
import com.jetpackcompose.bankingappui.ui.theme.GreenEnd
import com.jetpackcompose.bankingappui.ui.theme.GreenStart
import com.jetpackcompose.bankingappui.ui.theme.OrangeEnd
import com.jetpackcompose.bankingappui.ui.theme.OrangeStart
import com.jetpackcompose.bankingappui.ui.theme.PurpleEnd
import com.jetpackcompose.bankingappui.ui.theme.PurpleStart

//Fill Data Cards
val cards = listOf(

    CardModel(
        cardType = "VISA",
        cardNumber = "3664 7865 3786 3976",
        cardName = "Business",
        cardIcon = R.drawable.ic_visa,
        balance = 46.467,
        color = getGradient(PurpleStart, PurpleEnd)
    ),

    CardModel(
        cardType = "MASTER CARD",
        cardNumber = "234 7583 7899 2223",
        cardName = "Savings",
        cardIcon = R.drawable.ic_mastercard,
        balance = 6.467,
        color = getGradient(BlueStart, BlueEnd)
    ),

    CardModel(
        cardType = "VISA",
        cardNumber = "0078 3467 3446 7899",
        cardName = "School",
        cardIcon = R.drawable.ic_visa,
        balance = 3.467,
        color = getGradient(OrangeStart, OrangeEnd)
    ),

    CardModel(
        cardType = "MASTER CARD",
        cardNumber = "3567 7865 3786 3976",
        cardName = "Trips",
        cardIcon = R.drawable.ic_mastercard,
        balance = 26.47,
        color = getGradient(GreenStart, GreenEnd)
    ),
)

fun getGradient(
    startColor: Color,
    endColor: Color,
): Brush {
    return Brush.horizontalGradient(colors = listOf(startColor, endColor))
}


//Screen
@Composable
fun CardsSection() {
    LazyRow {
        items(cards.size) { index ->
            CardItem(index)
        }
    }
}


//Card Item
@Composable
fun CardItem(index: Int) {

    val card = cards[index]

    var lastItemPaddingEnd = 0.dp
    if (index == cards.size - 1) {
        lastItemPaddingEnd = 16.dp
    }

    Box(
        modifier = Modifier
            .padding(start = 16.dp, end = lastItemPaddingEnd)
    ) {

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.color)
                .width(250.dp)
                .height(155.dp)
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(card.cardIcon), "",
                modifier = Modifier.width(60.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = card.cardName,
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "$ ${card.balance}",
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = card.cardNumber,
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}