package Lesson1;

public class HW1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 3;
        int d = 7;
        double r = exOne(a, b, c, d);
        System.out.println(r);

        int x = 10;
        int y = 20;
        boolean tf = exTwo(x, y);
        System.out.println(tf);

        int n = 10;
        exThree(n);

        int z = -1;
        boolean result = exFour(z);
        System.out.println(result);

        String name = "Красавчик";
        exFive(name);

        int year = 200;
        exSix(year);


    }


    private static double exOne(int a, int b, int c, int d) {
        double r = a * (b + ((double) c / d));
        return r;
    }

    private static boolean exTwo(int x, int y) {
        return (((x + y) >= 10) & ((x + y) <= 20));
    }

    private static void exThree(int n) {
        if (n >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }


      /*  private static void testTern(int digit) {

        String word = (digit < 0) ? "Negative" : "Positive";
            System.out.printf("This number: %d is %s digit%n", digit, word);


    }*/

    private static boolean exFour(int z) {
        return z < 0;
    }

    private static void exFive(String name) {
        System.out.println("Привет, " + name + "!");
    }

    private static void exSix(int year) {
        if ((year % 400 == 0) | (year % 4 == 0) & (year % 100 != 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

}
