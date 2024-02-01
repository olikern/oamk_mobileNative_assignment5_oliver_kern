package com.example.oamk_mobilenative_assignment5_oliver_kern.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import com.example.oamk_mobilenative_assignment5_oliver_kern.R

@Composable
fun GenderChoices(male: Boolean, setGenderMale: (Boolean) -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = male,
            onClick = { setGenderMale(true) }
        )
        Text(text = stringResource(R.string.male))
    }
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = !male,
            onClick = { setGenderMale(false) }
        )
        Text(text = stringResource(R.string.female))
    }
}