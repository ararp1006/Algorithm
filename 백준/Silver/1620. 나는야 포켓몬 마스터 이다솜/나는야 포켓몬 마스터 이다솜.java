import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> dictionary = new HashMap<>();
		HashMap<Integer, String> dictionary2 = new HashMap<>();
		
		for (int i = 1; i <= n; i++) {
			String temp = br.readLine();
			dictionary.put(temp, i);
			dictionary2.put(i, temp);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			String temp = br.readLine();
			if (Character.isDigit(temp.charAt(0))) {
				int val = Integer.parseInt(temp);
				sb.append(dictionary2.get(val)).append("\n");
			} else {
				sb.append(dictionary.get(temp)).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
 
}