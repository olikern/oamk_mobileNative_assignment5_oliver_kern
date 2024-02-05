package com.example.oamk_mobilenative_assignment5_oliver_kern.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.oamk_mobilenative_assignment5_oliver_kern.R

@Composable
fun Calculation(male: Boolean, weight: Int, intensity: Float, setResult: (Int) -> Unit) {
    Button(
        onClick = {
            if (weight <= 0) {
                setResult(0)
                return@Button
            }
            if (male) {
                setResult(((879 + 10.2 * weight) * intensity).toInt())
            } else {
                setResult(((795 + 7.18 * weight) * intensity).toInt())
            }
        },
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = stringResource(R.string.calculate))
    }
}