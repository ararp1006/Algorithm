package recursive;

import java.util.Scanner;

public class Test103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");

        int num = scanner.nextInt();

        long result = factorial(num);
        System.out.println(num + "의 팩토리얼: " + result);
    }

    public static int factorial(int num){
        if(num == 0) return 1;
        return num * factorial(num - 1);
    }
}

