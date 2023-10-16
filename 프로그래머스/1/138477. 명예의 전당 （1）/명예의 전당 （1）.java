import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Stack <Integer> top = new Stack<>();
        for(int i = 0; i < score.length; i++) {
            if(i < k)
                top.push(score[i]);
            else if(top.peek() < score[i]) {
                top.pop();
                top.push(score[i]);
            }
            Collections.sort(top, Collections.reverseOrder());
            answer[i] = top.peek();
        }
        return answer;
    }
}