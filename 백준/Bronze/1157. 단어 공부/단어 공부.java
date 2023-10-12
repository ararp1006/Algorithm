import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();

        
        int[] count = new int[26]; //알파벳
        
        int maxValue = 0;
        char maxChar = '?';
        for(int i = 0; i < str.length(); i++){
            int idx = str.charAt(i) - 'A';
            if(maxValue < ++count[idx]){
               
                maxValue = count[idx];
                maxChar = str.charAt(i);
            }
            else if (maxValue == count[idx])
                maxChar = '?';
        }
        
        bw.write(maxChar);
        bw.close();
        br.close();
    }
}