package jetbrains.kotlin.course.alias.team

data class Team (override val id: Int ): IdentifierFactory(counter){
    val point: Int = 0
    val name: String = "Team#${id + 1}"
}