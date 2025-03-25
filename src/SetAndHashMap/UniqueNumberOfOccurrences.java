package SetAndHashMap;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num: arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int val : freqMap.values()){
            if(set.contains(val)){
                return false;
            } else {
                set.add(val);
            }
        }
        return true;
    }
}
