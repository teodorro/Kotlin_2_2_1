fun main() {
    WallService.add(Post(1, 2, 3, 4, 5, "asd", 6, 7, true,
    Comments(1, true, true, true, true),
    "asd",
    Likes(1, true, true, true),
    Views(2), "qw", 3, true, true, true, true, true, true, true))

    WallService.add(Post(11, 12, 13, 14, 15, "1asd", 16, 17, true,
        Comments(11, true, true, true, true),
        "1asd",
        Likes(11, true, true, true),
        Views(12), "1qw", 13, true, true, true, true, true, true, true))

    WallService.print()
}