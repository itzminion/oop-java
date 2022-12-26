class Main{
	public static void main(String args[]){
		String str= "hello" ; 
		String strRev = "" ;
		int len = str.length() ;
		for ( int i = len-1 ; i >= 0 ; i--)
			strRev += str.charAt(i) ; 
		
		System.out.println("str = "+str) ; 
		System.out.println("strRev = "+strRev) ; 
		if (str.equals(strRev))
			System.out.println("Palliandrome") ; 
		else 
			System.out.println("Not palliandrome") ; 
	
	}
}

