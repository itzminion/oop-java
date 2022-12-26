import java.util.* ;
import java.io.* ; 

class Main{
	public static void main(String args[]) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)) ; 
		System.out.println("Enter the integeres : " ) ; 
		String line = br.readLine() ; 
		String d =" " ; 
		StringTokenizer st = new StringTokenizer(line,d) ;
		int sum = 0 ;  
		while(st.hasMoreTokens()){
			int x = Integer.parseInt(st.nextToken()) ; 
			System.out.print(x + " " ) ; 
			sum += x ; 
		}
		System.out.println("\nSum  = " + sum ) ; 
	}
}
