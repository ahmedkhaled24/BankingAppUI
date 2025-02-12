package com.jetpackcompose.bankingappui

import androidx.compose.ui.graphics.Brush

data class CardModel(
    val cardType: String,
    val cardNumber: String,
    val cardName: String,
    val cardIcon: Int,
    val balance: Double,
    val color: Brush
)
