

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Calculator implements ActionListener{
	JFrame f;
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bdec,bequ,bclr;

	static double a=0,b=0,result=0;
	static  int operator=0;


	Calculator(){
		f = new JFrame("Calculator");
		f.setLayout(null);
		f.setSize(270,450);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		t = new JTextField();
		t.setBounds(20,20,230,50);
		t.setEditable(false);
		f.add(t);

		b1 = new JButton("1");
		b1.setBounds(20,80,50,50);
		f.add(b1);

		b2 = new JButton("2");
		b2.setBounds(80,80,50,50);
		f.add(b2);

		b3 = new JButton("3");
		b3.setBounds(140,80,50,50);
		f.add(b3);

		b4 = new JButton("4");
		b4.setBounds(20,140,50,50);
		f.add(b4);

		b5 = new JButton("5");
		b5.setBounds(80,140,50,50);
		f.add(b5);

		b6 = new JButton("6");
		b6.setBounds(140,140,50,50);
		f.add(b6);

		b7 = new JButton("7");
		b7.setBounds(20,200,50,50);
		f.add(b7);

		b8 = new JButton("8");
		b8.setBounds(80,200,50,50);
		f.add(b8);
		b9 = new JButton("9");
		b9.setBounds(140,200,50,50);
		f.add(b9);

		b0 = new JButton("0");
		b0.setBounds(80,260,50,50);
		f.add(b0);


		badd = new JButton("+");
		badd.setBounds(200,80,50,50);
		f.add(badd);
		
		bsub = new JButton("-");
		bsub.setBounds(200,140,50,50);
		f.add(bsub);

		bmul = new JButton("*");
		bmul.setBounds(200,200,50,50);
		f.add(bmul);
		
		bdiv = new JButton("/");
		bdiv.setBounds(200,260,50,50);
		f.add(bdiv);


		bdec = new JButton(".");
		bdec.setBounds(20,260,50,50);
		f.add(bdec);

		bequ = new JButton("=");
		bequ.setBounds(140,260,50,50);
		f.add(bequ);

		bclr = new JButton("CLR");
		bclr.setBounds(80,320,110,50);
		f.add(bclr);



		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bdec.addActionListener(this);
		bequ.addActionListener(this);
		bclr.addActionListener(this);


		f.setVisible(true);	
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			t.setText(t.getText().concat("1"));
		}
		if(e.getSource()==b2){
			t.setText(t.getText().concat("2"));
		}
		if(e.getSource()==b3){
			t.setText(t.getText().concat("3"));
		}
		if(e.getSource()==b4){
			t.setText(t.getText().concat("4"));
		}
		if(e.getSource()==b5){
			t.setText(t.getText().concat("5"));
		}
		if(e.getSource()==b6){
			t.setText(t.getText().concat("6"));
		}
		if(e.getSource()==b7){
			t.setText(t.getText().concat("7"));
		}
		if(e.getSource()==b8){
			t.setText(t.getText().concat("8")); 
		}
		if(e.getSource()==b9){
			t.setText(t.getText().concat("9"));
		}
		if(e.getSource()==b0){
			t.setText(t.getText().concat("0"));
		}
		if(e.getSource()==bdec){
			t.setText(t.getText().concat("."));
		}


		if(e.getSource()==badd){
			a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
		}
		if(e.getSource()==bsub){
			a=Double.parseDouble(t.getText());
			operator=2;
			t.setText("");
		}
		if(e.getSource()==bmul){
			a=Double.parseDouble(t.getText());
			operator=3;
			t.setText("");
		}
		if(e.getSource()==bdiv){
			a=Double.parseDouble(t.getText());
			operator=4;
			t.setText("");
		}



		if(e.getSource()==bequ){
			b=Double.parseDouble(t.getText());

			switch(operator){
				case 1:	result=a+b;
						break;
				case 2:	result=a-b;
						break;
				case 3:	result=a*b;
						break;
				case 4: result=a/b;
						break;
				default:t.setText("Invalid operator");
			}
			t.setText(""+result);
		}

		if(e.getSource()==bclr){
			t.setText("");
		}

	}

	public static void main(String args[]){
		new Calculator();
		
	}
}

