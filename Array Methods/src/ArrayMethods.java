
public class ArrayMethods {
	
	public static void main (String[] args)
	{
		//int[] numlist = {1,3,2,5,3,6};
		
		int[] arr1 = {5,10,15};
		int[] arr2 = {1,20,3};
		
		/* long startTime = System.nanoTime();
		printArray(removeDuplicates(numlist));
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Time Taken in nanoseconds: "+ totalTime); */
		
		long startTime = System.nanoTime();
		printMultiArray(productArray(arr1, arr2));
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Time Taken in nanoseconds: "+ totalTime);
		
		printPascalTriangle(pascalTriangle(6));
		
	}
	public static void printArray(int[] arr)
	{
		for(int i = 0;i < arr.length; i++)
		{
			System.out.print("["+arr[i]+"] ");
		}
		System.out.println();
	}
	
	public static void printMultiArray(int[][] arr)
	{
		for(int x = 0; x < arr.length; x++)
		{
			System.out.println("");
			for(int y = 0; y < arr.length; y++)
			{
				System.out.print("["+arr[x][y]+"] ");
			}
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
	
	public static int[][] productArray(int[] arr1, int[] arr2)
	{
		int[][] productArray = new int [arr1.length][arr2.length];
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr2.length; j++)
			{
				productArray[i][j] = arr1[i] * arr2[j];
			}
		}
		
		return productArray;
	}
	
	public static int[][] pascalTriangle(int n)
	{
		int[][] pascalTri = new int[n][]; 
		for(int i = 0; i < n; i++)
		{
			pascalTri[i] = new int[i+1];
			for(int j = 0; j< pascalTri[i].length; j++)
			{
				if((j == 0)||(j == pascalTri[i].length-1))
				{
					pascalTri[i][j] = 1;
				}
				else
				{
					pascalTri[i][j] = pascalTri[i-1][j-1]+pascalTri[i-1][j];
				}
				//pascalTri[i][j] = 1;
			}
		}
		return pascalTri;
		
	}
	public static void printPascalTriangle(int[][]pTriangle)
	{
		
		int n = pTriangle.length;
		for(int i = 0; i < n; i++)
		{
			System.out.println();
			for(int j = 0;j < pTriangle[i].length; j++)
			{
				System.out.print("[" + pTriangle[i][j] + "]" );
			}
		}
	}
	public static int countUnique(int[] numbers)
	{
		int count = 0;
		for(int i = 0; i<numbers.length;i++)
		{
			boolean unique = true;
			for(int j = i+1; j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					unique = false;
					break;
				}
			}
			if(unique)
			{
				count++;
			}
		}
		return count;
	}
}
