import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        
        String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();
        
        for (int i = 0; i < croatias.length; i++) {
            if (str.contains(croatias[i]))
                str = str.replace(croatias[i], "@");
        }
        bw.write(String.valueOf(str.length())); 
        bw.close(); 
       
    }
}