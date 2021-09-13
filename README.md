# Statistical-Data-Analysis-Java

[- Introduction](#introduction)
- [Generating descriptive statistics:](#des)
- [Computing frequency distribution:](#f)
- [Binimial Distribution:](#bi)

## Introduction <a name="introduction"></a>
Applying the basic principles of statistics to data science provides vital insight into our data. Statistics is a powerful tool. Used correctly, it enables us to be sure of our decision-making process. However, it is easy to use statistics incorrectly.

Generating descriptive statistics: <a name="des"></a>
Descriptive statistics are used to summarize a sample and are not generally developed
based on probability theories. statistics are mostly used to draw a conclusion about the population from a representative sample of it.<br />
[DescriptiveStas](https://github.com/Daham-Mustaf/Statistical-Data-Analysis-Java/blob/main/src/statistics/DescriptiveStas.java) computed the mean, standard deviation, and median of a group of values. 
1- Create an object of the DescriptiveStatistics type:

```Java
// Create an object of the DescriptiveStatistics type:
		DescriptiveStatistics stats = new DescriptiveStatistics();

		// Loop through all the values of the double array, and add them to the
		// DescriptiveStatistic object:
		for (int i = 0; i < values.length; i++) {
			stats.addValue(values[i]);
		}
```
There are methods in the `DescriptiveStatistics` class of Apache Commons Math library to compute the mean, standard deviation, and median of a group of values. Call these methods to get the descriptive statistics of the values:

```Java
/*
		 * methods in the DescriptiveStatistics class of Apache Commons Math library to
		 * compute the mean, standard deviation, and median of a group of values
		 */
		double mean = stats.getMean();
		double std = stats.getStandardDeviation();
		double median = stats.getPercentile(50);
		System.out.println(mean + "\t" + std + "\t" + median);
	}
```

## Computing frequency distribution: <a name="f"></a>
with class `FrequencyStats.java` [FrequencyStats](https://github.com/Daham-Mustaf/Statistical-Data-Analysis-Java/blob/main/src/statistics/FrequencyStats.java)
The interface `Frequency` is very simple, and in most cases, it requires very few lines of code to get the desired calculations done.
```Java
//Create a method that takes a double array as argument. We will be computing the frequency distributions of the values of this array:
          
          public void getFreqStats(double[] values){
        
//Create an object of the Frequency class:
           Frequency freq = new Frequency();
          
//Add the values of the double array to this object:
           for( int i = 0; i < values.length; i++) {
               freq.addValue(values[i]);
}
```
## Binimial Distribution:<a name="bi"></a>
[BinomialDistributionAnalysis](https://github.com/Daham-Mustaf/Statistical-Data-Analysis-Java/blob/main/src/statistics/BinomialDistributionAnalysis.java) Create a binomial distribution with the given number of trials and probability of success.
```Java
}
	/*
	 * Create a binomial distribution with the given number of trials and
	 * probability of success.
	 */

	static final int n = 10;
	static final double p = 0.75;
```
Create a binomial distribution with the given number of trials and probability of success.
```Java
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
```
[Statistcs ](https://github.com/Daham-Mustaf/Statistical-Data-Analysis-Java/blob/main/src/statistics/Statistcs.java) we can laod a data and read from csv select the columen that we wan to perform on a statistcal analysis. change the column date to an array. <br />
- class 
```Java
DescriptiveStas
```
[DescriptiveStas](https://github.com/Daham-Mustaf/Statistical-Data-Analysis-Java/blob/main/src/statistics/DescriptiveStas.java) computed the mean, standard deviation, and median of a group of values. 
