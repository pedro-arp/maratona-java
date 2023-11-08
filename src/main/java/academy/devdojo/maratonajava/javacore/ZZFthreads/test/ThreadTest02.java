package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

// Daemon x User

class ThreadExampleRunnable2 implements Runnable {

    private final String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 200; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }

        }
    }

}

public class ThreadTest02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

    }
}
