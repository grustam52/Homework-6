public class Main {
    public static void main(String[] args) {
        task1 ();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 0; i <=10; i ++){
            System.out.println(i);
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i --) {
            System.out.println(i);
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i++){
            if (i % 2 ==0){
                System.out.println(i);
            }
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i --) {
            System.out.println(i);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i = i += 4){
            System.out.println("Високосный год " + i);
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i +=7) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static void task7 () {
        System.out.println ("Задача 7");
        for (int i = 1; i <= 512; i *=2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mouthAmount = 29000;
        for (int mouth = 1; mouth <= 12; mouth++){
            System.out.println("Месяц " + mouth + " сумма накоплений "  + mouth * mouthAmount + " рублей");
        }
    }
    public static void task9 () {
        System.out.println("Задача 9");
        int mouthAmount = 29000;
        double mouthPercent = 0.01;
        int total = 0;
        for (int mouth = 1; mouth <= 12; mouth++){
            total += mouthAmount + total * mouthPercent;
            System.out.println("Месяц " + mouth + " сумма накоплений "  + total + " рублей");
        }
    }
    public static void task10 () {
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}