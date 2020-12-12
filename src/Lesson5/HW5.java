package Lesson5;

import java.util.Random;

public class HW5 {

    private static final int EMPLOYEE_QUANTITY = 5;

    private static final int MIN_AGE = 40;

    private static final Random ageRandom = new Random();


    public static void main(String[] args) {

        Employee[] empArray = new Employee[EMPLOYEE_QUANTITY];
        empArray[0] = new Employee("Василий",
                "Огурцов",
                "Исполнительный директор",
                "ogurtsov1969@mail.ru",
                "88005553535",
                100_000,
                51);
        empArray[1] = new Employee("Олег",
                "Молодцов",
                "Маркетолог",
                "cool-market@gmail.com",
                "89889888989",
                70_000,
                34);
        empArray[2] = new Employee("Максим",
                "Пивоваров",
                "Пивовар",
                "pivoVarov@gmail.com",
                "87777777777",
                150_000,
                41);
        empArray[3] = new Employee("Артур",
                "Самбукин",
                "Управляющий отделом по управлению всеми управлениями",
                "uouvu@gmail.com",
                "89853331246",
                30_000,
                25);
        empArray[4] = new Employee("Виктор",
                "Палыч",
                "Кладовщик",
                "zaklad@gmail.com",
                "89335353124",
                40_000,
                43);



        for (int i = 0; i < EMPLOYEE_QUANTITY; i++) {
            empArray[i].printInfo();
        }






    }
}
