import org.scalatra.LifeCycle
import javax.servlet.ServletContext
import com.felstar.playpen.scalatra._

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext) {

    context mount (new MyScalatra, "/my/*")
  }
}