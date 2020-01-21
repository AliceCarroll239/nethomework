package homework.secondtask.api.dao

import homework.secondtask.api.model.VkWallList
import homework.secondtask.api.model.VkWallPost

class VkWallDao {
    var postList = VkWallList(
        list = mutableListOf(
            (
                    VkWallPost(
                        author = "Admin",
                        postName = "First",
                        canBeRepost = false
                    )
                    )
        )
    )
    var postsCount: Int = 1

    fun addPost(post: VkWallPost) {
        postsCount++
        postList.list.add(
            VkWallPost(
                id = postsCount,
                author = post.author,
                postName = post.postName,
                canBeRepost = post.canBeRepost
            )
        )
        println("${post.author} create post")
    }

    fun repost(postId: Int) {
        val search = postList.list.filter { it.id == postId }
        with(search) {
            try {
                if ((size > 0) && (last().canBeRepost)) {
                    postsCount++
                    postList.list.add(
                        VkWallPost(
                            id = postsCount,
                            author = last().author,
                            postName = last().postName,
                            canBeRepost = last().canBeRepost
                        )
                    )
                    println("Successful repost author ${last().author} ")
                } else if (!last().canBeRepost) {
                    println("Post with id $postId cannot be reposted")
                }
            } catch (e: java.util.NoSuchElementException) {
                println("No post with id $postId")
            }
        }
    }

    fun showWall() {
        println("++++ Wall Start ++++")
        postList.list.forEach {
            println("${it.id} ${it.author} ${it.postName} ${it.canBeRepost}")
        }
        println("++++ Wall End ++++")
    }
}