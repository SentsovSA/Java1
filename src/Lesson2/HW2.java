package Lesson2;

import java.util.Arrays;
import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        final int SIZE = 8;

        int[] ex1 = {1, 0, 0, 1, 1, 1, 0, 1};
        for (int i = 0; i < SIZE; i++) {
            if (ex1[i] == 0) ex1[i] = 1;
            else ex1[i] = 0;
        }
        System.out.println(Arrays.toString(ex1));


        final int MULTIPLIER = 3;
        int[] ex2 = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            ex2[i] = i * MULTIPLIER;

        }
        System.out.println(Arrays.toString(ex2));

        int[] ex3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (ex3[i] < 6) ex3[i] *= 2;
        }
        System.out.println(Arrays.toString(ex3));

        int[][] ex4 = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j || i + j == 8) ex4[i][j] = 1;
            }
        }
        for (int[] ints : ex4) {
            for (int anInt : ints) {
                System.out.printf("%2d ", anInt);
            }
            System.out.println();
        }
        Random random = new Random();
        int min = 101;
        int max = -1;
        int[] ex5 = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            ex5[i] = random.nextInt(100);
            if (ex5[i] < min) {
                min = ex5[i];
            }
            if (ex5[i] > max) {
                max = ex5[i];
            }
        }
        System.out.println(Arrays.toString(ex5));
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        Random random1 = new Random();
        int left = 0;
        int right = 0;
        //int [] ex6 = new int [SIZE];
        int[] ex6 = {2, 2, 2, 1, 2, 2, 10, 1};
        for (int i = 0; i < 5; i++) {
            //ex6[i] = random1.nextInt(100);
            for (int j = 4; j >= 0; j--) {
                left += ex6[i];
                right += ex6[j];
            }
        }
        if (left == right) {
            System.out.println(true);
        } else System.out.println(false);

        int n = 5;
        int[] ex7 = new int[SIZE + n];
        for (int i = 0; i < SIZE; i++) {
            ex7[i] = i * MULTIPLIER;
        }
        for (int j = SIZE + n - 1; j >= n; j--) {
            ex7[j] = ex7[j - n];
        }
        for (int i = 0; i < n; i++) {
            ex7[i] = 0;
        }

        System.out.println(Arrays.toString(ex7));
    }
}

