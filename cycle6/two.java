import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TrafficLight extends JPanel implements ActionListener{
	private JRadioButton r1,r2,r3;
	private Color red_c,yellow_c,green_c;
	TrafficLight(){
		setBounds(0,0,640,480);
		r1 = new JRadioButton("Red");
		r2 = new JRadioButton("Yellow");
		r3 = new JRadioButton("Green");
		red_c = getBackground();
		yellow_c = getBackground();
		green_c = getBackground();
		add(r1);
		add(r2);
		add(r3);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
	}
	public void actionPerformed(ActionEvent e){
		if(r1.isSelected() == true){
			red_c = Color.red;
			yellow_c = getBackground();
			green_c = getBackground();
		}
		else if(r2.isSelected() == true){
			red_c = getBackground();
			yellow_c = Color.yellow;
			green_c = getBackground();
		}
		else if(r3.isSelected() == true){
			red_c = getBackground();
			yellow_c = getBackground();
			green_c = Color.green;
		}
		repaint();
	}
	public void paintComponent(Graphics g){
		g.drawRect(290,40,70,200);
		g.fillRect(290,40,70,200);
		g.drawOval(300,50,50,50);
		g.fillOval(300,50,50,50);
		g.drawOval(300,110,50,50);
		g.fillOval(300,50,50,50);
		g.drawOval(300,170,50,50);
		g.fillOval(300,50,50,50);
		g.setColor(red_c);
		g.fillOval(300,50,50,50);
		g.setColor(yellow_c);
		g.fillOval(300,110,50,50);
		g.setColor(green_c);
		g.fillOval(300,170,50,50);
	}
}
class Main{
	public static void main(String args[]){
		JFrame f = new JFrame("Traffic Light");
		f.setVisible(true);
		f.setSize(640,480);
		f.setLayout(null);
		TrafficLight p = new TrafficLight();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
	}
}