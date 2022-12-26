class Time {
	int hr, min ; 
	Time(){
		hr = 5 ; 
		min = 0 ; 
	}
	Time(int hr, int min){
		this.hr = hr ; 
		this.min = min ; 
	}
	Time add(Time t){
		Time out = new Time(0,0);
		if ((this.min + t.min) > 60 ){
			out.min = (this.min+t.min)% 60 ; 
			out.hr +=1 ; 
		}
		else
			out.min = this.min + t.min ; 

		if ((this.hr + t.hr +out.hr) >12 )
			out.hr =  (this.hr + t.hr + out.hr)%12 ; 
		else 
			out.hr += (this.hr + t.hr) ; 
		return out ; 
	}

	void display(){
		System.out.println(this.hr+" : " + this.min) ; 
	}
}

class Main{
	public static void main(String args[]){
		Time t1 = new Time() ;
		Time t2 = new Time(10,30) ; 
		Time t3 = t1.add(t2) ; 
		
		t1.display() ; 
		t2.display() ;
		t3.display() ;
	}
}
		
		
		
