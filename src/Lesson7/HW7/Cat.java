package Lesson7.HW7;

public class Cat {

    private String name;
    protected boolean satiety;
    protected int maxSatiety;

    public Cat(String name, int satiety, int maxSatiety) {
        this.name = name;
        this.satiety = false;
        this.maxSatiety = maxSatiety;
    }

    public void info() {
        String isHungry = !satiety ? "голоден" : "сыт";
        System.out.println(name + ": " + isHungry);
    }

    public void eat(Plate plate) {
        plate.decreaseFood(0);
    }

}
