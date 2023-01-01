import java.util.Random;

class MyThread1 extends Thread {
    static int x;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Random r = new Random();
                x = r.nextInt(50);
                System.out.println("Num\t= " + x);
                Thread.yield();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            Thread.yield();
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                if (MyThread1.x % 2 == 0 && MyThread1.x != 0)
                    System.out.println(MyThread1.x + "^2\t= " + MyThread1.x * MyThread1.x);
                Thread.sleep(1000);
                Thread.yield();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                if (MyThread1.x % 2 != 0 && MyThread1.x != 0)
                    System.out.println(MyThread1.x + "^3\t= " + MyThread1.x * MyThread1.x * MyThread1.x);
                Thread.sleep(1000);
                Thread.yield();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Main {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        t1.start();
        t2.start();
        t3.start();

    }
}