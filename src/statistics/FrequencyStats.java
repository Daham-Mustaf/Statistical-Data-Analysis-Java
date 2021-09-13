package statistics;

import org.apache.commons.math3.stat.Frequency;

public class FrequencyStats {
	public static void main(String[] args) {
		// create date of double array.
		double[] values = { 32, 39, 14, 98, 45, 44, 45, 34, 89, 67, 0, 15, 0, 56, 88 };
		// create an object of FrequencyStats
		FrequencyStats freqTest = new FrequencyStats();
		freqTest.getFreqStats(values);
	}
	/*
	 * 
	 */

	public void getFreqStats(double[] values) {
		
		Frequency freq = new Frequency();
		//Add the values of the double array to this object:
		for (int i = 0; i < values.length; i++) {
			freq.addValue(values[i]);
		}
		// Generate the frequency for each value in the array:
		for (int i = 0; i < values.length; i++) {
			System.out.println(freq.getCount(values[i]));
		}
	}
}
