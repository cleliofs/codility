import FilesCount._
import org.scalatest.{FlatSpec, Matchers}

class FilesCountTest extends FlatSpec with Matchers {

  "Solution" should "pass" in {
//    var s = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b"
//    Solution.solution(s) shouldBe "music 1011b\nimages 0b\nmovies 10200b\nother 105b"

    var s = "my$%.s\"ong!~_..mp3 11b\ngre@tSong..flac 1000b\nnot.3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b"
    Solution.solution(s) shouldBe "music 1011b\nimages 0b\nmovies 10200b\nother 105b"
  }

}
