

public class ReverseWords {

	public static void main(String[] args) {
		String phrase = "Python is a program";
		String[] words = phrase.split(" ");
		String rev="";
		for(int i =0 ; i< words.length ; i++) {
			for(int j = 0 ; j < words[i].length(); j++) {
				rev = rev + words[i].charAt((words[i].length()-1)-j);		
			}
			rev = rev + " ";
		}
		System.out.println("Reversed string: "+ rev);
	}

}
