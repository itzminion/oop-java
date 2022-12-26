class Complex{
	double real, img ; 
	Complex(){
		this.real = 5 ;
		this.img = 6 ; 
	}
	Complex(double real, double img){
		this.real = real ; 
		this.img = img ; 
	}

	void display(){
		System.out.println(real+" + "+img+"i") ; 
	}
	Complex add(Complex c){
		Complex out = new Complex(0,0);
		out.real = this.real + c.real ; 
		out.img = this.img + c.img ;
		return out ;
	}
}

class Main{
	public static void main(String args[]){
		Complex c1 = new Complex() ; 
		Complex c2 = new Complex(10,11) ;
		Complex c3 = c1.add(c2) ; 
		
		c1.display() ; 
		c2.display() ;
		c3.display() ;
	}
}
