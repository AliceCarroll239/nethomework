package homework.secondtask.api.model

import kotlinx.serialization.Serializable

@Serializable
data class VkWallList(
    val list: MutableList<VkWallPost>
)

@Serializable
data class VkWallPost(
    val id: Int = 1,
    val author: String,
    val postName: String,
    val canBeRepost: Boolean
)