package Lesson6;

public class HW6 {

    public int runDistanceIn = 300;
    public int swimDistanceIn = 20;
    public int jumpHeight = 2;


    public static void main(String[] args) {

        Animal[] animal = new Animal[4];


            animal[0] = new Cat("Николай", "рыжий", 4, 150, 2);

            animal[1] = new Cat("Арсений", "сам не определился", 1, 250, 2.5);

            animal[2] = new Dog("Вениамин", "неважно, он всё равно пупсик", 3, 500, 15, 0.75);

            animal[3] = new Dog("Красавчик", "красивый", 7, 300, 10, 0.5);

            for (Animal animal1: animal){
                animal1.printInfo();
                boolean swim = animal1.swim(10);
                boolean run = animal1.run(300);
                boolean jump = animal1.jump(1);
                if (!swim){
                    System.out.println("Кошки не умеют плавать");
                }
                System.out.println("Результат: swim: " + swim);
                System.out.println("Результат: run: " + run);
                System.out.println("Результат: jump: " + jump);
            }



    }

}
