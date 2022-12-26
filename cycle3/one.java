class Employee{
	String name, phone , address ; 
	int age ; 
	double salary ; 
	Employee(String name , int age , String phone , String address , double salary ){
		this.name = name ; 
		this.age = age ; 
		this.phone = phone ; 
		this.address = address ; 
		this.salary = salary ; 	
	}
	void printSalary(){
		System.out.println("Salary of "+this.name + " = " + salary ) ;
	}
}

class Officer extends Employee { 
	String specialization ; 
	Officer(String name , int age , String phone , String address , double salary , String specialization ) {
		super(name , age, phone , address, salary);
		this.specialization = specialization ; 	
	}
	void  printDetails(){
		System.out.println() ; 
		System.out.println("Name : " + name ) ; 
		System.out.println("age : " + age ) ; 
		System.out.println("phone : " + phone ) ; 
		System.out.println("address : " + address ) ;
		printSalary() ; 
		System.out.println("Specialization : " + specialization ) ; 
	}
}

class Manager extends Employee{
	String department ; 
	Manager(String name , int age , String phone , String address , double salary , String department ) {
		super(name , age, phone , address, salary);
		this.department = department ; 	
	}
	void  printDetails(){
		System.out.println() ; 
		System.out.println("Name : " + name ) ; 
		System.out.println("age : " + age ) ; 
		System.out.println("phone : " + phone ) ; 
		System.out.println("address : " + address ) ; 
		printSalary() ;
		System.out.println("Department : " + department ) ; 
	}
}
class Main{
	public static void main(String args[]){
		Officer o = new Officer("sreelal" , 21 , "9876543210", "malappuram" , 25000 , "computer science") ; 
		Manager  m = new Manager("Midlaj", 22 , "9812345670", "Kozhikkode" , 50000 , "Chemical" ) ; 
		
		o.printDetails() ; 
		m.printDetails() ;
	}
}












