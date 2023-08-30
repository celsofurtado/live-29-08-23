package br.com.fiap.game

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.game.dao.GameRepository
import br.com.fiap.game.model.Game
import br.com.fiap.game.ui.theme.GameTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val gr = GameRepository(this)

    val game1 = Game(codigo = 1, nome = "Ikari", anoLancamento = 1987, finalizado = true)
    val game2 = Game(codigo = 2, nome = "Street Fighter 2", anoLancamento = 1990, finalizado = false)
    val game3 = Game(nome = "Sonic", anoLancamento = 1992, finalizado = false)

    //gr.salvar(game1)
    //gr.excluir(game1)
    //gr.atualizar(game2)
    Log.i("FIAP", "${gr.selecionar()}")

    setContent {
      GameTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          Greeting("Android")
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  GameTheme {
    Greeting("Android")
  }
}