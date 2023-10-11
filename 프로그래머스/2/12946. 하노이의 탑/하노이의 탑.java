import java.util.*;

class Solution {
    
    ArrayList<int[]> top;
    public int[][] solution(int n) {
        top = new ArrayList<>();
        
        hanoi(n, 1, 3, 2);
        
        int[][] answer = new int[top.size()][2];
        for(int i = 0 ; i < top.size() ; ++i){
            int[] cmd = top.get(i);
            answer[i][0] = cmd[0];
            answer[i][1] = cmd[1];  
        }
        
        return answer;
    }
                    // 원반 수, 출발막대,목표막대,보조막대
    private void hanoi(int n, int from, int to, int via){
        int[] move = {from, to};
        
        if(n == 1) {
            top.add(move); //
        } else {
            hanoi(n - 1, from, via, to);
            top.add(move);
            hanoi(n - 1, via, to, from);   
        }
    }
}