import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
       
        Map<Integer, Integer> groupSizes = new HashMap<>();
        
        for (String str : strArr) {
            int len = str.length();
            groupSizes.put(len, groupSizes.getOrDefault(len, 0) + 1);
        }
        
        int maxGroupSize = 0;
        for (int size : groupSizes.values()) {
            maxGroupSize = Math.max(maxGroupSize, size);
        }
        
        return maxGroupSize;
    }
}