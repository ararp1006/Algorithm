import java.util.HashMap;

class Solution {
    public int solution(String s) {
        // 영단어를 숫자로 변환하는 메서드 정의
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("zero", "0");
        numbers.put("one", "1");
        numbers.put("two", "2");
        numbers.put("three", "3");
        numbers.put("four", "4");
        numbers.put("five", "5");
        numbers.put("six", "6");
        numbers.put("seven", "7");
        numbers.put("eight", "8");
        numbers.put("nine", "9");

        StringBuilder answer = new StringBuilder();
        StringBuilder tempWord = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) { // 숫자인 경우 바로 결과에 추가
                answer.append(c);
            } else { // 영단어인 경우 임시 저장 후 변환하여 결과에 추가
                tempWord.append(c);
                if (numbers.containsKey(tempWord.toString())) {
                    answer.append(numbers.get(tempWord.toString()));
                    tempWord.setLength(0); // 임시 저장 변수 초기화
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }
}
