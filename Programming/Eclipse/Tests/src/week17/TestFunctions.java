package week17;

class TestFunctions
{
	int average( int [] inputArray )
	{
		// return the integer average of the values in inputArray
		// empty array should return an average of zero
		int numValues = inputArray.length;
		int total = 0;
		if (numValues == 0) {  //empty array
		return 0;
		} else {
			for (int i : inputArray) {
				total += i;
			}
			return total / numValues;
		}
	}

	float range( float [] inputArray )
	{
		// return the difference between the largest and smallest values in
		// inputArray. Empty array returns zero. All input values lie between
		// -1000.0f and 1000.0f
		
		int numValues = inputArray.length;
		if (numValues == 0) {  //empty array
			return 0.0f;
			} 
		float big = -1001.0f;
		float small = 1001.01f;
		
		for (int i = 0; i < numValues; i++) {
			
			if (inputArray[i] > big) {
				big = inputArray[i];
			}
			
			if (inputArray[i] < small) {
				small = inputArray[i];
			}
		}
		return big - small;
	}

	int collatz( int n )
	{
		// if n is even, return n/2, otherwise return 3*n + 1
		if (n % 2 == 0) {
			return n/2;
		} else {
			return 3*n+ 1;
		}
	}

	int compoundInterest( int capital, int ratePC, int years )
	{
		// return the new capital of compound interest at % per year (ratePC) is accumulated
		// by an integer amount (capital) over an integer number of years (years).
		// return value is rounded to *nearest* integer
		double rate = ratePC * 0.01;
		double newCapital = capital * Math.pow(1.0 + rate,years);
		return (int) (newCapital);
	}
}
