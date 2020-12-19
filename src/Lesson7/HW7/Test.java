package Lesson7.HW7;

public class Test {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Барсик", 15), new Cat ("Васька", 20), new Cat ("Игорь", 18)};
        Plate plate = new Plate(53);


        for(Cat cat : cats) {
            cat.eat(plate);

            cat.printInfo();
        }

        plate.printInfo();
    }
}
