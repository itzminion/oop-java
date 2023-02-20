
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 1 ") ; 
        for ( int i = 1 ; i <= 100 ; i+=2)
        System.out.print(i + " ") ;
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("\nThread 2 ") ; 
        for ( int i = 2 ; i <= 100 ; i+=2)
        System.out.print(i + " ") ;
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
        System.out.println("\nMain thread") ; 
    }
}

