package ArraysStrings;

public class StringCompression {
    public int compress(char[] chars) {
        int first = 0;
        int second = 0;
        while(first < chars.length){
            char current = chars[first];
            int count = 0;
            while(first < chars.length && chars[first] == current){
                count++;
                first++;
            }
            chars[second++] = current;
            if(count > 1){
                for(char ch: String.valueOf(count).toCharArray()){
                    chars[second++] = ch;
                }
            }
        }
        return second;
    }
}
