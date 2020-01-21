package homework.secondtask.views

class Button(text: String): TextView(text) {

    override fun click() {
        println(text)
    }
}