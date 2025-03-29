package jetbrains.kotlin.course.alias.util

import org.w3c.dom.css.Counter

typealias Identifier = Identifier(Int)

class IdentifierFactory{
    var counter: int = 0

    fun UniqueIdentifier(): Int{
        return counter += 1
    }
}
