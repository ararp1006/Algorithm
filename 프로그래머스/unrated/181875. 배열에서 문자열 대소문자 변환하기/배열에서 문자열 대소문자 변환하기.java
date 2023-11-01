class Solution {
    public String[] solution(String[] strArr) {
     for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) { // Even index
                strArr[i] = strArr[i].toLowerCase();
            } else { // Odd index
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }
}