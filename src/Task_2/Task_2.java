package Task_2;

import java.util.List;

public class Task_2 {
    public void multiThread() throws InterruptedException {
        MyThread2 A = new MyThread2((n)->{fizz(n);});
        MyThread2 B = new MyThread2((n)->{buzz(n);});
        MyThread2 C = new MyThread2((n)->{fizzbuzz(n);});
        MyThread2 D = new MyThread2((n)->{number(n);});

        List <MyThread2> threadList = List.of(A,B,C,D);

        for (MyThread2 th:threadList) {
            Thread.sleep(50);
            th.start();
        }
        for (int j = 1; j < 55; j++) {
            for (MyThread2 th:threadList) {
                th.check(j);
            }
        }
    }
    static void fizz(int i){
        if (i%3==0){
            System.out.println("fizz");
        }
    }

    static void buzz(int i){
        if (i%5==0){
            System.out.println("buzz");
        }
    }

    static void fizzbuzz(int i){
        if (i%15==0){
            System.out.println("fizzbuzz");
        }
    }

    static void number(int i){
        if (i%3!=0&&i%5!=0){
            System.out.println(i);
        }
    }
}
