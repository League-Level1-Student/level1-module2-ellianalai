package _99_extra;

public class PixelPartyRunner {
	public static void main(String arg[]) {
		PixelParty pixelparty = new PixelParty();
		pixelparty.setRainbow(true);
		pixelparty.drawRectangle(10, 10,50, 10);
		pixelparty.drawCircle(50, 50,10);
		pixelparty.saveImage();
		pixelparty.displayImage();
	}
}
