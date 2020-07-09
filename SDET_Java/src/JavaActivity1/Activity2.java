package JavaActivity1;

public class Activity2 {

	public static void main(String[] args) {
				
		int array[]= {10, 77, 10, 54, -11, 10};
		int sum= 0;
		
		for (int i=0; i<array.length; i++) {
			if (array[i] == 10) 
				sum += array[i];
		}
		System.out.println("Result is: " + ((sum==30)? "True": "False"));
			
		
	}

}
