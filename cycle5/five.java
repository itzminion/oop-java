class Bank{
    double balance ; 
    synchronized void deposit(double amount){
        try{
            balance += amount ;
            System.out.println("Deposited amount\t: "+ amount);
            System.out.println("Balance\t\t: "+balance ) ;
        }catch(Exception e){
            System.out.println(e) ; 
        }
    }

    synchronized void withdraw(double amount){
        try{
            if(balance < amount){
                System.out.println("Insufficient balance !");
                System.out.println("Cannot withdraw\t:"+amount) ;
            }else{
                balance -= amount ;
                System.out.println("Amount Withdrawed\t: "+amount) ;
                System.out.println("Balance\t\t: "+balance);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class Thread1 extends Thread{
    Bank b ;
    double n ; 
        
}

