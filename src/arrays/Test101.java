package arrays;

import java.util.Scanner;

public class Test101 {

    public static void main(String[] args) {
        int nums;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        nums = scan.nextInt();

        int[] numList = new int[nums];

        System.out.println("배열 요소를 입력하세요:");

        for (int i = 0; i < nums; i++) {
            numList[i] = scan.nextInt();

            if (numList[i] > maxNum) {
                maxNum = numList[i];
            }
            if (numList[i] < minNum) {
                minNum = numList[i];
            }
        }

        scan.close();

        System.out.printf("배열의 최솟값: %d, 최댓값: %d\n", minNum, maxNum);
    }
}
