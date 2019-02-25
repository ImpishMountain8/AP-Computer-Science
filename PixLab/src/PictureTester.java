/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	// Method to test zeroRed
	public static void testZeroRed() {
		Picture beach = new Picture("Beach.jpg");
		beach.explore();
		beach.zeroRed();
		beach.explore();
	}

	// Method to test zeroGreen
	public static void testZeroGreen() {
		Picture beach = new Picture("Beach.jpg");
		beach.explore();
		beach.zeroGreen();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	public static void convertToBlackAndWhite() {
		Picture pic = new Picture("femaleLionAndHall.jpg");
		pic.explore();
		Pixel[][] picPixels = pic.getPixels2D();
		for (Pixel[] rowArray : picPixels) {
			for (Pixel pixObj : rowArray) {
				double average = pixObj.getAverage();
				int i = (int) average;
				pixObj.setBlue(i);
				pixObj.setRed(i);
				pixObj.setGreen(i);
			}
		}
		pic.explore();
	}

	public static void adjustBrightness(double x) {
		Picture pic = new Picture("koala.jpg");
		pic.explore();
		Pixel[][] picPixels = pic.getPixels2D();
		for (Pixel[] rowArray : picPixels) {
			for (Pixel pixObj : rowArray) {
				double y = x;
				int highest = Math.max(Math.max(pixObj.getRed(), pixObj.getBlue()), pixObj.getGreen());
				if (highest * x > 255) {
					y = 255.0 / highest;
				}
				pixObj.setRed((int) (pixObj.getRed() * y));
				pixObj.setBlue((int) (pixObj.getBlue() * y));
				pixObj.setGreen((int) (pixObj.getGreen() * y));
			}
		}
		pic.explore();
	}

	public static void verticalMirror(){
		Picture pic = new Picture("redMotorcycle.jpg");
		pic.explore();
		Pixel [][] picPixels = pic.getPixels2D();
		for(int row = 0; row < picPixels.length; row++){
			for(int col = 0; col < picPixels[row].length/2; col++){
				picPixels[row][picPixels[row].length - 1 - col].setColor(picPixels[row][col].getColor());
			}
		}
		pic.explore();
	}
	
	public static void horizontalMirror(){
		Picture pic = new Picture("redMotorcycle.jpg");
		pic.explore();
		Pixel [][] picPixels = pic.getPixels2D();
		for(int row = 0; row < picPixels.length/2; row++){
			for(int col = 0; col < picPixels[row].length; col++){
				picPixels[picPixels.length - 1 - row][col].setColor(picPixels[row][col].getColor());
			}
		}
		pic.explore();
	}
	
	public static void flipHorizontal(){
		Picture pic1 = new Picture("butterfly1.jpg");
		Picture pic2 = new Picture("butterfly1.jpg");
		pic1.explore();
		Pixel [][] picPixels1 = pic1.getPixels2D();
		Pixel [][] picPixels2 = pic2.getPixels2D();
		for(int row = 0; row < picPixels1.length; row++){
			for(int col = 0; col < picPixels1[row].length; col++){
				picPixels2[row][picPixels1[row].length - 1 - col].setColor(picPixels1[row][col].getColor());
			}
		}
		pic2.explore();
	}
	
	public static void flipVertical(){
		Picture pic1 = new Picture("butterfly1.jpg");
		Picture pic2 = new Picture("butterfly1.jpg");
		pic1.explore();
		Pixel [][] picPixels1 = pic1.getPixels2D();
		Pixel [][] picPixels2 = pic2.getPixels2D();
		for(int row = 0; row < picPixels1.length; row++){
			for(int col = 0; col < picPixels1[row].length; col++){
				picPixels2[picPixels1.length - 1 - row][col].setColor(picPixels1[row][col].getColor());
			}
		}
		pic2.explore();
	}
	
	public static void repairTemple(){
		Picture pic = new Picture("temple.jpg");
		pic.explore();
		Pixel [][] picPixels = pic.getPixels2D();
		for(int row = 27; row < 97; row++){
			for(int col = 13; col < 276; col++){
				picPixels[row][picPixels[row].length - 14 - col].setColor(picPixels[row][col].getColor());
			}
		}
		pic.explore();
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroBlue();
		// testZeroRed();
		// testZeroGreen();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		testCollage();
		// testCopy();
		// testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
		// convertToBlackAndWhite();
		// adjustBrightness(6);
		//verticalMirror();
		//horizontalMirror();
		//flipHorizontal();
		//flipVertical();
		//repairTemple();
		
	}
}