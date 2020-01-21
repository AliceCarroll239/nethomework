package homework.secondtask

import homework.secondtask.api.dao.VkWallDao
import homework.secondtask.views.Button
import homework.secondtask.views.TextView
import homework.secondtask.views.ViewGroup
import homework.secondtask.api.model.VkWallList
import homework.secondtask.api.model.VkWallPost
import kotlinx.serialization.json.*
import kotlin.reflect.full.declaredMemberProperties

@kotlinx.serialization.UnstableDefault

fun main() {

    //task 1
    niceLog("1")
    val newPerson = Hw21.Person(1, "newlogin", "Name", "Surname", "new", "")
    println("First task result - person with fullname ${newPerson.fullname}")

    //task 2
    niceLog("2")
    val viewGroup = ViewGroup()
    val title = TextView("Main Screen")
    val button = Button("New Button")

    viewGroup.apply {
        addView(title)
        addView(button)
    }

    viewGroup.listViews.forEach {
        it.click()
    }

    //task 3
    niceLog("3")
    val newPost = VkWallPost(
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
        newWall
    )
    println("Json Format Wall")
    println(jsonFormatedData)

    val objectFormatedData = newJson.parse(
        VkWallList.serializer(),
        jsonFormatedData
    )
    println("Deserialize to Kotlin Object")
    objectFormatedData.list[0].javaClass.kotlin.declaredMemberProperties.forEach {
        println("Param ${it.name} of type ${it.returnType} with value ${it.get(newPost)}")
    }

    //task3 additional
    niceLog("3 additional")
    val newVKWall = VkWallDao()
    val firstVKPost =  VkWallPost(
        author = "AliceCarroll",
        postName = "Hello World",
        canBeRepost = true
    )
    val secondVKPost = VkWallPost(
        author = "CheshirCat",
        postName = "Hello Cat World",
        canBeRepost = false
    )

    val thirdVKPost = VkWallPost(
        author = "WhiteRabbit",
        postName = "Hello Rabbit World",
        canBeRepost = true
    )

    newVKWall.apply {
        addPost(firstVKPost)
        addPost(secondVKPost)
        addPost(thirdVKPost)

        for (i in 0..5) {
            repost(postId = i)
        }

        showWall()
    }
}

fun niceLog(task: String) {
    println("========== Task $task ============")
}
