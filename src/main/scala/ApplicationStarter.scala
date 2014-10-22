package car.cadr

import java.awt.image.BufferedImage

object ApplicationStarter {
	def main(args: Array[String]) =
		DisplayImage.launchWithImage(new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB))
}