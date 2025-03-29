package jetbrains.kotlin.course.alias.card

import org.springframework.stereotype.Service
import javax.smartcardio.Card

@Service
class CardService {
  companion object {
      private fun generateCards(override val identifierFactory: int, val card = List<Card>): IdentifierFactory(Int)
      {
          val card = IdentifierFactory(Int)
          List<Card> = generateCards()
      }
  }
    const val WORDS_IN_CARD : Int = 4
    val WordsAmount = word.size / WORDS_IN_CARD

    private fun List<String>.toWords(): List<Word> = setOf(words.invoke.chucked(4))

    fun getCardByIndex(index: Int): Card = TODO("Not implemented yet")
}
