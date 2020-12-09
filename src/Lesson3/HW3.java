package Lesson3;

import java.util.Random;
import java.util.Scanner;

import static java.lang.invoke.MethodHandles.loop;

public class HW3 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static int number = random.nextInt(10);
    public static int counter = 0;

    public static void main(String[] args) {
        game();
    }

    public static void game() {
        System.out.print("Загадали число от 0 до 9, попробуйте угадать, у Вас 3 попытки: ");
        loop();

    }

    private static void loop() {
        while (counter < 3) {
            blockIf();
        }

    }

    private static void blockIf() {
        int in = scanner.nextInt();
        if (in == number) {
            System.out.println("Правильно! Поздравляю с победой!");
            nextTry();
        } else if (number > in) {
            System.out.println("Загаданное число больше");
            counter++;
            attempt();
        } else if (number < in) {
            System.out.println("Загаданное число меньше");
            counter++;
            attempt();
        }

    }

    private static void attempt() {
        if (counter < 3) {
            System.out.print("Неверно! Попробуйте ещё раз: ");
            loop();
        } else {
            nextTry();
        }
    }

    private static void nextTry() {
        System.out.print("Хотите попробовать ещё? 1 - да, 0 - нет: ");
        int in = scanner.nextInt();
        if (in == 1) {
            counter = 0;
            number = random.nextInt(10);
            game();
        } else if (in == 0) {
            farewell();
        }
    }

    private static void farewell() {
        System.out.println("Спасибо за игру!");
        System.exit(0);
    }

}
