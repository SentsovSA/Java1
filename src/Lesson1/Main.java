package Lesson1;

public class Main {
    public static void main(String[] args) {


        checkAppraisal(5);
        checkAppraisal(3);
        checkAppraisal(4);
        checkAppraisal(2);
        checkAppraisal(-7);
        checkAppraisal(1);


    }

    private static void checkAppraisal(int appraisal) {
        if (appraisal == 5) {
            System.out.println("Молодец!");
        } else if (appraisal == 3) {
            System.out.println("Хорошо, но можешь лучше!");
        }
        //else if (appraisal == 3 || appraisal == 2 || appraisal == 1){
        else if (appraisal <= 3 & appraisal >= 1) {
            System.out.println("Готовься лучше");
        } else {
            System.out.println("Не ври");
        }
    }
    }


   /* private static int calculateSum(int a, int b) {
        int result = a + b;
        return result;

    }

    private static void testString() {
        String str = "Hello ";
        String strWorld = "World";
        System.out.println(str + strWorld);
    }

    private static void testChars() {
        char c = 't';
        char d = 124;// номер из Unicode
        System.out.println(c);
        System.out.println(d);
    }


    private static void testVars() {
        int varA;
        varA = 13;
        int varB = 15;
        double result = 1.0 * varA / varB;
        // double result = (double) varA / varB;
        System.out.println(result);

        double doubleVarA = 7.0;
        double doubleVarB = 3.0;
        double doubleResult = doubleVarA / doubleVarB;
        System.out.println(doubleResult);
    }

    public static void testInc() {
        int c = 0;
        c += 1;  // или c++
        System.out.println(c++);
        System.out.println(++c);
        System.out.println(c--);
        System.out.println(--c);
        System.out.println(c);


    }


    public static void printHelloWorld() {
        System.out.println("Hello, world!");

    }
}*/
