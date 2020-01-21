package homework.secondtask

class Hw21 {

    class Person(
        private val id: Int,
        private val login: String,
        private val name: String,
        private val surname: String,
        private val status: String,
        private val avatar: String
    ) {

        fun get(): String {
            return "$name $surname"
        }
    }
}