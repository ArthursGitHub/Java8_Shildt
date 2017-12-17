// http://www.tutorialspoint.com/java/lang/thread_interrupted.htm
import java.lang.*;

public class ThreadDemo {

    Thread t;
    int delay;

    ThreadDemo(int delay) {
        this.delay = delay;

        Runnable r = () -> {
            try {
                while (true) {
                    Thread.sleep(10000);
                }
            } catch (InterruptedException e) {
                System.out.print(t.getName() + " interrupted:");
                System.out.println(e.toString());
            }
        };

        t = new Thread(r);
        System.out.println("Executing " + t.getName());

        // this will call run() fucntion
        t.start();

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // interrupt the threads
        if (!t.interrupted()) {
            t.interrupt();
        }

        // block until other threads finish
        try {
            t.join();
        } catch (InterruptedException e) {
        }
    }


    public static void main(String args[]) {
        new ThreadDemo(500);
        new ThreadDemo(800);
    }
}

