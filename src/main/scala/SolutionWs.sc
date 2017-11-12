val s = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b"

s.split("\n").foreach(println)

//val regex = "[.]+\\s([0-9]+)b".r
val regex = """.+\.(.+) ([0-9]+)b""".r

//val regex(name, bytes) = "my.song.mp3 11b"
//val regex(name, bytes) = "greatSong.flac 1000b"
//val regex(name, bytes) = "not3.txt 5b"
//val regex(name, bytes) = "video.mp4 200b"
//val regex(name, bytes) = "game.exe 100b"
//val regex(name, bytes) = "mov.e.mkv 10000b"
//val regex(name, bytes) = "my$%.song.mp3 11b"
//val regex(name, bytes) = "gre@tSong.flac 1000b"
val regex(name, bytes) = "no~_.t3.txt 5b"



val musicExtensions = Array("mp3", "acc", "flac")
val imageExtensions = Array("jpg", "bmp", "gif")
val movieExtensions = Array("mp4", "avi", "mkv")
//val otherExtensions = Array("mp4", "avi", "mkv")


