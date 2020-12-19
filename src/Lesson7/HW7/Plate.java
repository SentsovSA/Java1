package Lesson7.HW7;

public class Plate {

    protected int food;

    public Plate(int food) {
        this.food = food;
    }


    public void addFood() {
        this.food += food;
    }


    public boolean decreaseFood(int foodEaten) {
        if (this.food >= foodEaten) {
            this.food -= foodEaten;
            return true;
        }
        else
        return false;
    }

    public void printInfo() {
        System.out.println("В миске осталось "+ food + " еды");
    }
}
