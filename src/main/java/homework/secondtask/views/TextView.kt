package homework.secondtask.views

class TextView(val text: String): View() {

    override fun click() {
        println(text)
    }
}