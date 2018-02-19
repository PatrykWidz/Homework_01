package pl.coderslab.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class GenerateRandom {
	
	public static Map<Integer, Integer> checkRand(int amount, int interval) {
		Map<Integer, Integer> randomMap = new HashMap<>();
		Random r = new Random();

		for (int i = 0; i < interval; i++) {
			randomMap.put(i, 0);
		}
		
		for (int i = 0; i < amount; i++) {
			int nextNumber = r.nextInt(interval);
			if (randomMap.containsKey(nextNumber)) {
				int n = randomMap.get(nextNumber);
				n++;
				randomMap.put(nextNumber, n);
			}
		}
		
		Set<Integer> randomMapKeySet = randomMap.keySet();
		Iterator<Integer> it = randomMapKeySet.iterator();
		
		
		
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num + " : " + randomMap.get(num));
		}
		
		
		return randomMap;
	}
}
