import Task_1.Task_1;
import Task_2.Task_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
////        //Task 1
////        Напишіть програму, яка кожну секунду відображає на екрані дані про час, що минув від моменту запуску програми.
////        Другий потік цієї ж програми кожні 5 секунд виводить повідомлення Минуло 5 секунд.
//        Task_1 t1 = new Task_1();
//        t1.timeThread();

////        Task 2
////        Напишіть програму, що виводить в консоль рядок, що складається з чисел від 1 до n, але з заміною деяких значень:
////
////        якщо число ділиться на 3 - вивести fizz
////        якщо число ділиться на 5 - вивести buzz
////        якщо число ділиться на 3 і на 5 одночасно - вивести fizzbuzz
        Task_2 t2 = new Task_2();
        t2.multiThread();
//        System.out.println("Hello world!");
    }
}