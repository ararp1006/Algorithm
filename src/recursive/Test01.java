package recursive;

import java.util.Scanner;

public class Test01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("숫자를 입력하세요: ");
            int num = scanner.nextInt();
            scanner.close();

            int result = sumTo(num);
            System.out.println("1부터 " + num + "까지의 합: " + result);
        }

        public static int sumTo(int num) {
            if (num == 0) return 0;
            return num + sumTo(num - 1);
        }
    }


