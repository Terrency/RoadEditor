import kotlinx.browser.document
import react.*
import react.dom.client.createRoot

fun main() {
    val container = document.getElementById("root") ?: error("Counld't find root Container!")
    createRoot(container).render(App.create())
}
