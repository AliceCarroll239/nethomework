package homework.secondtask

import homework.secondtask.views.Button
import homework.secondtask.views.TextView
import homework.secondtask.views.ViewGroup
import org.testng.annotations.Test

class ViewsTest {

    @Test(description = "Создаем View Group и проверяем что элементы добавлены, " +
            "достаточно проверить что нажатие на элементы " +
            "в группе не бросает исключений")
    fun checkViewGroupCreation() {
        val viewGroup = ViewGroup()
        val title = TextView("Main Screen")
        val button = Button("New Button")

        viewGroup.apply {
            addView(title)
            addView(button)
        }

        viewGroup.getViews().forEach {
            it.click()
        }
    }
}