//Create the program to create multiple threads, show an example of notify, notifyall, wait, resume, sleep methods.
class ShareResources {
    
    private int value;
    private boolean isP;

    public synchronized void P(int newV) {
        while (isP) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        value = newV;
        System.out.println("Your thread is processing: " + value);
        isP = true;
        notify();
    }

    public synchronized void C(int newV) {
        while (!isP) { // Change isP to !isP
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        value = newV;
        System.out.println("Your thread is processing: " + value);
        isP = false;
        notify();
    }
}

class P implements Runnable {
    private ShareResources sR;

    public P(ShareResources sR) {
        this.sR = sR;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            sR.P(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class C implements Runnable {
    private ShareResources sR;

    public C(ShareResources sR) {
        this.sR = sR;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            sR.C(i); // Change sR.P(i) to sR.C(i)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class program12 {
    public static void main(String[] args) {
        ShareResources sR = new ShareResources();

        Thread proc = new Thread(new P(sR));
        Thread cons = new Thread(new C(sR));

        proc.start();
        cons.start();
    }
}
