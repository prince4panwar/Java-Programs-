//Create the program to create multiple threads, show an example of synchronization keyword.
class program11 {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
        System.out.println("Counter: " + counter + " | Thread ID: " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        final program11 syncExample = new program11();

        // Creating multiple threads to increment the counter
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    syncExample.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    syncExample.increment();
                }
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
