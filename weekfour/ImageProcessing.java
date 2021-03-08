package week4;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram {
	private GImage flipHorizontal(GImage image) {
		int[][] array = image.getPixelArray();
		int length = array.length;
		for (int p1 = 0; p1< length/2; p1++) {
			int p2= length -p1-1;
			int[] temp = array[p1];
			array[p1] = array[p2];
			array[p2] = temp;
		}
		return new GImage(array);
	}

}
