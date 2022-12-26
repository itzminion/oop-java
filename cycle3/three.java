class Staff{
	String code ; 
	String name ; 
	Staff(String name , String code){
		this.code = code ; 
		this.name = name ;
	}
		
}


class Faculty extends Staff{
	String department ; 
	String subject ; 
	String research ; 
	Faculty(String name, String code , String department , String subject , String research){
		super(name, code ) ; 
		this.department = department ; 
		this.subject = subject ; 
		this.research = research ; 
	}
	void printDetails(){
		System.out.println() ; 
		System.out.println("Name : "+ name ) ; 
		System.out.println("code : " + code ) ; 
		System.out.println("department: " + department ) ; 
		System.out.println("subject : " + subject ) ; 
		System.out.println("research: " + research ) ;
	}	
	
}

class Typist extends Staff{
	String office;
	double speed ; 
	Typist(String name , String code , String office , double speed ){
		super(name,code) ; 
		this.office = office ;
		this.speed = speed ; 
	}
}

class Permanent extends Typist{
	double salary ; 
	Permanent(String name, String code, String office, double speed , double salary){
		super(name, code, office, speed ) ; 
		this.salary = salary ; 
	}
	void printDetails(){
		System.out.println() ; 
		System.out.println("Name : "+ name ) ; 
		System.out.println("code : " + code ) ; 
		System.out.println("office : " + office ) ; 
		System.out.println("speed : " + speed ) ; 
		System.out.println("Salary : " + salary ) ;
	}
}

class Casual extends Typist{
	double dailyWage ; 
	Casual(String name , String code, String office, double speed, double wage){
		super(name, code, office, speed ) ; 
		this.dailyWage = wage ; 
	}
	void printDetails(){
		System.out.println() ; 
		System.out.println("Name : "+ name ) ; 
		System.out.println("code : " + code ) ; 
		System.out.println("office : " + office ) ; 
		System.out.println("speed : " + speed ) ; 
		System.out.println("wage : " + dailyWage) ;
	}
}

class Officer extends Staff{
	String rank ; 
	String grade ; 
	Officer(String name , String code , String rank , String grade){
		super(name, code) ; 
		this.rank = rank ; 
		this.grade = grade ; 
	} 
	void printDetails(){
		System.out.println() ; 
		System.out.println("Name : "+ name ) ; 
		System.out.println("code : " + code ) ; 
		System.out.println("rank : " + rank ) ; 
		System.out.println("grade : " + grade ) ; 
	}
} 

class Main{
	public static void main(String args[]){
		Faculty faculty = new Faculty("midlaj","b21","cs","ds","AI") ; 
		Permanent permanent = new Permanent("sreelal","b22","AAA",101,25000);
		Casual casual = new Casual("anas","b23","bbb",80,700);
		Officer officer = new Officer("fasal","b24","rank1","grade1") ; 
		
		faculty.printDetails();
		permanent.printDetails() ; 
		casual.printDetails() ;
		officer.printDetails() ;
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
