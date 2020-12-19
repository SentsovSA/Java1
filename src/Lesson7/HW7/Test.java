package Lesson7.HW7;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 0, 15);
        Plate plate = new Plate();


        plate.addFood(40);

        cat.eat(plate);

        cat.info();

        plate.printInfo();
    }
}
