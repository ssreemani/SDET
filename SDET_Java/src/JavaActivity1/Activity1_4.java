package JavaActivity1;

public class Activity1_4 
{
   public static void main(String[] args) 
	{
		int data[]= {4, 3, 2, 10, 12, 1, 5, 6};
		System.out.println("Befor Sorting: ");
		display(data);
		sorting(data);
		System.out.println("Sorted Array in Ascending Order:");
		display(data);
	}
	public static void display(int array[]) 
	{
		for (int i=0; i<array.length-1; i++) 
		{
			System.out.println(array[i]);
		}
	}
	public static void sorting(int array[]) 
	{
		for (int i=0; i<array.length-1; i++) 
		{
		  for (int j = i + 1; j <array.length-1; j++) 
            {
                if (array[i] > array[j]) 
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
		}
	}
}
