class Shape{
	double length,breadth,height,radius,area ;
	int base ; 

	Shape(){
		length = breadth = height = radius =  0.0 ; 
		base = 0 ; 
	}

	Shape(double radius){		//circle
		this.radius = radius ;
		area(radius) ; 			
	}
	
	Shape(double length,double breadth){	//Rectangle
		this.length = length ; 
		this.breadth = breadth ; 
		area(this.length,this.breadth);
	}
	
	Shape(int base ,double height){		//triangle
		this.base = base ; 
		this.height =  height ; 
		area(this.base, this.height) ; 
	}
	Shape(double length,double breadth , double height){	//Trapizoid
		this.length = length ; 
		this.breadth = breadth ; 
		this.height = height ; 
		area(this.length,this.breadth,this.height);
	}
	
	void area(double radius){		 //circle
		System.out.println("Area = "+(3.14*radius*radius)) ; 
	}
	
	void area(double length,double breadth){ //Rectangle
		System.out.println("Area = "+(length*breadth)) ; 
	}
	
	void area(int base , double height){	//Traingle
		System.out.println("Area = "+(.5 * base * height )) ; 
	}
	
	void area(double length,double breadth, double height){	//Trapizoid
		double ar = (0.5 * (length+breadth) * height) ; 
		System.out.println("Area = "+ar) ; 
	}


}

class Main{
	public static void main(String args[]){
		Shape s1 = new Shape(5) ; 
		Shape s2 = new Shape(20,5);
		Shape s = new Shape(5,10.5) ; 
		Shape s4 = new Shape(1,3,5);
		
	}
}
		

		
