class WallService{
    var posts = emptyArray<Post>()
    
    fun add(post:Post) {
        posts += post
    }

    fun update (id:Int):Boolean{
        for((index,post) in posts.withIndex()){
            if (post.id == id){
                posts[index] = post.copy(content = "Измененный пост",likes = post.likes +1)
                return true
            }
        }
        return false
    }

}