package SetAndHashMap;

import java.util.HashMap;
import java.util.Map;

public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        for (char ch : word1.toCharArray()) {
            freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
        }
        for (char ch : word2.toCharArray()) {
            freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);
        }
        if (!freq1.keySet().equals(freq2.keySet())) {
            return false;
        }
        Map<Integer, Integer> freqCount1 = new HashMap<>();
        Map<Integer, Integer> freqCount2 = new HashMap<>();
        for (int freq : freq1.values()) {
            freqCount1.put(freq, freqCount1.getOrDefault(freq, 0) + 1);
        }
        for (int freq : freq2.values()) {
            freqCount2.put(freq, freqCount2.getOrDefault(freq, 0) + 1);
        }
        return freqCount1.equals(freqCount2);
    }
}
