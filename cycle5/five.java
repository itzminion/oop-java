class Bank{
	double total=0;
	public synchronized void deposit(double amt){
		try{
			Thread.sleep(500);
			total+=amt;
			System.out.println("Deposited amount:\t"+amt);
			System.out.println("Total amount:\t"+total);
			System.out.println();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	public synchronized void withdraw(double amt){
		try{
			Thread.sleep(500);
			if(amt<total){
				total-=amt;
				System.out.println("Withdrawed amount:\t"+amt);
				System.out.println("Total amount:\t"+total);
				System.out.println();
			}
			else{
				System.out.println("Insufficient balance!");
				System.out.println("Cannot withdraw:\t"+amt);
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

class Thread1 extends Thread{
	Bank b;
	double n;
	char c;
	Thread1(Bank b,double n,char c){
		this.b=b;
		this.n=n;
		this.c=c;
	}
	public void run(){
		if(c=='d'){
			b.deposit(n);
		}
		else{
			b.withdraw(n);
		}
	}
}

class Main{
	public static void main(String args[]) throws Exception{
		Bank obj = new Bank();
		Thread1 t1=new Thread1(obj,500.0,'d');
		Thread1 t2=new Thread1(obj,620.0,'w');
		Thread1 t3=new Thread1(obj,390.0,'d');
		Thread1 t4=new Thread1(obj,200.0,'w');
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
