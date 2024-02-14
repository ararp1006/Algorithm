class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] str = my_string.toCharArray();
        char[] reverse = new char[str.length];

        for (int i = 0; i < str.length; i++) {
            reverse[i] = str[str.length - i - 1];
        }

        answer = new String(reverse);

        return answer;
    }
}
