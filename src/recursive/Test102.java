package recursive;

import java.util.Scanner;

public class Test102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        boolean isOdd = isOdd(num);

        if (isOdd) {
            System.out.println(num + "는 홀수입니다.");
        } else {
            System.out.println(num + "는 홀수가 아닙니다.");
        }
    }

    public static boolean isOdd(int n) {
        if (n == 1 || n == -1) {
            return true;
        }
        if (n == 0) {
            return false;
        }

        if (n > 0) {
            return isOdd(n - 2);
        } else {
            return isOdd(n + 2);
        }
    }
}


