package homework

import kotlin.math.pow

class Hw2 {

    fun massIndex(mass: Int, height: Double): String {
        val index = (mass / height.pow(2)).toInt()
        val result = when (index) {
            in 0..16 -> "Выраженный дефицит массы тела"
            in 16..18 -> "Недостаточная (дефицит) масса тела"
            in 19..25 -> "Норма"
            in 25..30 -> "Избыточная масса тела (предожирение)"
            in 30..35 -> "Ожирение"
            in 35..40 -> "Ожирение резкое"
            else -> "Очень резкое ожирение"
        }
        return result
    }
}