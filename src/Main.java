//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int age = 15;
        int ageForRiding = 18;
        if (age >= ageForRiding) {
            System.out.println("Ты можешь водить");
        }

        if (age < ageForRiding) {
            System.out.println("Ты не можешь водить");
        }

        //task 2
        System.out.println("task 2");

        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + "нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + "можно идти без шапки");
        }

        //Task 3
        System.out.println("task 3");

        int speed = 130;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }

        //Task 4
        System.out.println("task 4");

        age = 5;
        if (age > 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age > 7 && age < 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

        //Task 5
        System.out.println("Task 5");

        age = 4;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", Нельзя кататься на аттракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если ребенку больше " + age + ", то он может кататься только в сопровождении взрослого." +
                    " Если взрослого нет, то кататься нельзя");
        }
        if (age >= 14) {
            System.out.println("Если ребенок старше " + age + ", то он может кататься без сопровождения взрослого");
        }

        //Task 6
        System.out.println("Task 6");

        int capacity = 102;
        int sitPlaces = 60;

        int people = 80;
        if (people < sitPlaces) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (people >= sitPlaces && people < capacity) {
            System.out.println("В вагоне есть стоячее место");
        }
        if (people >= capacity) {
            System.out.println("В вагоне нет мест");
        }

        //Task 7
        System.out.println("Task 7");

        int one = 10;
        int two = 20;
        int three = 5;

        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}