package statistics;

import static tech.tablesaw.aggregate.AggregateFunctions.max;
import static tech.tablesaw.aggregate.AggregateFunctions.mean;
import static tech.tablesaw.aggregate.AggregateFunctions.median;
import static tech.tablesaw.aggregate.AggregateFunctions.min;

import java.io.IOException;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

import com.google.common.math.Stats;

import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.Table;

public class Statistcs{

	public static void main(String[] args) throws IOException {
		/*
		 * loading whole date from csv.
		 * to do statistical analysis
		 */

		System.out.println("####tablesaw lib#####\n");
		Table dataTable = Table.read().csv("/Users/m-store/eclipse-workspace/StatisticalDataAnalysis/Bitcoin-usd.csv");
		Table diabetes = dataTable.structure();
		System.out.println(diabetes);
		DoubleColumn highColumn = (DoubleColumn) dataTable.nCol("High");
		// Using tablesaw to find mean
		System.out.println("highColumn mean: " + highColumn.mean());
		Table highDistribution = dataTable.summarize(highColumn, mean, max, min, median).apply();
		System.out.println(highDistribution);

		/*
		 * 2- Using Google Guava to find mean Download JAR File add to build path.
		 * https://www.sourcecodeexamples.net/2019/11/guava-maven-dependency.html The
		 * Stats class provides functionalities for handling numeric data, including
		 * finding mean and standard deviation. generat a Stats object using diabetes
		 * Table and then execute the mean method:
		 */
		System.out.println("\n####Google Guava lib#####\n");
		Stats testStat = Stats.of(highColumn);
		double mean = testStat.mean();
		System.out.println("mean: " + mean);
		// populationStandardDeviation
		double psd = testStat.populationStandardDeviation();
		System.out.println("The population Standard Deviation: " + psd);
		// sampleStandardDeviation
		double ssd = testStat.sampleStandardDeviation();
		System.out.println("The sample Standard Deviation: " + ssd);

		System.out.println("####\ncommons-math3 lib #####\n");

		// main tasks
		/*
		 * dependency for commons-math3 to help with Analytics read from Table of a
		 * given csv file store a Date to a variable. store date in a double array
		 * asDoubleArray() from tablesaw. add date to descriptiveStatistics object.
		 */

		double[] doArr = highColumn.asDoubleArray();
		DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
		for (int i = 0; i < doArr.length; i++) {
			descriptiveStatistics.addValue(doArr[i]);
			
		}
		// All of these quantities are available
		// Count the number of points in the dataset:
		System.out.println(descriptiveStatistics);
		long count = descriptiveStatistics.getN();

		// Sum We can also access the sum of all values:
		double sum = descriptiveStatistics.getSum();

		// Min To retrieve the minimum value dataset, we use this:
		double min = descriptiveStatistics.getMin();

		// Max To retrieve the maximum value in the dataset, we use this:
		double max = descriptiveStatistics.getMax();
		// Mean The average value of the sample or mean is calculated directly:
		double meanOf = descriptiveStatistics.getMean();
		// variance is required, we are asking for the bias-corrected
		double variance = descriptiveStatistics.getVariance();
		double populationVariance = descriptiveStatistics.getPopulationVariance();

		// Standard deviation μ +– σ, which can indicate how much the data deviates from
		// the mean.
		double standardDeviation = descriptiveStatistics.getStandardDeviation();
		System.out.println("standardDeviation: " + standardDeviation);
		// Error on the mean
		double meanErr = descriptiveStatistics.getStandardDeviation() / Math.sqrt(descriptiveStatistics.getN());
		System.out.println("Error on the mean: " + meanErr);

		// skewness
		double skewness = descriptiveStatistics.getSkewness();

		// kurtosis
		double kurtosis = descriptiveStatistics.getKurtosis();

	}

}
