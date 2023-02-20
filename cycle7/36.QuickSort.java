import java.util.*;
class Main{
    static void display(String a[]){
        for(String name:a)
            System.out.println(name) ;
        System.out.println() ;
    }
    public static int partition(String a[], int lb, int ub){
        String pivot = a[ub] ;
        int i = lb - 1 ;
        for(int j = lb; j < ub; j++){
            if(a[j].compareToIgnoreCase(pivot) < 0){
                i++ ;
                String temp = a[i] ;
                a[i] = a[j] ;
                a[j] = temp ;
            }
        }
        i++;
        String x = a[i] ;
        a[i] = pivot ;
        a[ub] = x ;
        return i ;
    }
    public static void sort(String a[],int lb,int ub){
            if(lb < ub){
                int pindex = partition(a, lb, ub) ;
                sort(a, lb, pindex - 1);
                sort(a, pindex + 1, ub);
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("=> Enter Size of List : ") ;
        int n = Integer.parseInt(s.nextLine()) ;
        String[] a = new String [n] ;
        
        System.out.println("=> Enter Name");
        for(int i=0;i<n;i++)
            a[i] = s.nextLine();
        System.out.println("\n=> The list before sort") ;
        display(a) ;
        sort(a, 0, n - 1) ;
        System.out.println("=> After sort") ;
        display(a) ;
    }
}