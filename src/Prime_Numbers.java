
public class Prime_Numbers {

	public static boolean isPrimeNum(int num) {
		for(int i =2 ; i < num ; i++) {
			if(num <=1) {
				return false;
			}
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		int num = 100;
		for(int i = 2 ;i < num ; i++) {
			if(isPrimeNum(i)) {
				System.out.println(i + "is Prime number");	
			}
			
		}

	}

}
