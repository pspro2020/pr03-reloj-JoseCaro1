package timeDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ActualTime implements Runnable {

    private DateTimeFormatter format=  DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            System.out.println(LocalDateTime.now().format(format));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("El hilo secundario ya ha terminado de ejecutarse");
                return;

            }
        }



    }
}
