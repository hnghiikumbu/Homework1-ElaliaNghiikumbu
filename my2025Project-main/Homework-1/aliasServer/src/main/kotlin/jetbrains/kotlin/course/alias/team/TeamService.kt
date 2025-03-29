package jetbrains.kotlin.course.alias.team

import org.springframework.stereotype.Service
import java.lang.Override

@Service
class TeamService(override val identifierFactory: Int): IdentifierFactory(Int) {
    companion object{
        fun newTeamService(identifierFactory: Int): TeamService{
            val teamStorage = mutableMapOf("Team#${id + 1}")
            return TeamService(identifierFactory)
        }
    }
    fun generateTeamsForOneRound(teamsNumber: Int): List<Team> = teamStorage(){
        val Team = identifierFactory()
        return@teamStorage
    }
}
