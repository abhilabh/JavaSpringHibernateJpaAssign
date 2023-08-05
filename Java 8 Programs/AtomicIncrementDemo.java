import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIncrementDemo {
    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        // Create three threads
        Thread thread1 = new Thread(new IncrementTask());
        Thread thread2 = new Thread(new IncrementTask());
        Thread thread3 = new Thread(new IncrementTask());

        // Start all three threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all three threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of count
        System.out.println("Final count value: " + count.get());
    }

    static class IncrementTask implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                count.incrementAndGet();
            }
        }
    }
}
