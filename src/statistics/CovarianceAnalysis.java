package statistics;

import org.apache.commons.math3.stat.correlation.Covariance;

  /*
  * a class for calculating covariance of two sets of data points
  */

public class CovarianceAnalysis {

	public CovarianceAnalysis() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * Create a method that takes two one-dimensional double arrays. Each array
	 * represents a set of data points:
	 */
	public void cov(double[] x, double[] y) {
		/*
		 * Calculate the covariance of the two sets of data points:
		 */
		double covariance = new Covariance().covariance(x, y, false);// If

		/*
		 * for non-bias-corrected covariance we use three parameters in the covariace()
		 * method. To use unbiased covariance between two double array.
		 */
		// double covariance = new Covariance().covariance(x, y);
		System.out.printf("cov: %6.4f%n", covariance);

	}

	public static void main(String[] args) {
		CovarianceAnalysis covarianceTest = new CovarianceAnalysis();
		double[] xIntegers = { 6.9, 8.8, 9.9, 12.02 };
		double[] yIntegers = { 12.12, 34.23, 1.221, 0.0 };

		covarianceTest.cov(xIntegers, yIntegers);

	}

}
