package br.com.fiap.game.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.game.model.Game

@Database(entities = [Game::class], version = 1)
abstract class GamesDb: RoomDatabase() {

  abstract fun gameDao(): GameDao

  companion object{
    private lateinit var instancia: GamesDb

    fun getBanco(context: Context): GamesDb{

      if(!::instancia.isInitialized){
        instancia = Room
          .databaseBuilder(
            context,
            GamesDb::class.java,
            "games_db"
          )
          .allowMainThreadQueries()
          .fallbackToDestructiveMigration()
          .build()
      }
      return instancia
    }

  }



}