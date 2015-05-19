public class Factorial
{
	/*Solves factorial of n problem recursively*/
	public static int factorial( int factorial )
	{
		int sol1, mySol;

		if ( factorial == 0 /* the base cases */ )
			return 1; // The readily available solution for the base case     
		else
		{
			// factorial(n) is solved using solutions of 
			// the smaller problem factorial(n-1)...
	 
			sol1 = factorial ( factorial-1 );  	// Solve a smaller problem
			mySol = factorial * sol1;       	// Use the solution of the smaller problem
	                         					// to solve the original problem
			return mySol;
		}
	}
	
	public static void testFactorial(int n, int Answer)
    {
		System.out.print("Calling factorial(" + n + ") ... ");

        int result = factorial(n);

        if (result == Answer)
            System.out.println(n + "! = " + result + ", good.");
        else
            System.out.println(n + "! = " + result + " not " + Answer + ", ERROR!");
    }

	public static void main(String args[])
	{	
       testFactorial(3, 6 );
       testFactorial(7, 5040 );
       testFactorial(10, 3628800 );

       System.out.println();
	}
}
