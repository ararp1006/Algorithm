import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        String s = br.readLine();
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i =0; i<=s.length(); i++){
            for(int j =i +1; j<=s.length(); j++){
                map.put(s.substring(i,j),i);
            }
        }
        bw.write(String.valueOf(map.size())); 
        bw.close(); 
    }
}