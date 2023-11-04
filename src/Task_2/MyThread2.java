package Task_2;

import java.util.concurrent.atomic.AtomicBoolean;

public class MyThread2 extends Thread {
    private int i;
    private AtomicBoolean b = new AtomicBoolean(true);
    private Cheking c;

    public MyThread2(Cheking c){
        this.c=c;
    }

    void check (int i){
        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.i=i;
        b.set(false);
    }

    public synchronized void run(){
        while (true){
            if (b.get()){
                continue;
            }
            c.check(i);
            b.set(true);
        }
    }
}
