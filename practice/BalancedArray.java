// BSc CSIT TU 2075 Question number 4 solution

/*An array is balanced if its even numbered elements (a[0], a[2], etc) are even and its odd numbered
  elements(a[1], a[3], etc) are odd. Write a function named isBalanced that accepts an array of 
  integers and returns 1 if the array is balanced , otherwise it returns 0.
*/ 

public class BalancedArray
{
	static int isBalanced(int []a)
	{
		int length = a.length;
		boolean balance = false;

		for(int i=0; i<length; i+=2)
		{
			if(i+1<length)
			{
				if(a[i]%2==0 && a[i+1]%2!=0)
				{
					balance = true;
				}
				else
				{
					balance = false;
				}
			}
		}
		if(balance == true){
			return 1;	
		}
		else
		{
			return 0;
		}
	}

	public static void main(String args[])
	{
		int arr1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("arr1 is: \n" + isBalanced(arr1));	
		System.out.println("arr2 is: \n" + isBalanced(arr2));
	}
	
}