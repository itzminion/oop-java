import java.util.* ; 
import java.io.* ; 

class Main{
	static void createFile() throws Exception{
		PrintWriter p = new PrintWriter("file.txt") ; 
		System.out.println("Enter the data to the file or file: ") ;
		System.out.println("To Exit : EOF") ; 
		Scanner s = new Scanner(System.in) ; 
		String line = s.nextLine() ; 
		while( ! line.equals("EOF") ){
			p.println(line) ; 
			line = s.nextLine() ;
		}
		p.flush() ; 
		s.close() ;
		p.close() ;
	}
	public static void main(String args[]) throws Exception {
		createFile() ; 
		PrintWriter p = new PrintWriter("output.txt");
		BufferedReader br = new BufferedReader(new FileReader("file.txt")); 
		String line = br.readLine() ; 
		for ( int i =1 ; line != null ; i++ ){
			p.print(i + ": " ) ; 
			p.println(line) ; 
			line = br.readLine() ;
		}
		p.flush() ; 
		p.close() ; 
	}
}

