package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HW4 {
    static final int SIZE = 5;

    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';

    static final String HEADER_FIRST_EMPTY = "♥";
    static final String EMPTY = " ";

    static char[][] map = new char[SIZE][SIZE];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {
        turnGame();
    }

    private static void turnGame() {
        mapOn();

        printMap();

        playGame();
    }


    private static void mapOn() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();

        printMapRow();
    }

    private static void printMapHeader() {
        System.out.println();
        System.out.print(HEADER_FIRST_EMPTY + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printMapRow() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    private static void playGame() {

        while (true) {
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);

        }
    }

    private static void humanTurn() {
        int rowNumber = 0;
        int columnNumber = 0;

        System.out.println("\nХод человека! Введите номера строки и столбца!");

        do {
            System.out.print("Строка = ");
            if (in.hasNextInt()) {
                rowNumber = in.nextInt();
            } else {
                in.next();
                System.out.println("Введите число в диапазоне от 1 до " + SIZE + "\n");
                continue;
            }

            System.out.print("Столбик = ");
            if (in.hasNextInt()) {
                columnNumber = in.nextInt();
            } else {
                in.next();
                System.out.println("Введите число в диапазоне от 1 до " + SIZE + "\n");
                continue;
            }

        } while (!isCellValid(rowNumber, columnNumber));

        map[rowNumber - 1][columnNumber - 1] = DOT_HUMAN;
    }

    private static boolean isCellValid(int rowNumber, int columnNumber) {
        return isCellValid(rowNumber, columnNumber, false);
    }

    private static boolean isCellValid(int rowNumber, int columnNumber, boolean isAI) {

        if (!isAI && (rowNumber < 1 || rowNumber > SIZE || columnNumber < 1 || columnNumber > SIZE)) {
            System.out.println("\nПроверьте значение строки и столбца");
            return false;
        }

        if (map[rowNumber - 1][columnNumber - 1] != DOT_EMPTY) {
            if (!isAI) {
                System.out.println("\nВы выбрали занятую ячейку");
            }
            return false;
        }

        return true;
    }

    private static void checkEnd(char symbol) {
        boolean isEnd = false;

        if (checkWin(symbol)) {
            String winMessage;

            if (symbol == DOT_HUMAN) {
                winMessage = "Ура! Мы победили!";
            } else {
                winMessage = "Восстание близко. AI победил.";
            }

            isEnd = true;
            System.out.println(winMessage);
        }

        if (!isEnd && isMapFull()) {
            System.out.println("Ничья!");
            isEnd = true;
        }

        if (isEnd) {
            System.exit(0);
        }

    }

    private static boolean checkWin(char symbol) {
        int winCount = 0;
        if (SIZE >= 3 && SIZE <= 5) winCount = 3;
        if (SIZE >= 6 && SIZE <= 9) winCount = 4;
        if (SIZE >= 10) winCount = 5;
        int winCountSymbolsH;
        int winCountSymbolsV;
        int winCountDMain = 0;
        int winCountDSecond = 0;
        int winCountD = 0;
        for (int i = 0; i < SIZE; i++) {
            winCountSymbolsH = 0;
            winCountSymbolsV = 0;
            for (int j = 0; j < SIZE; j++){
                if (map[i][j] == symbol){
                    winCountSymbolsH++;
                    if (winCountSymbolsH == winCount) return true;
                }
                if(map[j][i] == symbol){
                    winCountSymbolsV++;
                    if(winCountSymbolsV == winCount) return true;
                }
            }
            if(map[i][i] == symbol){
                winCountDMain++;
                if(winCountDMain == winCount) return true;
                else winCountDMain = 0;
            }
            if(map[i][SIZE - 1 - i] == symbol){
                winCountDSecond++;
                if(winCountDSecond == winCount) return true;
                else winCountDSecond = 0;
            }
        }
    return false;
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    private static void aiTurn() {
        int rowNumber;
        int columnNumber;
        System.out.println("\nХод компьютера\n");
        do {
            rowNumber = random.nextInt(SIZE) + 1;
            columnNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber, columnNumber, true));

        map[rowNumber - 1][columnNumber - 1] = DOT_AI;
    }

}
