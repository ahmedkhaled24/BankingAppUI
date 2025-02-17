package com.jetpackcompose.bankingappui.data.model

import androidx.compose.ui.graphics.vector.ImageVector

data class CurrencyModel(
    val name: String,
    val buy: Float,
    val sell: Float,
    val icon: ImageVector
)