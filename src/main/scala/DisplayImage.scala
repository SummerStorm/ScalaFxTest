import java.awt.image.BufferedImage
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.embed.swing.SwingFXUtils
import scalafx.scene.Scene
import scalafx.scene.image.ImageView
import scalafx.stage.Stage

object DisplayImage extends JFXApp {

	var imageOption: Option[BufferedImage] = None

	def launchWithImage(image: BufferedImage): Unit = {
		imageOption = Some(image)
		main(Array())
	}

	def setImage(image: BufferedImage): Unit = { imageOption = Some(image) }

	stage = new JFXApp.PrimaryStage {
		if (imageOption.isEmpty) {
			System.err.println("Fatal error! imageOption is empty.")
			System.exit(1)
		}
		val image = imageOption.get
		width = image.getWidth
		height = image.getHeight
		scene = new Scene {
			val fxImage = SwingFXUtils.toFXImage(image, null)
			content = new ImageView(fxImage)
		}
	}
}
