import java.util.*;
import java.io.*;

public class Main {
    static int color[] = new int[2], cp[][];
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        cp = new int[n][n];
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++)
                cp[i][j] = Integer.parseInt(st.nextToken());
        }
        cut(0, 0, n);
        for(int i=0; i<2; i++)
            System.out.println(color[i]);
    }
    static void cut(int row, int col, int size){
        if(size == 1)
            color[cp[row][col]]++;
        else {
            if(isEqual(row, col, size))
                color[cp[row][col]]++;
            else {
                int dSize = size/2;
                for(int i=row; i<row+size; i+=dSize)
                    for(int j=col; j<col+size; j+=dSize)
                        cut(i, j, dSize);
            }
        }
    }
    static boolean isEqual(int row, int col, int size) {
        for(int i=row; i<row+size; i++)
            for(int j=col; j<col+size; j++)
                if(cp[row][col] != cp[i][j])
                    return false;
        return true;
    }
}