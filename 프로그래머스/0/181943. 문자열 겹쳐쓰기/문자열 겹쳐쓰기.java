public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder result = new StringBuilder(my_string);

        for (int i = 0; i < overwrite_string.length(); i++) {
            result.setCharAt(s + i, overwrite_string.charAt(i));
        }

        return result.toString();
    }
}