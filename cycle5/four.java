class Thread1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread 1");
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread 2");
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Main Thread");
    }
}