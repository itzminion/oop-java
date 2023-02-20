class Main{
    public static void main(String args[]){
        int a[][]={{1 , 2 , 3},{4 , 5 , 6},{7 , 8 , 9 }};
        int b[][]={{10, 15, 20, 25, },{30, 35 , 40 , 45 },{50, 55, 60, 65}};

        int r1=a.length;
        int r2=b.length;
        int c1=a[0].length;
        int c2=b[0].length;
        int c[][]=new int[r1][c2];
        System.out.println("Matrix 1=");
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix 2=");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++)
                System.out.print(b[i][j]+" ");
            System.out.println();
        }
        System.out.println();
        if(c1==r2){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    c[i][j]=0;
                    for(int k=0;k<r2;k++)
                        c[i][j]+=a[i][k]*b[k][j];
                }
            }
            System.out.println("Resultant matrix=");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++)
                    System.out.print(c[i][j]+" ");
                    System.out.println();
            }
        }else
            System.out.println("Matrix multiplication is not possible");
        }
} 