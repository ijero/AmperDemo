import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Screen() {
    MaterialTheme {
        Text(text = "Hello, ${Platform().name()}")
    }
}
