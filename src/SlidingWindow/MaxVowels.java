package SlidingWindow;

public class MaxVowels {
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int currVowels = 0;
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                currVowels++;
            }
        }
        maxVowels = currVowels;
        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                currVowels++;
            }
            if(isVowel(s.charAt(i-k))){
                currVowels--;
            }
            maxVowels = Math.max(maxVowels, currVowels);
        }
        return maxVowels;
    }
}
