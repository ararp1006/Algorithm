import java.util.Scanner;

public class Main {
    // 최대공약수를 구하는 메서드
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수를 구하는 메서드
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테스트 케이스 개수 입력 받기
        int T = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        // 각 테스트 케이스에 대해 최소공배수 계산 및 출력
        for (int i = 0; i < T; i++) {
            // 두 자연수 입력 받기
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 처리

            // 최소공배수 출력
            System.out.println(lcm(A, B));
        }

        scanner.close();
    }
}
