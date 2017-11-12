object FilesCount {

  object Solution {

    var files: Map[String, Int] = Map("music" -> 0, "images" -> 0, "movies" -> 0, "other" -> 0)

    val musicExtensions = Array("mp3", "acc", "flac")
    val imageExtensions = Array("jpg", "bmp", "gif")
    val movieExtensions = Array("mp4", "avi", "mkv")

    val regexPattern = """.+\.(.+) ([0-9]+)b""".r

    def solution(s: String): String = {

      s.split("\n").foreach { l =>
        val regexPattern(extension, bytes) = l
        if (musicExtensions.contains(extension)) {
          files += "music" -> (files("music") + bytes.toInt)
        } else if (imageExtensions.contains(extension)) {
          files += "images" -> (files("images") + bytes.toInt)
        } else if (movieExtensions.contains(extension)) {
          files += "movies" -> (files("movies") + bytes.toInt)
        } else {
          files += "other" -> (files("other") + bytes.toInt)
        }
      }

      s"music ${files("music")}b\nimages ${files("images")}b\nmovies ${files("movies")}b\nother ${files("other")}b"
    }
  }

}
