
public class BubbleSort 
{
	public static void main(String [] args)
	{
		int [] array = {5,1,4,3,2};
		System.out.println("---ORIGINAL ARRAY---");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("--------------------");
		bubbleSort(array);
		
		System.out.println("---After Sorting---");
		for(int n = 0; n < array.length; n++)
		{
			System.out.println(array[n]);
		}
	}
	public static void bubbleSort(int [] x)
	{
		if(x == null)
		{
			return;
		}
		int N = x.length;
		int walker;
		//Pay Attention to the condition of this loop
		for(int i = N; i > 0; --i)
		{//
			for(int j = 1; j < i;++j)
			{
				if(x[j - 1] > x[j])
				{
					int t = x[j - 1];
					x[j -1] = x [j];
					x[j] = t;
				}
			}
			//System.out.printf("%d times sorting", walker);
			for(walker = 0; walker < x.length; walker++)
			{
				
				System.out.printf("%d th \n", x[walker]);
			}
			System.out.println();
		}
	}
	
}
