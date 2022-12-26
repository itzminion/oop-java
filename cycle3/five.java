interface Area{
	double area();
}

interface Volume{
	double volume();
}

class Shape {
	final double PI = 3.14;
	String name ; 
	Shape(){ 
		name = new String() ;		
	}	
	String getName(){
		return name ; 
	}
}

class Circle extends Shape implements Area {
	double radius ;
	Circle(double r,String n){
		radius = r; 
		name = n ; 
	}
	public double area(){
		return PI * radius * radius ;
	} 
}

class Square  extends Shape implements Area{
	double side ;
	Square(double s , String n){
		side = s ; 
		name = n ; 
	}
	public double area(){
		return side * side  ; 
	}
}

class Cylinder extends Circle implements Volume{
	double height ;
	Cylinder(double h, double r , String n){
		super(r,n);
		height = h ;
	}
	public double volume(){
		return PI * radius * radius * height ;
	}
}

class Sphere extends Circle implements Volume{
	Sphere(double r, String n){
		super(r,n) ;
	}
	public double volume(){
		return 4 / 3 * PI * radius * radius * radius ;
	}
		
}

class Cube extends Square implements Volume{
	Cube(double s , String n){
		super(s,n); 
	}
	public double volume(){
		return side * side * side ;
	}
}

class Glome extends Sphere implements Volume{
	Glome(double r,String n){
		super(r,n);
	}
	public double volume(){
		return 0.5 * PI * PI * radius * radius * radius *radius ;
	}
		
}

class Main{
	public static void main(String args[]){
		Circle circle = new Circle(5,"circle");
		Square square = new Square(5,"Square") ;
		Cylinder cylinder = new Cylinder(10,5,"Cylinder") ;
		Sphere sphere =new Sphere(5,"sphere");
		Cube cube = new Cube(5,"cube") ;
		Glome glome = new Glome(5,"glome") ;
		
		System.out.println("Area of " + circle.getName() + "\t\t: " + circle.area() ) ; 
		System.out.println("Area of " + square.getName() + "\t\t: " + square.area() ) ; 
		
		System.out.println("Volume of " + cylinder.getName() + "\t: " + cylinder.volume() ) ; 
		System.out.println("Volume of " + sphere.getName() + "\t: " + sphere.volume() ) ; 
		System.out.println("Volume of " + cube.getName() + "\t\t: " + cube.volume() ) ; 
		System.out.println("Volume of " + glome.getName() + "\t\t: " + glome.volume() ) ; 
	}
}









