package Task_1;

public class MyThread2 extends Thread {

    @Override
    public void run () {
        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Минуло 5 секунд");
        }
    }
}
