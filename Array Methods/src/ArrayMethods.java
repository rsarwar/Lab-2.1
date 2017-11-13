
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
		
		int len = list.length;
		for(int i = 0; i<len;i++)
		{
			for(int j = i+1;j<len;j++)
			{
				if(list[i] == list[j])
				{
					for(int h = j+1; h<len;h++)
					{
						list[j] = list[h];
					}
					len--;
					j--;
				}
			}
		}
		
		int[] newArr =  new int[len];
		for(int i = 0;i<len;i++)
		{
			newArr[i] = list[i];
		}
		
		/*for(int i = 0; i<list.length-2;i++)
		{
			for(int j = i+1;j<list.length-1;j++)
			{
				if(!(list[i] == list[j]))
				{
					newArr[i] = list[j];
				}
			}
		}*/
		
		return newArr;
	}
}
