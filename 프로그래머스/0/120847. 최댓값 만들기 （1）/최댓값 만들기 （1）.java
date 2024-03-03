import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        //오름차순 정렬후 마지막 & 마지막-1 인덱스 접근해 해결
        Arrays.sort(numbers);
        return numbers[numbers.length-1]* numbers[numbers.length-2];

    }
}