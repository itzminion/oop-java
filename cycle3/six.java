interface Operations{
	double PI = 3.14 ;
	double area() ;
	double volume() ; 
}

class Cylinder implements Operations{
	double height ,radius; 
	Cylinder(double radius , double height){
		this.radius = radius ;  
		this.height = height ; 
	}
	public double area(){
		return 2 * PI * radius * height ;
	}

	public double volume(){
		return PI * radius * radius * height ;
	}
}


class Main{
	public static void main(String args[]){
		Operations c = new Cylinder(5,10) ;
		System.out.println("Area of Cylinder = " + c.area() ) ;
		System.out.println("Volume of Cylinder = " + c.volume() ) ; 
	}
}
