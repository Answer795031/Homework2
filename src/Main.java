public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("");
    }

    public static void task2 () {
        System.out.println("Задача 2");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("");
    }


    public static void task3 () {
        System.out.println("Задача 3");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("");
    }

    public static void task4 () {
        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        System.out.println("");
    }

    public static void task5 () {
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        System.out.println("");
    }

    public static void task6 () {
        System.out.println("Задача 6");

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;

        var sumWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Суммарный вес бойцов - " + sumWeight + " кг.");

        var diffWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе бойцов - " + diffWeight + " кг.");

        System.out.println("");
    }

    public static void task7 () {
        System.out.println("Задача 7");

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;

        var diffWeight1 = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе бойцов (методом вычитания) - " + diffWeight1 + " кг.");

        var diffWeight2 = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе бойцов (методом вычисления остатка от деления) - " + diffWeight2 + " кг.");

        System.out.println("");
    }

    public static void task8 () {
        System.out.println("Задача 8");

        var SumHours = 640;
        var HoursPerEmployee = 8;

        var totalEmployees = SumHours / HoursPerEmployee;
        System.out.println("Всего сотрудников в компании - " + totalEmployees + " человек");

        totalEmployees = totalEmployees + 94;
        SumHours = totalEmployees * HoursPerEmployee;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + SumHours + " часов работы может быть поделено между сотрудниками");

        System.out.println("");
    }

}