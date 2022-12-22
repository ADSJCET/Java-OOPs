package SWINGS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class calculator extends JFrame implements ActionListener {
	Label LB,LB2;
	JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B0;
	JButton BEql, BClear, BPlus, BMinus, BMulti, BDivide;
	
	int X, Y;
	int OP;
	int flag = 0;
	float Result = (float) 0.00004;
	void resultRecover() {
		if (flag != 0) {
			LB.setText(Float.toString(Result));
			LB2.setText(Float.toString(Result));
		}
		X = (int) Double.parseDouble(LB.getText());
		 LB.setText("");
	}
	void LBconcat(String D) {
		LB.setText(LB.getText().concat(D));
		LB2.setText(LB2.getText().concat(D));
	}
	calculator(){
		new JFrame("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LB = new Label("");
		LB2 = new Label("");
		LB.setFont(new Font("Sans", Font.PLAIN, 50));
		LB2.setFont(new Font("Sans", Font.PLAIN, 25));
		LB2.setForeground(Color.LIGHT_GRAY);
		//LB.setBackground(Color.GRAY);
		B1 = new JButton("1");
		B2 = new JButton("2");
		B3 = new JButton("3");
		B4 = new JButton("4");
		B5 = new JButton("5");
		B6 = new JButton("6");
		B7 = new JButton("7");
		B8 = new JButton("8");
		B9 = new JButton("9");
		B0 = new JButton("0");
		
		BEql = new JButton("=");
		BEql.setBackground(Color.ORANGE);
		BClear = new JButton("Clear");
		BClear.setBackground(Color.LIGHT_GRAY);
		BPlus = new JButton("+");
		BMinus = new JButton("-");
		BMulti = new JButton("x");
		BDivide = new JButton("/");
		
		LB2.setBounds(0,0,500,30);
		LB.setBounds(0,30,500,70);
		
        B1.setBounds(0,100,100,100);
        B2.setBounds(100,100,100,100);
        B3.setBounds(200,100,100,100);
        BPlus.setBounds(300,100,200,100);
        
        B4.setBounds(0,200,100,100);
        B5.setBounds(100,200,100,100);
        B6.setBounds(200,200,100,100);
        BMinus.setBounds(300,200,200,100);
        
        B7.setBounds(0,300,100,100);
        B8.setBounds(100,300,100,100);
        B9.setBounds(200,300,100,100);
        BMulti.setBounds(300,300,200,100);
        
        BClear.setBounds(0,400,100,100);
        B0.setBounds(100,400,100,100);
        BDivide.setBounds(200,400,100,100);
        BEql.setBounds(300,400,200,100);
        
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        B6.addActionListener(this);
        B7.addActionListener(this);
        B8.addActionListener(this);
        B9.addActionListener(this);                                                        
        B0.addActionListener(this);
        BPlus.addActionListener(this);
        BDivide.addActionListener(this);
        BMulti.addActionListener(this);
        BMinus.addActionListener(this);
        BEql.addActionListener(this);
        BClear.addActionListener(this);
        
        add(LB);
        add(LB2);
        add(B1);
        add(B2);
        add(B3);
        add(B4);
        add(B5);
        add(B6);
        add(B7);
        add(B8);
        add(B9);
        add(B0);
        
        add(BEql);
        add(BPlus);
        add(BMinus);
        add(BMulti);
        add(BDivide);
        add(BClear);
        
        setLayout(null);
		setVisible(true);
		setSize(515,538);
		setTitle("Calculator");
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new calculator();

	}

  @Override
  public void actionPerformed(ActionEvent e){
	  Object E = e.getSource();
	  if (E == B1)
		  LBconcat("1");
	  if (E == B2)
		  LBconcat("2");
	  if (E == B3)
		  LBconcat("3");
		if (E == B4)
			LBconcat("4");
		if (E == B5)
			LBconcat("5");
		if (E == B6)
			LBconcat("6");
		if (E == B7)
			LBconcat("7");
		if (E == B8)
			LBconcat("8");
		if (E == B9)
			LBconcat("9");
		if (E == B0)
			LBconcat("0");
		
		if (E == BPlus) {
			resultRecover();
	  		  OP = 1;
	  		LB2.setText(LB2.getText().concat(" + "));
		}
		if (E == BMinus) {
			resultRecover();
	  		  OP = 2;
	  		LB2.setText(LB2.getText().concat(" - "));
	  		}
		if (E == BMulti) {
			resultRecover();
	  		  OP = 3;	  		  
	  		LB2.setText(LB2.getText().concat(" x "));
	  		}
		if (E == BDivide) {
			resultRecover();
	  		  OP = 4;
	  		LB2.setText(LB2.getText().concat(" / "));
	  		}
		if (E == BEql) {
	  		 Y = (int) Double.parseDouble(LB.getText());
	  		 switch(OP)
	  		 	{
	  		 	 case 1: Result =  X + Y;
	  		 	 LB.setText("= "+Result);
	  		     break;
	  		 	 case 2: Result = X - Y;
	  		 	 LB.setText("= "+Result);
	  		 	 break;
	  		 	 case 3: Result = X * Y;
	  		 	 LB.setText("= "+Result);
	  		 	 break;
	  		 	 case 4: if (Y != 0) {
	  		 		 Result =(float) X / Y;
	  		 		LB.setText("= "+Result);
	  		 	 }
	  		 	 else LB.setText("= Infinite"); 
	  		 	break;
	  		 	 default: Result = (float) 0;
	  		 	LB.setText("= "+Result);
	  		 	}
	  		 flag=1;
	  	   }
		if (E == BClear) {
			LB.setText("");
			LB2.setText("");
			Result = (float) 0;
			X=Y=flag=0;
		}
  }
}
