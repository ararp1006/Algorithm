class Solution {
    int result = 0;
    boolean isEqual = false;

    public int solution(String word) {
        int answer = 0;

        recursive(word, new StringBuilder(), new String[]{"A", "E", "I", "O", "U"});
        answer = result;
        return answer;
    }

    public void recursive(String word, StringBuilder sb, String[] sArray){
        if(word.equals(sb.toString())){
            isEqual = true;
            return;
        }
        if(sb.length() == 5) return;

        for(int i = 0; i < sArray.length; i++){
            sb.append(sArray[i]);
            result += 1;
            recursive(word, sb, sArray);
            if(isEqual) return;
            sb.delete(sb.length()-1, sb.length());
        }

    }
}