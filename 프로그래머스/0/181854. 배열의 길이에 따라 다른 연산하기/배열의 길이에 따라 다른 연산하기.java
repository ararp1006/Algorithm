class Solution {
   public static int[] solution(int[] arr, int n) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 1 && i % 2 == 0) {
                result[i] = arr[i] + n;
            } else if (arr.length % 2 == 0 && i % 2 == 1) {
                result[i] = arr[i] + n;
            } else {
                result[i] = arr[i];
            }
        }
        return result;
    }
}