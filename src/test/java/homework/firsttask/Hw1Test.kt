package homework.firsttask

import homework.firsttast.Hw1
import org.testng.Assert
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

class Hw1Test {

    data class Data(
        val ammount: Int,
        val total: Int,
        val exclusive: Boolean,
        val expectedResult: Int
    )

    @DataProvider(name = "homework1")
    fun provider(): Array<out Any> {
        return arrayOf(
            Data(200, 11000, false, 40),
            Data(200, 11000, true, 30),
            Data(1000, 52000, false, 150),
            Data(1000, 5000, false, 250)
        )
    }

    @Test(dataProvider = "homework1", dataProviderClass = Hw1Test::class)
    fun testCalculateFee(data: Data) {
        with(data) {
            Assert.assertEquals(
                Hw1().calculateFee(ammount, total, exclusive), expectedResult
            )
        }
    }
}