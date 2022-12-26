class Rectangle{
	double length,width ; 
	double perimeter, area  ;
	Rectangle(){
		length = 50;
		width = 60 ; 
	}
	Rectangle(double length, double width){	
		this.length = length ; 
		this.width = width ; 
	}
 	
	double perimeter(){
		return 2*(length + width) ; 
	}
	
	double area(){
		return length * width ; 
	}

	int sameArea(Rectangle r){
		if(this.area() == r.area()) 
			return 1 ; 
		else 	
			return 0 ; 
	}
}

class Main{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle() ; 
		Rectangle r2 = new Rectangle(50,70);

		System.out.println("Perimeter of r1 = "+r1.perimeter()) ; 
		System.out.println("Area of r1 = "+r1.area()) ; 
		
		System.out.println("Perimeter of r2 = "+r2.perimeter()) ; 
		System.out.println("Area of r2 = "+r2.area()) ; 
		
		if(r1.sameArea(r2)  == 1)
			System.out.println("Same area") ;
		else 	
			System.out.println("Diff area");
	}
}

