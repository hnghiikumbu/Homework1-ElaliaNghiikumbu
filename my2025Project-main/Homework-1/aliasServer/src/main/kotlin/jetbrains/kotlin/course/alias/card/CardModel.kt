package jetbrains.kotlin.course.alias.card

value class Word(val word: String)

data class Card (override val id: int, val word: List<Word>): Identifier(Int){
   val id = Identifier(Int)
    val word = readline()
}