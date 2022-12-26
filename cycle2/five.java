class Account{
	String name,address,type;
	int no ; 
	double bal ;
 
	Account(String name, int no , double balance){
		this.name = name ; 
		this.no = no ; 
		this.bal = balance ; 
	}
	
	Account(String name, int no , String address , String type , double balance){
		this.name = name ; 
		this.no = no ; 
		this.address = address ;
		this.type = type ; 
		this.bal = balance ; 
	}
	void deposit(double amount){
		bal += amount ; 
	}
	void withdraw(double amount){
		bal -= amount ; 
	}
	double getBalance(){
		return bal ; 
	}
}

class Main{
	public static void main(String args[]){
		Account a1 = new Account("sreelal",10,5000);
		Account a2 = new Account("Midlaj",11,"malappuram","savings",7000);
		
	
		System.out.println("Balance for "+a1.name+" is "+a1.getBalance());
		a1.deposit(2500); 
		System.out.println("Balance for "+a1.name+" is "+a1.getBalance());

		System.out.println("Balance for "+a2.name+" is "+a2.getBalance());
		a2.withdraw(200) ; 
		System.out.println("Balance for "+a2.name+" is "+a2.getBalance());
		
	}
}
	
		
