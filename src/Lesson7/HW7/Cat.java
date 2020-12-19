package Lesson7.HW7;

public class Cat {

    private String name;
    protected boolean satiety;
    protected int maxSatiety;

    public Cat(String name, int maxSatiety) {
        this.name = name;
        this.satiety = false;
        this.maxSatiety = maxSatiety;
    }


    public void eat(Plate plate) {
       if (!satiety && plate.decreaseFood(maxSatiety)){
           satiety = true;
       }
    }

    public void printInfo() {
        String isHungry = satiety ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }

}
