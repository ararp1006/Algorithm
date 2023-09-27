package arrays;

import java.util.Scanner;

public class test101{

    public static void main(String[] args) {
        int nums = 0;
        int maxNum = 0;
        int minNum = 0;

        Scanner scan = new Scanner(System.in);

        nums = scan.nextInt();
        int[] numList = new int[nums];

        for(int i = 0; i<nums ; i++) {
            numList[i] = scan.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                maxNum = numList[0];
                minNum = numList[0];
            }
            if (i != 0) {
                if (maxNum < numList[i]) {
                    maxNum = numList[i];
                }
                if (minNum > numList[i]) {
                    minNum = numList[i];
                }
            }
        }
        System.out.printf("%d %d", minNum, maxNum);
    }
}

