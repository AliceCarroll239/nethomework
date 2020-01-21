package homework.secondtask

import homework.secondtask.api.dao.VkWallList
import homework.secondtask.api.dao.VkWallPost
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import org.testng.Assert
import org.testng.annotations.Test
import kotlin.reflect.full.declaredMemberProperties

@kotlinx.serialization.UnstableDefault
class VkWallTest {

    @Test(description = "Добавляем пост на стену, " +
            "сериализуем в JSON и обратно," +
            "проверяем что автор поста не потерялся")
    fun checkPostCreation() {
        val newPost = VkWallPost(
            id = 1,
            author = "AliceCarroll",
            postName = "Hello World",
            canBeRepost = true
        )

        val newWall = VkWallList(
            list = mutableListOf(newPost)
        )

        val newJson = Json(JsonConfiguration.Default)
        val jsonFormatedData = newJson.stringify(
            VkWallList.serializer(),
            newWall)

        val objectFormatedData = newJson.parse(
            VkWallList.serializer(),
            jsonFormatedData)

        Assert.assertEquals(
            objectFormatedData.list[0].author,
            "AliceCarroll"
        )
    }
}