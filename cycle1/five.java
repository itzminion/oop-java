class Main{
    public static void main(String args[]){
        int n=113;
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        System.out.println("The given number is "+n);
        if(flag==0)
            System.out.println("It is a Prime Number");
        else
            System.out.println("It is not a Prime Number");
    }
} 