interface P{
	int A = 10 ;
	void a();
}


interface P1 extends P{
	int B= 20 ; 
	void b();
}

interface P2 extends P{
	int C= 30 ; 
	void c() ;
}


interface P12 extends P1,P2{
	int D = 40 ; 
	void d() ;
}

class Q implements P12{
	public void a(){
		System.out.println("A = " + A) ; 
	}
	public void b(){
		System.out.println("B = " + B) ; 
	}
	public void c(){
		System.out.println("C = " + C) ; 
	}
	public void d(){
		System.out.println("D = " + D) ; 
	}
}

class Main{
	public static void main(String args[]){
		Q q = new Q() ; 
		q.a() ; 
		q.b() ;
		q.c() ; 
		q.d() ; 
	}
}
