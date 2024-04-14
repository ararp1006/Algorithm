import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
      String[] suffixes = new String[S.length()]; // 접미사를 저장할 배열 생성
        // 모든 접미사 생성
        for (int i = 0; i < S.length(); i++) {
            suffixes[i] = S.substring(i);
        }
        // 접미사를 사전순으로 정렬
        Arrays.sort(suffixes);
        // 정렬된 접미사 출력
        for (String suffix : suffixes) {
            System.out.println(suffix);
        }
    }
}