package br.com.fiap.game.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.game.model.Game

@Dao
interface GameDao {

  //gravar um novo jogo
  @Insert
  fun salvar(game: Game): Long

  //atualizar um jogo
  @Update
  fun atualizar(game: Game): Int

  @Update
  fun atualizar(games: List<Game>): Int

  //excluir um jogo
  @Delete
  fun excluir(game: Game): Int

  @Delete
  fun excluir(games: List<Game>): Int

  // selecionar todos os jogos em ordem alfabética pelo nome
  @Query("SELECT * FROM tbl_game ORDER BY nome ASC")
  fun exibirTodosOsJogos(): List<Game>

  // selecionar todos os jogos que eu finalizei
  @Query("SELECT * FROM TBL_GAME WHERE finalizado = :isFinalizado")
  fun exibirTodosOsJogosFinalizados(isFinalizado: Boolean): List<Game>

}