package statistics;

import org.apache.commons.math3.distribution.BinomialDistribution;

public class BinomialDistributionAnalysis {
	public BinomialDistributionAnalysis() {
	}
	/*
	 * Create a binomial distribution with the given number of trials and
	 * probability of success.
	 */

	static final int n = 10;
	static final double p = 0.75;

	public static void main(String[] args) {

		BinomialDistribution bd = new BinomialDistribution(n, p);
		
		for (int x = 0; x <= n; x++) {
			System.out.printf("%4d%8.4f%n", x, bd.probability(x));
		}
		
		System.out.printf("mean: %6.4f%n", bd.getNumericalMean());
		/**
	     * For  n trials and probability parameter p, the variance is
	     * { n * p * (1 - p)}.
	     */
		double variance = bd.getNumericalVariance();
		double stdv = Math.sqrt(variance);
		System.out.printf("standard deviation: %6.4f%n", stdv);
	}
}
