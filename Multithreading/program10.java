//Create the program to create multiple threads, set its name and its priority.
class program10 implements Runnable {
    private final int threadId;

    public program10(int id) {
        this.threadId = id;
    }

    public void run() {
        System.out.println("Thread " + threadId + " is running.");
    }

    public static void main(String[] args) {
        int numThreads = 5; // Number of threads to create

        // Create and start multiple threads
        for (int i = 1; i <= numThreads; i++) {
            program10 example = new program10(i);
            Thread thread = new Thread(example);

            // Set the thread name
            thread.setName("MyThread-" + i);

            // Set the thread priority (1 to 10, 1 being the lowest priority and 10 being the highest)
            thread.setPriority(Thread.MIN_PRIORITY + i);

            thread.start();
        }
    }
}
