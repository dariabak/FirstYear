package asciIArt;

import java.awt.*; 
import java.awt.image.*; 
import javax.imageio.*; 
import java.io.*;


public class Image2Ascii {
	BufferedImage bImage = null; 
	int imageWidth = 0;
	int imageHeight = 0;
	int [][] greyValues;
	String ramp = " .:-=+*#%@";
	String ramp2 = "@%#*+=-:. ";

	void Print() {
		for (int j = 0; j < imageHeight; j+= 2) {
			for (int i = 0; i < imageWidth; i++) {
				int rampIndex = 10 * greyValues [j][i] / 256; 
				char thisChar = ramp.charAt(rampIndex);
				System.out.print(thisChar);
			}
			System.out.println();
		}
	}

	void PrintWarhol() {
		for (int t = 0; t < 2; t++) {
			for (int j = 0; j < imageHeight; j+= 2) {
				for (int i = 0; i < imageWidth; i++) {
					int rampIndex = 10 * greyValues [j][i] / 256; 
					char thisChar = ramp.charAt(rampIndex);
					System.out.print(thisChar);
				}

				for (int k = 0; k < imageWidth; k++) {
					int rampIndex = 10 * greyValues [j][k] / 256; 
					char thisChar = ramp2.charAt(rampIndex);
					System.out.print(thisChar);

				}
				System.out.println();	
			}
			ramp = "@%#*+=-:. ";
			ramp2 = " .:-=+*#%@";
		}
	}
	void LoadImage( String fileName ) {
		try
		{
			bImage = ImageIO.read( new File(fileName) ); 
			imageWidth = bImage.getWidth();
			imageHeight = bImage.getHeight();
			greyValues = new int [imageHeight][imageWidth];

			for (int j = 0; j < imageHeight; j ++) {
				for (int i = 0; i < imageWidth; i ++) {
					Color pixel = new Color( bImage.getRGB( i, j ) );
					int red = pixel.getRed();
					int green = pixel.getGreen();
					int blue = pixel.getBlue();
					int grey = ( red + 2*green + blue ) / 4;
					greyValues[j][i] = grey;
				}
			}
		}
		catch (Exception e ) {
			System.out.println("could not open image file "+ fileName); 
		}
	}
} 
