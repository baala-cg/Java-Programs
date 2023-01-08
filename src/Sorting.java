import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int t =0;
		int numbers[] = {12,45,11,10,1};
//		System.out.println(Arrays.sort(numbers));
		for(int i = 0 ;i < numbers.length; i ++) {
			for(int j = 1 ; j < numbers.length ; j++ ) {
				if(numbers[j-1] > numbers[j]) {
					t = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = t;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		
		
	}

}
