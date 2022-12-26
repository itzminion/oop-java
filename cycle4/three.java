import java.io.* ;
import java.util.* ;
class Main {
	static void createFile() throws Exception{
		int num ; 
		PrintWriter p = new  PrintWriter("file.txt") ;
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter 10 Integer value into the file") ;
		for ( int i = 0 ; i < 10 ; i++){
			num = s.nextInt() ; 
			p.println(num) ;
		}
		p.flush() ;
		p.close() ; 
	}
	public static void main(String args[]) throws Exception{
		createFile() ; 
		BufferedReader br = new BufferedReader(new FileReader("file.txt")) ; 
		int num , min , max=0 , range=0 ; 
		double avg = 0 ;
		String line = br.readLine() ;
		min = Integer.parseInt(line) ;  
		avg += min ;
		while( line != null ){
			num = Integer.parseInt(line) ; 
			if ( num < min ) 
				min = num ; 
			if ( num > max )
				max = num ; 
			avg += num ; 
			line = br.readLine() ; 
		}
		br.close() ; 
		avg = avg/10 ; 
		range = max - min ; 
		
		System.out.println(" min = " + min ) ; 
		System.out.println(" max = " + max ) ; 
		System.out.println(" avg = " + avg ) ; 
		System.out.println(" range =  " + range ) ; 		
	}
}                 
			
