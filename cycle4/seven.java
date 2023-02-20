import java.io.* ; 
import java.util.* ; 

class Student{
	int rollNo,age ; 
	String name, course ; 
	Student(String name , int age ,int rollNo , String course){
		this.name = name ; 
		this.age = age ; 
		this.rollNo = rollNo ; 
		this.course = course ;	
	}
	void display(){
		System.out.println("Name\t: " + name ) ; 
		System.out.println("Age\t: " + age ) ; 
		System.out.println("RollNo\t: " + rollNo ) ; 
		System.out.println("Course\t: " + course + "\n") ; 
	}	
}
class NotValidAgeException extends RuntimeException{
	NotValidAgeException(String msg){
		super(msg) ; 
	}
}
class Main{
	public static void main(String args[]) throws Exception{
		String name , course ; 
		int rollNo , age ; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			try{
				System.out.println("Enter the Following details in order: Name age rollNo course\nCtrl + C to exit  ") ;
				StringTokenizer st = new StringTokenizer(br.readLine()," "); 
				while(st.hasMoreTokens()){
					name = st.nextToken() ; 
					age = Integer.parseInt(st.nextToken()) ;  
					try{
						if ( age >21 || age < 15)
							throw new NotValidAgeException("Age should be between 15 and 21") ; 
					}catch(NotValidAgeException e){
						System.out.println("Not a valid age! \n"); 
						break ; 
					}
					rollNo = Integer.parseInt(st.nextToken()) ; 
					course = st.nextToken() ;
					Student s = new Student(name,age,rollNo, course) ; 
					s.display() ;
					
				}
	
			}catch(Exception e){
				System.out.println("Some error has occured !\nTry again with correct format\n\n");
			}
		}while(true) ; 
		
	}
}

		
		
		
