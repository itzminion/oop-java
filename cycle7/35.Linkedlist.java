import java.util.* ;
class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in) ;
        List<String> l = new LinkedList<String>() ;
        int ch =0; 
        
        while(ch != 4){
            System.out.println("\n-----------------------------------------------");
            System.out.print("1.Add Element 2.Remove Element 3.Display 4.Exit \n>> ");
            ch = Integer.parseInt(s.nextLine()); 
            switch(ch){
                case 1:
                    System.out.print("Enter Element : ") ; 
                    l.add(s.nextLine()) ;
                    break ; 
                    
                case 2:
                    System.out.print("Enter Element : ") ; 
                    String temp =s.nextLine() ; 
                    if( l.contains(temp))
                        l.remove(temp) ;
                    else 
                        System.out.println("Element Not Found");
                    break ; 
                case 3: 
                    System.out.println("List "+ l) ;  
                    break; 
                case 4: 
                    break ; 
                default:
                    System.out.println("Invalid Entry") ; 
            }
        }
    }
}