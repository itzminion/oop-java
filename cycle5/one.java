
class MyThread1 extends Thread{
    @Override
    public void run() {
        for ( int i = 1 ; i <= 100 ; i+=2)
        System.out.println(i) ;
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for ( int i = 0 ; i <= 100 ; i+=2)
        System.out.println(i) ;
    }
}

class Main{
    public static void main(String[] args) throws InterruptedException{
        MyThread1 t1 = new MyThread1() ; 
        MyThread2 t2 = new MyThread2(); 
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("Main thread") ; 
    }
}

