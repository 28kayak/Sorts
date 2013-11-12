import java.util.Scanner;
import java.util.Random;
public class QuiqkSort
{
	static void makedata(int [] a, int n)
	{//put random number into array named a 
		Random rand = new Random();
		for(int i = 0; i<n ; i++)
		{
			a[i]=rand.nextInt(1000);
		}
	}
	static void swap(int [] a, int idx1, int idx2)
	{//swapping method
		int t = a[idx1];
		a[idx1] =a[idx2];
		a[idx2] = t;
	}
	static void quickSort(int [] a, int left, int right)
	{
		int pl = left;//left cursor
		int pr = right;//right cursor
		int x = a[(pl+pr)/2];//central element
		System.out.println("befor while");

		do{
			System.out.println("in while");
			while(a[pl] < x)
			{
				System.out.println("inside while1");
				pl++;
			}
			while(a[pr] > x)
			{
				System.out.println("inside while2");
				pr--;
			}
			if(pl <= pr)
			{
				System.out.println("swap");
				swap(a, pl++, pr--);
			}
		}while(pr >= pr);
		System.out.println("after while");
		if(left < pr)
		{
			quickSort(a, left, pr);
		}
		if(pl < right)
		{
			quickSort(a, pl, right);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("quick sorting");
		System.out.println("number of elements:");
		int n = scan.nextInt();
		int [] x = new int[n];
		makedata(x,n);
		for(int i = 0; i < n; i++)
		{
			System.out.println("x[" + i +"]=" + x[i]);
		}
		System.out.println("ready");
		quickSort(x,0,n-1);
		System.out.println("Done sort");
		for(int i = 0; i < n;i++)
		{
			System.out.println( "x[" + i +"]=" + x[i]);
		}

	}

}
