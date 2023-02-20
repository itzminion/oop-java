class Main{
    public static void main(String args[]){
        int a[]={4 , 2 , -3 , 123, 0 , -27};
        int min=1000;

        int n=a.length;
        System.out.print("The array is ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        
            System.out.println();
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("The smallest element is "+min);
        int min2=1000;
        for(int i=0;i<n;i++){
            if(a[i]==min)
                continue;
            else{
                if(a[i]<min2){
                    min2=a[i];
                }
            }
        }   
        if(min2==1000)
            System.out.println("No second smallest element");
        else
            System.out.println("The second smallest element is "+min2);
    }
}   