
public class ArrayMethods {

	public static void main (String[] args)
	{
		int[] numlist = {1,3,2,5,3,6};
		printArray(removeDuplicates(numlist));
	}
	public static void printArray(int[] arr)
	{
		for(int i = 0;i < arr.length; i++)
		{
			System.out.print("["+arr[i]+"] ");
		}
		System.out.println();
	}
	public static int[] removeDuplicates(int[] list)
	{
		
		int counter = 0;
		for(int i = 0; i<list.length-1;i++)
		{
			for(int j = 1;j<list.length;j++)
			{
				if(!(list[i] == list[j]))
				{
					counter++;
				}
			}
		}
		
		int[] newArr =  new int[counter];
		
		for(int i = 0; i<list.length-1;i++)
		{
			for(int j = i+1;j<list.length;j++)
			{
				if(!(list[i] == list[j]))
				{
					newArr[i] = list[j];
				}
			}
		}
		
		return newArr;
	}
}
