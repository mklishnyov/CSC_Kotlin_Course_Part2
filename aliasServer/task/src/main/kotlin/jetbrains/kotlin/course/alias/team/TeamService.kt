package jetbrains.kotlin.course.alias.team

import jetbrains.kotlin.course.alias.util.Identifier
import jetbrains.kotlin.course.alias.util.IdentifierFactory

class TeamService(val identifierFactory: IdentifierFactory = IdentifierFactory()) {

    companion object {
        val teamsStorage: MutableMap<Identifier, Team> = mutableMapOf()
    }

    fun generateTeamsForOneRound(teamsNumber: Int): List<Team> {
        val teams = List(teamsNumber) { Team(identifierFactory.uniqueIdentifier()) }
        teams.forEach { teamsStorage.putIfAbsent(it.id, it) }
        return teams
    }

}