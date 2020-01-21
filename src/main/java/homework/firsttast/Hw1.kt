package homework.firsttast

import kotlin.IllegalArgumentException

class Hw1 {

    fun calculateFee(ammount: Int, total: Int, exclusive: Boolean = false): Int {

        if (ammount < 0 || total < 0) throw IllegalArgumentException("Arguments must be above zero")

        var fee = when (total) {
            in 0..1000 -> 30
            in 1001..10000 -> 25
            in 10001..50000 -> 20
            else -> 15
        }

        if (exclusive) {
            fee -= 5
        }

        return ammount * fee / 100
    }
}