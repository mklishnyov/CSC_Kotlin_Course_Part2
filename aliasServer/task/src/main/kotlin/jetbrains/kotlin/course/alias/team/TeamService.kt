package jetbrains.kotlin.course.alias.team

import jetbrains.kotlin.course.alias.util.Identifier
import jetbrains.kotlin.course.alias.util.IdentifierFactory
import org.springframework.stereotype.Service

@Service
class TeamService {
    val identifierFactory: IdentifierFactory = IdentifierFactory(0)
    companion object {
        val teamsStorage: MutableMap<Identifier, Team> = mutableMapOf()
    }
    fun generateTeamsForOneRound(teamsNumber: Int): List<Team> {
        
    }
}
