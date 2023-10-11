import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int solution(String word) {
        List<String> dictionary = new ArrayList<>();
        String[] aeiou = {"A", "E", "I", "O", "U"};
        StringBuilder words = new StringBuilder();
        

        // 내부 함수 dfs
        dfs(dictionary, aeiou, words);
        int index = dictionary.indexOf(word);

        return index;
    }
  
    private static void dfs(List<String> dictionary, String[] aeiou, StringBuilder words) {
        // word의 길이가 5가 되면 사전에 추가하고 종료한다.
        if (words.length() == 5) {
            dictionary.add(words.toString());
            return;
        }

        // 모든 글자를 사전에 추가한다.
        dictionary.add(words.toString());

        for (int i = 0; i < 5; i++) {
            words.append(aeiou[i]);
            dfs(dictionary, aeiou, words);
            words.deleteCharAt(words.length() - 1);
        }
    }
}