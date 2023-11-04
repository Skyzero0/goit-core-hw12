package Task_2;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Task_2 {
    static volatile List<Object> lo = new CopyOnWriteArrayList<>();
    public void multiThread() throws InterruptedException {
        MyThread2 A = new MyThread2((n) -> lo.set(n, "fizz" /*+ Thread.currentThread().getName()*/));
        MyThread2 B = new MyThread2((n) -> lo.set(n, "buzz" /*+ Thread.currentThread().getName()*/));
        MyThread2 C = new MyThread2((n) -> lo.set(n, "fizzbuzz" /*+ Thread.currentThread().getName()*/));
        A.start();
        B.start();
        C.start();

        for (int u = 1; u < 55; u++) {lo.add(u);}

        for (int j = 0; j < lo.size(); j++) {
            if ((int) lo.get(j) % 5 == 0 && (int) lo.get(j) % 3 == 0) {
                C.check(j);
            } else if ((int) lo.get(j) % 3 == 0) {
                A.check(j);
            } else if ((int) lo.get(j) % 5 == 0) {
                B.check(j);
            }
        }
        Thread D = new MyNewThread(lo);
        Thread.sleep(50);
        D.start();
    }
}