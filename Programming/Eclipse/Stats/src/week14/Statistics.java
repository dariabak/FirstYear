package week14;
import java.util.Scanner;

public class Statistics {
	public static void main(String[]args) {
	int arraySize = 0;
	float[] dataPoints;
	Scanner in = new Scanner(System.in);
	System.out.println("How many data points?");
	arraySize = in.nextInt();
	dataPoints = new float[arraySize];
	
	for (int i = 0; i < dataPoints.length; i++) {
		System.out.println("Enter value number" + i + ":");
		dataPoints[i] = in.nextFloat();
	}
	in.close();
	
	printStatistics(dataPoints);
	}
	public static void printStatistics (float[] data) {
		int len = data.length;
		double total = 0;
		for(int i = 0; i < len; i++) {
			total += data[i];
		}
		double mean = total/len;
		
		double variance = 0;
		for(int i = 0; i < len; i++) {
			variance += (data[i] - mean) * (data[i] - mean);
		}
		variance /= len;
		double stdev = Math.sqrt(variance);
		
		System.out.println("Mean: " + mean);
		System.out.println("Variance: " + variance);
	}
}
