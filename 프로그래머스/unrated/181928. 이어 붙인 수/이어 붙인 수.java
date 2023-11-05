public class Solution {
    public long solution(int[] num_list) {
        StringBuilder oddStr = new StringBuilder();
        StringBuilder evenStr = new StringBuilder();
        
        // 리스트의 각 숫자에 대해 반복합니다.
        for (int num : num_list) {
            // 홀수인 경우
            if (num % 2 == 1) {
                oddStr.append(num);
            }
            // 짝수인 경우
            else {
                evenStr.append(num);
            }
        }
        
        // 홀수와 짝수 문자열을 정수로 변환하고 합산합니다.
        // 만약 문자열이 비어있다면 0으로 처리합니다.
        long oddNum = (oddStr.length() > 0) ? Long.parseLong(oddStr.toString()) : 0;
        long evenNum = (evenStr.length() > 0) ? Long.parseLong(evenStr.toString()) : 0;
        
        return oddNum + evenNum;
    }
}