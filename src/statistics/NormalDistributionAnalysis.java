package statistics;

import org.apache.commons.math3.distribution.NormalDistribution;
/*
 * Create a normal distribution using the given mean and standard deviation.
 */

public class NormalDistributionAnalysis {

	public NormalDistributionAnalysis() {
	}

	/*
	 * @param mu is the mean or expectation of the distribution.
	 *
	 * @param the parameter sigma is its standard deviation centered at where x = μ
	 */

	static int n = 32;
	static double p = 0.5;
	static double mu = n * p;
	// σ2 = n*p*(1-p)
	static double sigma = Math.sqrt(n * p * (1 - p));

	public static void main(String[] args) {
		NormalDistribution nd = new NormalDistribution(mu, sigma);

		/*
		 *  For this distribution, the area of the region is P(17.5 < X ≤ 21.5)
		 *  P(17.5 < X ≤ 21.5) = Φ(17.5)- Φ(21.5).
		 */
		double a = 17.5, b = 21.5;
		// cumulativeProbability() method returns the value of Φ(x).
		double Φa = nd.cumulativeProbability(a);
		System.out.printf("Φ(a) = %6.4f%n", Φa);
		double Φb = nd.cumulativeProbability(b);
		System.out.printf("Φ(b) = %6.4f%n", Φb);
		System.out.printf("Φ(b) - Φ(a) = %6.4f%n", Φb - Φa);
	}
}
