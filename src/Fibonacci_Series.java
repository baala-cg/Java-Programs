

public class Fibonacci_Series {

	public static void main(String[] args) {

		int a = 0,c = 0;
		int b = 1;
		System.out.println(a +" "+ b);
		for(int i = 0 ; i < 10 ;i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}	
		
	}

}

