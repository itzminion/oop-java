class Main{
    public static void main(String args[]){
        int a,b,c;
        a=4;
        b=-5;
        c=-2;
        
        System.out.println("The coefficients of the quadratic equations are "+a+","+b+" and "+c);
        double d=Math.pow(b,2)-4*a*c;
        if(d<0)
            System.out.println("The roots are imaginary");
        else if(d>0){
            System.out.println("The roots are distinct");
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots are "+r1+" and "+r2);
        }else{
            System.out.println("The roots are equal");
            double r=-b/(2*a);
            System.out.println("The root is "+r);
        }
    }
}