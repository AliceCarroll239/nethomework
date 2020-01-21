package homework.secondtask.api.dao

import kotlinx.serialization.Serializable

@Serializable
data class VkWallList(
    val list: MutableList<VkWallPost>
)

@Serializable
data class VkWallPost(
    val id: Int,
    val author: String,
    val postName: String,
    val canBeRepost: Boolean
)