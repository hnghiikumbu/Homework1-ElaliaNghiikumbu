package jetbrains.kotlin.course.alias.team

import org.springframework.stereotype.Service
import java.lang.Override

@Service
class TeamService(var identifierFactory: IdentifierFactory) {
    var identifierFactory = IdentifierFactory(counter)
    companion object{
        var teamsStorage =(Identifier = Team): MutableMap<>
    }
    fun generateTeamsForOneRound(teamsNumber:Int): List<Team> =
        TeamService.identifierFactory(counter) -> teamsStorage<Team>
}
