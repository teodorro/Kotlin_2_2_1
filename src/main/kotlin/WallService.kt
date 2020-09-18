object WallService {
    private var nextId: Int = 1
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post{
        post.id = nextId++
        posts += post
        return posts.last()
    }

    fun print(){
        for (post in posts)
            println(post)
    }

    fun update (post: Post): Boolean{
        var ind : Int = -1;

        for ((index, p) in posts.withIndex()){
            if (p.id == post.id){
                ind = index
                break
            }
        }

        if (ind < 0)
            return false

        val postNew = post.copy(ownerId = posts[ind].ownerId, date = posts[ind].date);
        posts[ind] = postNew;
        return true
    }

}