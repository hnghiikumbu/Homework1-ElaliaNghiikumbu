package jetbrains.kotlin.course.alias.card

value class Word(val word: String)

data class Card (var id: Identifier, var word: List<Word>){
}