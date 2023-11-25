//Create the program to create multiple threads by using Thread class
class program9 extends Thread {
    private final int threadId;

    public program9(int id) {
        this.threadId = id;
    }

    public void run() {
        System.out.println("Thread " + threadId + " is running.");
    }

    public static void main(String[] args) {
        int numThreads = 5; // Number of threads to create

        // Create and start multiple threads
        for (int i = 1; i <= numThreads; i++) {
            program9 thread = new program9(i);
            thread.start();
        }
    }
}
