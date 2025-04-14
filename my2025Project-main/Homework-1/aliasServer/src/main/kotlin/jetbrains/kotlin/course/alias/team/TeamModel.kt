package jetbrains.kotlin.course.alias.team

data class Team(var id: Identifier, var point: Int){
    var point: Int = 0
    var name: String = "Team#${id + 1}"
}