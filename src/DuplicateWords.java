

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWords {
	
	public static void dupWords() {
		String words[] = {"Selenium","Java","Python","Selenium","Python","Selenium"};
		
		Map<String, Integer> storeMap = new HashMap<>();
		for(String word:words) {
			Integer count = storeMap.get(word);
			if(count == null) {
				storeMap.put(word, 1);
			}else {
				storeMap.put(word, ++count);
			}
		}
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry:entrySet) {
			if(entry.getValue() > 1) {
				System.out.println("Duplicate words: " + entry.getKey() + " "+ entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		dupWords();

	}

}
