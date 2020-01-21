package homework.firsttask

import homework.firsttast.Hw3
import org.testng.Assert.*
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class Hw3Test {
    data class Data(
        val time: Int,
        val result: String
    )

    @DataProvider(name = "homework3")
    fun provider(): Array<out Any> {
        return arrayOf(
            Data(3600, "Час назад")
        )
    }

    @Test(dataProvider = "homework3", dataProviderClass = Hw3Test::class)
    fun testCalculateFee(data: Data) {
        with(data) {
            assertEquals(
                Hw3().calculateTime(time), result)
        }
    }
}