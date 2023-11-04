package Task_2;

import java.util.List;

public class MyNewThread extends Thread {
    List <Object> so;
    int i =1;
    public MyNewThread (List <Object> so){
        this.so=so;
    }

    @Override
    public synchronized void run() {
            for (Object o:so) {
                System.out.println(o/*+Thread.currentThread().getName()*/);
                i++;
            }
    }
}
