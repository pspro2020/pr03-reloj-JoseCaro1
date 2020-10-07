package timeDate;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread myThread = new Thread(new ActualTime(),"Thread time");

        myThread.start();
        myThread.join(12000);
        myThread.interrupt();


    }
}
