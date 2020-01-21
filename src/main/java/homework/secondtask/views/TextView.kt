package homework.secondtask.views

open class TextView(open val text: String): View() {

    override fun click() {
        println(text)
    }
}