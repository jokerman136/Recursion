package Rec.controller;

public class RecController
{
	public void start()
	{
//		for(int spot = 20; spot < 100; spot++)
//		{
//			long startTime = System.currentTimeMillis();
//			System.out.println("The " + spot + "'th position of the Fibonacci sequence is : " 
//					+ getFibonacci(spot) + ". It took " + (System.currentTimeMillis()-startTime)/1000 + " seconds to calculate it.");
//		}
		
		for(int spot = 0; spot < 200; spot++)
		{
			long startTime = System.currentTimeMillis();
			System.out.println("The " + spot + "'th position of the Factorical sequence is: " 
					+ getFact(spot) + ". It took " + (System.currentTimeMillis()-startTime)/1000 + " seconds to calculate it.");
		}
		System.out.println((int) 1.0/0.00);
	}
	
	private long getFibonacci(long pos)
	{
		if(pos == 0 || pos == 1)
		{
			return 1;
		}
		else
		{
			return getFibonacci(pos - 2) + getFibonacci(pos - 1);
		}
	}
	
	private double getFact(double val)
	{
		if(val == 0 || val == 1)
		{
			return 1;
		}
		else
		{
			return val * getFact(val - 1);
		}
	}
}
