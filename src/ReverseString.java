

public class ReverseString {

	public static void main(String[] args) {
			String phrase = "Java is a program";
			String rev ="";
			for(int i = 0 ; i < phrase.length(); i++) {
				rev = rev + phrase.charAt((phrase.length()-1)-i);
			}
			System.out.println("Reversed string: "+ rev);
	}

}
