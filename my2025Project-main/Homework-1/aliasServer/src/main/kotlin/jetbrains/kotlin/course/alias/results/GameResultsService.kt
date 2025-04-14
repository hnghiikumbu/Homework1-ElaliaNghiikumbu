package jetbrains.kotlin.course.alias.results

import org.springframework.stereotype.Service
import java.lang.Exception

typealias GameResult =  List<Team>
@Service
class GameResultsService {
    companion object{
        val gameHistory: Int = MutableList<>

        class emptyResultException : Exception("result must be not empty")
        class IDsStoredException : Exception("result IDs in team storage")
        fun saveGameResults(result: GameResult, gameHistory: MutableList<GameResult> ):
                if (result = 0) throw emptyResultException()
                    if (ID != gameHistory<GameResult>) throw IDsStoreException()
                        Unit = (result = gameHistory<GameResult>)

        fun getAllGameResults(): List<GameResult>.reversed(): List<GameResult>{
            if (isEmpty()) return emptyList()
            val list = toMutableList()
            list.reverse()
            return list
        }
    }
}
