abstract class Shape{
	int sides ; 
	abstract int numberOfSides() ;
}

class Rectangle extends Shape{
	Rectangle(int side){
		sides  = side ; 
	}
	int numberOfSides(){
		return sides ; 
	}

}

class Triangle extends Shape{
	Triangle(int side){
		sides = side ; 
	}
	int numberOfSides(){
		return sides ; 
	}

}

class Hexagon extends Shape{
	Hexagon(int side){
		sides = side ;
	}
	int numberOfSides(){
		return sides ; 
	}
}

class Main{
	public static void main(String args[]){
		Shape r = new Rectangle(4) ; 
		System.out.println("Rectangle : " + r.numberOfSides() ) ; 
		r = new Triangle(3) ; 
		System.out.println("Triangle  : " + r.numberOfSides() ) ; 
		r = new Hexagon(6) ; 
		System.out.println("Hexagon   : " + r.numberOfSides() ) ; 
	}
}
