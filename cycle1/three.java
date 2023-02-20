class Main{
    public static void main(String args[]){
        int a[][]={{1, 2, 3},{4, 5 , 6}};
        int r=a.length;
        int c=a[0].length;
        int t[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
               t[j][i]=a[i][j];
        }
        System.out.println("The original matrix is");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(a[i][j]+" ");
                System.out.println();
        }
        System.out.println();
        System.out.println("The transposed matrix is");
        
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++)
                System.out.print(t[i][j]+" ");
                System.out.println();
        }
    }
}