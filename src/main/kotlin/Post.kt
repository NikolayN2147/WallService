data class Post(
    val id:Int,
    val AuthorId: Int,
    val AuthorName: String,
    val content: String,
    val date: String,
    val likes: Int = 0
)

