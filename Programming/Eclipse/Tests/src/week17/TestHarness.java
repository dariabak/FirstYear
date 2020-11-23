package week17;

public class TestHarness
{
	static TestFunctions functions;
	
	static void testAverage()
	{
		int [][] input = { {}, {1, 2}, {0, 0, 0}, {5, 5, 5, 5, 5, 6}, {1, 2, 3, 4} };
		int [] output = { 0, 1, 0, 5, 2 };
		int numTestCases = input.length;
		System.out.println("***********\nTesting Average ");
		int passed = 0;
		for ( int i = 0; i < numTestCases; i++ )
		{
			int result = functions.average(input[i]);
			if ( result != output[i] )
			{
				System.out.println("Test "+i+" failed. Expected "+output[i]+" got "+result);
			}
			else
			{
				passed++;
				System.out.println("Test "+i+" passed!");
			}
		}
		System.out.println("Finished testing Average - passed "+passed+" out of "+numTestCases);
	}

	static void testRange()
	{
	    float [][] input = { {}, {1.0f}, {2.0f, 2.0f}, {-1000.0f, 0.0f}, {1000.0f, -1000.0f, 2.0f, 5.0f}, {-1000.0f, -999.9f}, {1000.0f}  };
		float [] output = { 0.0f, 0.0f, 0.0f, 1000.0f-0.0f, 1000.0f+1000.0f, -999.9f+1000.0f, 0.0f };
		int numTestCases = input.length;
		System.out.println("***********\nTesting Range ");
		int passed = 0;
		for ( int i = 0; i < numTestCases; i++ )
		{
			float result = functions.range(input[i]);
			if ( result != output[i] )
			{
				System.out.println("Test "+i+" failed. Expected "+output[i]+" got "+result);
			}
			else
			{
				passed++;
				System.out.println("Test "+i+" passed!");
			}
		}
		System.out.println("Finished testing Range - passed "+passed+" out of "+numTestCases);
	}
	
	static void testCollatz()
	{
	    int [] input = { 0, 1, 2, 10, 11 };
		int [] output = { 0, 4, 1, 5, 34 };
		int numTestCases = input.length;
		System.out.println("***********\nTesting Collatz ");
		int passed = 0;
		for ( int i = 0; i < numTestCases; i++ )
		{
			int result = functions.collatz(input[i]);
			if ( result != output[i] )
			{
				System.out.println("Test "+i+" failed. Expected "+output[i]+" got "+result);
			}
			else
			{
				passed++;
				System.out.println("Test "+i+" passed!");
			}
		}
		System.out.println("Finished testing Collatz - passed "+passed+" out of "+numTestCases);
	}
	

	static void testCompoundInterest()
	{
		int [] capital = {0, 5000, 10000, 10000, 0};
		int [] ratePC = {0, 1, 5, 1, 5};
		int [] years = {0, 10, 10, 0, 10};
		int [] output = {0, 5523, 16289, 10000, 0};

		int numTestCases = capital.length;
		System.out.println("***********\nTesting CompoundInterest ");
		int passed = 0;
		for (int i = 0; i < numTestCases; i++ )
		{
			int result = functions.compoundInterest(capital[i], ratePC[i], years[i]);
			if (result != output[i] )
			{
				System.out.println("Test "+i+" failed. Expected "+output[i]+" got "+result);
			}
			else
			{
				passed++;
				System.out.println("Test "+i+" passed!");
			}
		}
		System.out.println("Finished testing CompoundInterest - passed "+passed+" out of "+numTestCases);
	}


	public static void main( String args[] )
	{
		functions = new TestFunctions();
		testAverage();
		testRange();
		testCollatz();
		testCompoundInterest();
	}
}
