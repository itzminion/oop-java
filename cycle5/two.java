
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 1 \n Priority " +getPriority()) ;
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 2 \n Priority " +getPriority()) ;
    }
}

class MyThread3 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 3 \n Priority " +getPriority()) ;
    }
}

class Main{
    public static void main(String[] args)throws InterruptedException{
        MyThread1 t1 = new MyThread1() ;
        MyThread2 t2 = new MyThread2() ;
        MyThread3 t3 = new MyThread3() ;
        t1.setPriority(2);
        t2.setPriority(5); 
        t3.setPriority(9);
        t1.start() ; 
        t2.start() ;
        t3.start() ;}
}