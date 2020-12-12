package Lesson6;

public abstract class Animal {

    protected String petName;
    protected String color;
    protected int age;
    protected int runDistance;
    protected int swimDistance;
    protected double jumpHeight;

    public Animal(String petName, String color, int age, int runDistance, int swimDistance, double jumpHeight) {
        this.petName = petName;
        this.color = color;
        this.age = age;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
    }

    public Animal(String petName, String color, int age, int runDistance, double jumpHeight) {
        this.petName = petName;
        this.color = color;
        this.age = age;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "petName='" + petName + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", runDistance=" + runDistance +
                ", swimDistance=" + swimDistance +
                ", jumpHeight=" + jumpHeight +
                '}';
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public boolean run(int runDistanceIn) {
        return getRunDistance() >= runDistanceIn;
    }

    public boolean jump(int jumpHeightIn){
        return getJumpHeight() >= jumpHeightIn;
    }

    public boolean swim(int swimDistanceIn){
        return getSwimDistance() >= swimDistanceIn;
    }

}

