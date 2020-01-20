package homework

class Hw3 {

    fun calculateTime(seconds: Int): String {
        val minute = seconds / 60
        val hours = minute / 60
        return when {
            minute < 0 -> "Меньше минуты назад"
            minute == 1 -> "Минуту назад"
            hours < 0 -> "${minute} минут назад"
            hours == 1 -> "Час назад"
            else -> "${hours} часа назад"
        }
    }
}