package homework.secondtask

class Hw21 {

    class Person(
        val id: Int,
        val login: String,
        val name: String,
        val surname: String,
        val status: String,
        val avatar: String
    ) {
        lateinit var fullname: String

        init {
            this.fullname = "$name $surname"
        }
    }
}