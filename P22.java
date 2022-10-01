//Reference: https://www.youtube.com/watch?v=eMSfBgbiEjk

import java.util.*;
class P22
{
	/*
	
	Approach 1:
	
	public static int maxProfit(int prices[]) 	// T.C.=O(n2)
	{
		int i,j,profit=0,n=prices.length;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(prices[j]-prices[i]>profit)
				{
					profit=prices[j]-prices[i];
				}
			}
		}
		return profit;
	}
	
	*/
	
	public static int maxProfit(int prices[])	//T.C.=O(n)
	{
		int i,profit=0,n=prices.length,min=Integer.MAX_VALUE,value;
		for(i=0;i<n;i++)
		{
			min=(min<prices[i])?min:prices[i];	//for storing the minimal price
			value=prices[i]-min;	// finding current profit
			if(value>profit)		// finding max possible profit
			{
				profit=value;
			}
		}
		return profit;
	}
	
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the share prices:");
		String s=sc.nextLine();
		String p[]=s.split("\\s+");
		int prices[]=new int[p.length];
		int i,profit;
		for(i=0;i<p.length;i++)
		{
			prices[i]=Integer.parseInt(p[i]);
		}
		System.out.println("Prices Array:");
		for(i=0;i<p.length;i++)
		{
			System.out.println(prices[i]);
		}
		profit=maxProfit(prices);
		System.out.println("Maximum Profit is: "+profit);
	}
}