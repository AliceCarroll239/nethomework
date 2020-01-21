package homework.secondtask.views

class Button(val text: String): View() {

    override fun click() {
        println(text)
    }
}