
public class SerectionSort  
{
	public static void main(String []args)
	{
		int [] array = {5,1,4,2,3};
		System.out.println("----ORIGINAL ARRAY----");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("----------------------");
		
		serectionSort(array);
		
		System.out.println("---After Serection Sort---");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("--------------------------");
	}
	public static void serectionSort(int [] x)
	{
		if(x==null)
		{
			return;
		}
		int N = x.length;
		
		for(int i = 0; i < N; ++i)
		{//look for the smallest value after located i-th
			int minIndex = i;
			for(int j = i + 1; j < N; j++)
			{
				if(x[j] < x[minIndex])
				{
					minIndex = j;
				}
			}
			//Replace with i-th index
			int t = x[i];
			x[i] = x[minIndex];
			x[minIndex] = t;
			for(int k = 0; k < x.length;k++)
			{
				System.out.println(x[k]);
			}
			System.out.println();
			
		}
	}

}
