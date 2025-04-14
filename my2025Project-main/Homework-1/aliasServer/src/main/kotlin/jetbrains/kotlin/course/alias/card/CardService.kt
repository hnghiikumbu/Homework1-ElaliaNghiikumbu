package jetbrains.kotlin.course.alias.card

import org.springframework.stereotype.Service
import javax.smartcardio.Card

@Service
class CardService( identifierFactory: IdentifierFactory, cards: List<Card>) List<String>.toWords(): List<Word>{
    var identifierFactory = IdentifierFactory(counter)
    var cards = generateCards()
    companion object{
        var const WORDS_IN_CARD : Int = 4
        var cardsAmount: Int =  words.size / WORDS_IN_CARD
    }
    private fun generateCards(): List<Card> = words.chunked(4), cards.chunked(cardaAmount) = card

    private fun List<String>.toWords(): List<Word> = TODO("Not implemented yet")

    fun getCardByIndex(index: Int): Card = indexOf(cards)
}
