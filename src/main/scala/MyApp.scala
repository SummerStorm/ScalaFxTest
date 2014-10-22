import scalafx.application.JFXApp
import scalafx.stage.Stage

object MyApp {
	def main(args: Array[String]) {
		MyApp.launch(classOf[MyApp], args: _*)
	}
}

class MyApp extends JFXApp {

	override def start(primaryStage: Stage): Unit = {
		// initialization here
	}
}
