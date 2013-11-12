
public class BubbleSort1 
{
	private static final String SEPARETER = " ";
	
	public static String exectute(String parameter)
	{
		String data[] = parameter.split(SEPARETER);
		sort(data);
		String rtn = returnParameter(data);
		return rtn;
	}
	
	public static void sort(String [] data)
	{
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j + 1 < data.length; j++)
			{
				compare(data, j, j+1);
			}
		}
	}
	public static void compare(String [] data, int previousIndex, int index)
	{
		String previous = data[previousIndex];
		String behind = data[index];
		
		int returning = previous.compareTo(behind);
		System.out.println("returning = " + returning);
		if(returning > 0)
		{
			data[previousIndex] = previous;
			data[index] = behind;
		}
	}
	private static String returnParameter(String [] data)
	{
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < data.length; i++)
		{
			builder.append(data[i]);
			if(i+1 != data.length)
			{
				builder.append(SEPARETER);
			}
		}
		return builder.toString();
	}
	public static void main(String [] args)
	{
		String [] original = {"z","d","g","j","r","a","f","c","e","b"};
		String [] sorted = new String [original.length];
		for(int i = 0; i < original.length; i++)
		{
			sorted[i] = exectute(original[i]);
		}
		for(int j = 0; j < sorted.length; j++)
		{
			System.out.println(sorted[j]);
		}
		returnParameter(sorted);
	}
}
