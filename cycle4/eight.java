class SalesZeroException extends RuntimeException{
	SalesZeroException(String msg){
		super(msg) ; 
	}
}
class Salesman{
	String name , code ; 
 	double amount , commission ; 
	Salesman(String name , String code , double amount ){
		this.name = name ; 
		this.code = code ; 
		this.amount = amount ; 
	}
	void calCommission(){
		try{
		if( amount < 0) 
			throw new SalesZeroException("Sales Amount Zero");
		}catch(SalesZeroException e){
			System.out.println("Sales amount is less than zero, amount set to zero  ") ; 
			this.amount = 0 ; 	
		}
		if(amount < 2000)
			commission = amount*8/100 ; 
		else if(amount >= 2000 && amount <=5000 ) 
			commission = amount *10/100 ; 
		else if(amount > 5000) 
			commission =amount * 12/100 ; 
	}
	void display(){
		System.out.println("Name\t: "+name ) ; 
		System.out.println("Code\t: "+code ) ; 
		System.out.println("Amount\t: "+amount ) ; 
		System.out.println("Commission\t: " + commission ) ; 
	} 

}

class Main{
	public static void main(String args[]){
		try{
			Salesman s= new Salesman(args[0],args[1],Double.parseDouble(args[2])) ;
			s.calCommission() ;
			s.display() ; 
		}catch(Exception e){
			System.out.println("Please Enter command line arguments: command <name> <code> <salary>") ; 
			
		}
		
	}
}
		
