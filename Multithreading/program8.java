// Create the program to create multiple threads by using Runnbale interface
class prog8 {
    public static void main(String[] args) throws java.lang.ClassNotFoundException {

        Runnable r1 = new MyRun("This is Thread 1");
        Runnable r2 = new MyRun("This isThread 2");
        Runnable r3 = new MyRun("This isThread 3");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public String toString() {
        return "prog1 []";
    }
}

class MyRun implements Runnable {
    private String tn;

    public MyRun(String name) {
        this.tn = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(tn + " - Count is start: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(tn + " now running  has finished.");
    }
}
