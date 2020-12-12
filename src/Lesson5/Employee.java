package Lesson5;

import java.util.Random;

public class Employee {
    private String firstName;

    private String surname;

    private String position;

    private String email;

    private String phoneNumber;

    private int salary;

    private int age;

    public Employee(String firstName, String surname, String position, String email, String phoneNumber, int salary, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }


    public int getAge() {
        return age;
    }


    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
