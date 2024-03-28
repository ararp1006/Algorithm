import java.util.Arrays;

public class Solution {
    public int solution(int[] array) {
        int[] counts = new int[1001]; 
        for (int num : array) {
            counts[num]++;
        }
        
        int maxCount = Arrays.stream(counts).max().getAsInt();
        if (Arrays.stream(counts).filter(count -> count == maxCount).count() > 1) {
            return -1;
        }
        
        return Arrays.stream(counts).boxed()
                .collect(java.util.stream.Collectors.toList())
                .indexOf(maxCount);
    }
}