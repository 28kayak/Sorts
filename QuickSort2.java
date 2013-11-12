
public class QuickSort2
{
	private int[] num = {1,4,2,19,34,5,3,100,40};
	public void quicksort(int i, int j)
	{
		if(i >= j)
		{
			return;
		}
		int temp = partion(i,j);
		quicksort(i, temp-1);
		quicksort(temp+1, j);
	}
	public int partion(int x, int y)
	{
		int temp = num[x];
		while(x < y)
		{
			while( x<y && num[y] >= temp)
			{
				y--;
			}
			num[x] = num[y];
			while(x<y && num[x] <= temp)
			{
				x++;
			}
			num[y] = num[x];
		}
		num[x] = temp;
		return x;
	}
	public void print()
	{
		for(int i = 0; i < 9; i++)
		{
			System.out.println(num[i] + " ");
		}
	}
	public static void main(String[] args)
	{
		QuickSort2 q = new QuickSort2();
		System.out.println("initial ordered");
		q.print();
		System.out.println("sroting");
		q.quicksort(0, 8);
		System.out.println("final ordered");
		q.print();
	}	

}
