import java.util.Scanner;

public class Main {
    // 최대공약수를 구하는 메소드
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 최소공배수를 구하는 메소드
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();

        // A와 B의 최소공배수 출력
        System.out.println(lcm(A, B));

        scanner.close();
    }
}
