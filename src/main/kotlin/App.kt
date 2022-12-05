import react.FC
import react.Props
import react.*
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p

val unwatchedVideos = listOf(
    Video(1, "OK", "A", "https://www.baidu.com"),
    Video(2, "OK", "B", "https://www.baidu.com"),
    Video(3, "OK", "C", "https://www.baidu.com")
)
val watchedVideos = listOf(
    Video(4, "Not OK", "D", "https://www.baidu.com")
)
data class Video(val id: Int, val title: String, val speaker: String, val videoUrl: String)

val App = FC<Props> {

    h1 {
        +"KotlinConf Explorer"
    }
    div {
        h3 {
            +"Videos to watch"
        }
        p {
            +"John Doe: Building and breaking things"
        }
        p {
            +"Jane Smith: The development process"
        }
        p {
            +"Matt Miller: The Web 7.0"
        }
        h3 {
            +"Videos watched"
        }
        p {
            +"Tom Jerry: Mouseless development"
        }
    }
    div {
        h3 {
            +"John Doe: Building and breaking things"
        }
        img {
            src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
        }
    }
    VideoList()
}
