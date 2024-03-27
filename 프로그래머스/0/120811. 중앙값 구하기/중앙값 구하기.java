import java.util.Arrays;

public class Solution {
    public static double solution(int[] array) {
        // 주어진 배열을 정렬
        Arrays.sort(array);
        int length = array.length;
        
        // 배열의 길이가 홀수인 경우 중앙값은 가운데 값
        if (length % 2 == 1) {
            return array[length / 2];
        } else { 
            // 배열의 길이가 짝수인 경우 중앙에 위치한 두 값의 평균을 반환
            int midIndex = length / 2;
            return (array[midIndex - 1] + array[midIndex]) / 2.0;
        }
    }
}