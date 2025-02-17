package com.jetpackcompose.bankingappui.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpackcompose.bankingappui.ui.components.BottomNavigationBar
import com.jetpackcompose.bankingappui.ui.components.CardsSection
import com.jetpackcompose.bankingappui.ui.components.CurrenciesSection
import com.jetpackcompose.bankingappui.ui.components.FinanceSection
import com.jetpackcompose.bankingappui.ui.components.WalletSection

@Preview
@Composable
fun HomeScreen() {

    Scaffold(
        bottomBar = {
            BottomNavigationBar()
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            WalletSection()
            CardsSection()
            Spacer(modifier = Modifier.height(16.dp))
            FinanceSection()
            CurrenciesSection()
        }

    }

}