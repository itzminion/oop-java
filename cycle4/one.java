import java.io.* ;

class Main{
	static void createFile() throws Exception{
		PrintWriter file1 = new PrintWriter("file1.txt") ; 
		PrintWriter file2 = new PrintWriter("file2.txt") ;


		file1.println(222) ; 
		file1.println(333) ;
		file1.println(444) ; 
		file1.println(555) ;
		file1.flush() ; 
		file1.close() ; 

		file2.println("AAA") ; 
		file2.println("BBB") ; 
		file2.println("CCC") ; 
		file2.println("DDD") ; 
		file2.println("EEE") ; 
		file2.flush() ;
		file2.close() ;
	}
	public static void main(String args[]) throws Exception{
		createFile() ;
		PrintWriter p = new PrintWriter("merged.txt") ; 
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
		String word = br1.readLine() ; 
		while( word != null ){
			p.println(word) ; 
			word = br1.readLine() ; 
		}
		br1.close() ; 
		word = br2.readLine() ; 
		while( word != null ){
			p.println(word) ; 
			word = br2.readLine() ; 
		}
		br2.close() ; 
		p.flush() ; 
		p.close() ;
	}
}
			
		
		
		
