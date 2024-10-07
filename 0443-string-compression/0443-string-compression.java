import java.util.HashMap;
import java.util.Map;

class Solution {
    public int compress(char[] chars) {
        int count = 1; 
        int writeIndex = 0; 
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++; 
            } else {
               
                chars[writeIndex++] = chars[i];
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[writeIndex++] = c; 
                    }
                }

              
                count = 1;
            }
        }

        return writeIndex; 
    }
}
