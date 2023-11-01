package Task_1;

import java.sql.Time;
import java.time.LocalTime;

public class Task_1 {
    public void timeThread () {
        Thread thread = new MyThread2();

        System.out.println(Time.valueOf(LocalTime.now()));

        int sec = 1;
        thread.start();
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("З момента запуска програми пройшло секунд: " + sec);
            sec++;
        }
    }
}
