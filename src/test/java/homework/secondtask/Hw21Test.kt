package homework.secondtask

import org.testng.Assert
import org.testng.annotations.Test

class Hw21Test {

    @Test(description = "Создаем обьект и проверяем его full name")
    fun createPerson() {
        val newPerson = Hw21.Person(
            id = 1,
            login = "newlogin",
            name = "Alice",
            surname = "Carroll",
            status = "new",
            avatar = "")
        Assert.assertEquals(newPerson.get(), "Alice Carroll")
    }
}