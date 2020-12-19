package Lesson7.HW7;

public class Plate {

    protected int food;


    public void addFood(int food) {
        this.food += food;
    }

    public void printInfo() {
        System.out.println(+ food);
    }


    public int decreaseFood(int food) {
        if (this.food > food) {
            this.food -= food;
        }
        else System.out.println("Этому котику недостаточно еды");
        return food;
    }
}
