package br.com.fiap.game.dao

import android.content.Context
import br.com.fiap.game.model.Game

class GameRepository(context: Context) {

  private val db = GamesDb.getBanco(context).gameDao()

  fun salvar(game: Game): Long {
    return db.salvar(game)
  }

  fun excluir(game: Game): Int {
    return db.excluir(game)
  }

  fun atualizar(game: Game): Int {
    return db.atualizar(game)
  }

  fun selecionar(): List<Game>{
    return db.exibirTodosOsJogos()
  }


}