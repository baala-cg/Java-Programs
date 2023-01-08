

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateNumbers {
	
	public static void dupNumbers() {
		int numbers[] = {1,2,3,4,1,2,4,3,1,3};
		
		Map<Integer, Integer> storeMap = new HashMap<>();
		for(Integer num:numbers) {
			Integer count = storeMap.get(num);
			if(count == null) {
				storeMap.put(num, 1);
			}else {
				storeMap.put(num, ++count);
			}
		}
		Set<Entry<Integer, Integer>> entrySet = storeMap.entrySet();
		for(Entry<Integer, Integer> entry:entrySet) {
			if(entry.getValue() > 1) {
				System.out.println("Duplicate numbers: " + entry.getKey() + " "+ entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		dupNumbers();

	}

}
