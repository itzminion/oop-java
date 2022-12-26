import java.io.* ; 

class Main{
	static void createFile() throws Exception{
		PrintWriter p1= new PrintWriter("file1.txt") ; 
		PrintWriter p2= new PrintWriter("file2.txt") ; 
		
		p1.println(222) ; 
		p1.println(333) ; 
		p1.println(444) ; 
		p1.println(555) ; 
		p1.flush() ; 
		p1.close() ; 
		
		p2.println("AAA") ; 
		p2.println("BBB") ;
		p2.println("CCC") ; 
		p2.println("DDD") ; 
		p2.println("EEE") ;
		p2.flush() ;
		p2.close() ; 
	}
	
	public static void main(String args[]) throws Exception{
		createFile();
		PrintWriter p = new PrintWriter("merged.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt")) ; 
		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt")) ; 
		String l1 = br1.readLine() ; 
		String l2 = br2.readLine() ; 
		while( l1 != null || l2 != null ){
			if(l1 != null ){
				p.println(l1) ; 
				l1 =br1.readLine() ;
			}
			if(l2 != null){ 
				p.println(l2) ; 
				l2 = br2.readLine() ;
			}
		}
		p.flush();
		br1.close() ; 
		br2.close() ; 
		p.close() ; 
	}
}
	
	
	
	
