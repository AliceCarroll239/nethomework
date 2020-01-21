package homework.firsttask

import homework.firsttast.Hw2
import org.testng.annotations.Test

import org.testng.Assert.*
import org.testng.annotations.DataProvider

class Hw2Test {

    data class Data(
        val mass: Int,
        val height: Double,
        val result: String
    )

    @DataProvider(name = "homework2")
    fun provider(): Array<out Any> {
        return arrayOf(
            Data(80, 1.80, "Норма"),
            Data(106, 1.68, "Ожирение резкое")
        )
    }

    @Test(dataProvider = "homework2", dataProviderClass = Hw2Test::class)
    fun testCalculateFee(data: Data) {
        with(data) {
            assertEquals(
                Hw2().massIndex(mass, height), result)
        }
    }
}