package jetbrains.kotlin.course.alias.results

import org.springframework.stereotype.Service

typealias GameResult =  List<Team>
@Service
class GameResultsService {
    companion object{
        fun saveGameResults(result: GameResult): Unit = TODO("Not implemented yet")

        fun getAllGameResults(): List<GameResult> = TODO("Not implemented yet")
    }
}
