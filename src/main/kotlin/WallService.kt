object WallService{
    private var id:Int = 0
    var posts = emptyArray<Post>()

    fun add(post:Post): Array<Post> {
        posts += post
        id++
        return posts
    }



}