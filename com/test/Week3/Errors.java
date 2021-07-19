/* 	
 	Daniel Potter
	18/02/21
 	Errors 
*/

package com.test.Week3;

public class Errors
{

	public static void main(String[] args)
	{
		int age = 30;
		int retirementFund = 10000;
		int yearsInRetirement = 0;
		int monthlyPension;
		String name = "Mary Black";
		
		for(int i=age;i<=65;i++)
		{
			recalculate(retirementFund, 0.1);
		}
		monthlyPension = retirementFund/yearsInRetirement/12;
		System.out.println(name +" will have $"+monthlyPension+" per month for retirement");
	}
	
	//method to recalculate fund
	public static void recalculate(int fundAmount, double rate)
	{
		fundAmount *= (1 + rate);
	}
}



