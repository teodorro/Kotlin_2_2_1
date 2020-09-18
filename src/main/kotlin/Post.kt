data class Post(
    var id: Int,
    val ownerId: Int,
    var fromId: Int,
    var createdBy: Int,
    val date: Int,
    var text: String,
    var replyOwnerId: Int,
    var replyPostId: Int,
    var friendsOnly: Boolean,
    var comments: Comments,
    var copyright: String,
    var likes: Likes,
    var views: Views,
    var postType: String,
    var signerId: Int,
    var canPin: Boolean,
    var canDelete: Boolean,
    var canEdit: Boolean,
    var isPinned: Boolean,
    var markedAsAds: Boolean,
    var isFavorite: Boolean,
    var postponedId: Boolean
)