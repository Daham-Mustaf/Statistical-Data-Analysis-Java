package statistics;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

public class DescriptiveStas {
	/*
	 * default Constructure
	 */
	public DescriptiveStas() {
	}

	/*
	 * @param double[] The array will contain the values to compute the descriptive
	 * statistics
	 */
	public void getDescStats(double[] values) {

		// Create an object of the DescriptiveStatistics type:
		DescriptiveStatistics stats = new DescriptiveStatistics();

		// Loop through all the values of the double array, and add them to the
		// DescriptiveStatistic object:
		for (int i = 0; i < values.length; i++) {
			stats.addValue(values[i]);
		}

		/*
		 * methods in the DescriptiveStatistics class of Apache Commons Math library to
		 * compute the mean, standard deviation, and median of a group of values
		 */
		double mean = stats.getMean();
		double std = stats.getStandardDeviation();
		double median = stats.getPercentile(50);
		System.out.println(mean + "\t" + std + "\t" + median);
	}
	

	public static void main(String[] args) {
		double[] values = { 68, 100, 12, 70, 11, 7, 45, 44, 90, 6, 100, 15, 0, 56, 88 };
		DescriptiveStas descStatTest = new DescriptiveStas();
		descStatTest.getDescStats(values);
	}
}
