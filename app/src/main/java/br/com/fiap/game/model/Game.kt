package br.com.fiap.game.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_game")
data class Game(
  @PrimaryKey(autoGenerate = true)
  var codigo: Long = 0,

  var nome: String = "",

  @ColumnInfo(name = "ano_lancamento")
  var anoLancamento: Int = 1990,

  var finalizado: Boolean = false
)
