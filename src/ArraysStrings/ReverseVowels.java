package ArraysStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
    ));
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            while (left < right && !vowels.contains(arr[left])) {
                left++;
            }
            while(left < right && !vowels.contains(arr[right])) {
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(arr);
    }
}
