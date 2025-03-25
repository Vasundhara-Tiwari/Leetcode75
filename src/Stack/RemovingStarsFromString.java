package Stack;

import java.util.Stack;

public class RemovingStarsFromString {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '*' && !st.isEmpty()){
                st.pop();
            } else {
                st.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}
