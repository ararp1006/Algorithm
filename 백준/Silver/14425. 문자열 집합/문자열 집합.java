import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 문자열의 개수 N 입력
        int M = scanner.nextInt(); // 검사해야 하는 문자열의 개수 M 입력

        Set<String> S = new HashSet<>(); // 문자열의 집합 S 생성

        // 집합 S에 문자열 추가
        for (int i = 0; i < N; i++) {
            String string = scanner.next();
            S.add(string);
        }

        int count = 0; // 집합 S에 포함된 문자열의 개수를 세는 변수 초기화

        // 검사해야 하는 문자열들을 하나씩 확인하여 집합 S에 포함되어 있는지 확인
        for (int i = 0; i < M; i++) {
            String testString = scanner.next();
            if (S.contains(testString)) { // 검사해야 하는 문자열이 집합 S에 포함되어 있다면
                count++; // 개수 증가
            }
        }

        System.out.println(count); // 결과 출력
    }
}
