import react.FC
import react.Props
import react.dom.html.ReactHTML

val VideoList = FC<Props>{
    for(video in unwatchedVideos){
        ReactHTML.p {
            +"${video.speaker}: ${video.title}"
        }
    }
}
