import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.navigation.Navigator
import org.jetbrains.compose.resources.ExperimentalResourceApi

@Composable
fun welcome(navigator: Navigator) {
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            navigator.navigate(route = "/index")
        }) {
            Text("Index")
        }
    }
}