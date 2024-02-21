class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        
        for(int i=0; i<num_list.length ; i++){
            int num = num_list[i];
            if(num %2 ==0) answer[0]+=1;
            else answer[1]+=1;
        }
        
        return answer;
    }
}