import javax.swing.* ;
import java.awt.*;
import java.awt.event.* ;


class Calculator extends JFrame implements ActionListener{
    JLabel l1 , l2 , l3, l4 ; 
    JTextField t1 , t2 , t3 ; 
    JButton add , sub , mul , div ,mod ; 

    Calculator(){
        setSize(500,500);
        setTitle("Calculator");
        setLayout(new GridLayout(6,2,10,10));    
        
        l1 = new JLabel("Num 1") ; 
        l1.setHorizontalAlignment(JLabel.CENTER); 
        l2 = new JLabel("Num 2") ; 
        l2.setHorizontalAlignment(JLabel.CENTER);
        l3 = new JLabel("Result") ;
        l3.setHorizontalAlignment(JLabel.CENTER);
        l4 = new JLabel() ;

        t1 = new JTextField(10) ; 
        t1.setHorizontalAlignment(JTextField.CENTER);
        t2 = new JTextField(10) ; 
        t2.setHorizontalAlignment(JTextField.CENTER);
        t3 = new JTextField(10) ;
        t3.setHorizontalAlignment(JTextField.CENTER);

        add = new JButton("+") ; 
        sub = new JButton("-") ;
        mul = new JButton("*") ; 
        div = new JButton("/") ; 
        mod = new JButton("%") ; 
        
        add(l1) ;  
        add(l2) ; 
        add(t1) ;
        add(t2) ; 
        add(add) ; 
        add(sub) ; 
        add(mul) ; 
        add(div) ; 
        add(mod) ; 
        add(l4) ; 
        add(l3) ; 
        add(t3) ; 

        add.addActionListener(this) ; 
        sub.addActionListener(this) ; 
        mul.addActionListener(this) ; 
        div.addActionListener(this) ; 
        mod.addActionListener(this) ;
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText()) ;
        int num2 = Integer.parseInt(t2.getText()) ; 
        double result ;

        if ( e.getSource() == add ){
            result =  num1+ num2 ; 
            t3.setText(""+result);
        }else if( e.getSource() == sub){
            result = num1 - num2 ; 
            t3.setText(""+result);
        }else if (e.getSource() == mul){
            result = num1 * num2 ;
            t3.setText(""+result);
        }else if ( e.getSource() == mod){
            try{
                result = num1 % num2 ; 
                t3.setText("" + result ) ; 
            }catch(Exception ee ){
                t3.setText("Can't divide by 0") ;
            }
        }else   
            try{
                result = num1 / num2 ; 
                t3.setText(""+result);
            }catch(Exception ee){
                t3.setText("Can't divide by 0");
            }        
    }
}

class Main{
    public static void main(String[] args) {
        Calculator c = new Calculator() ;
    }
}