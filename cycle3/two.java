class Employee{
	void display(){
		System.out.println("class Employee") ; 
	}

	void calcSalary(){
		System.out.println("Salary of employee is 10000 " ) ; 

	}
}

class Engineer extends Employee {
	void calcSalary(){
		super.calcSalary() ;
		System.out.println("Salary of engineer is 20000 " ) ; 
	}
}

class Main { 
	public static void main(String args[]) {
		Engineer e = new Engineer() ; 
		e.display() ; 
		e.calcSalary() ; 
	}
}

