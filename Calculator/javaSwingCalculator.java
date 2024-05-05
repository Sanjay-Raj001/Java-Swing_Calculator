
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class javaSwingCalculator implements ActionListener{
	
	JFrame jf;
	JLabel displayLabel,valdes;
	JButton sevenBtn,clearBtn;
	JButton eightBtn,nineBtn,sixBtn,fiveBtn,fourBtn,threeBtn,twoBtn,oneBtn,zeroBtn;
	JButton dotBtn,plusBtn,minusBtn,mulBtn,divisionBtn,equalBtn,backBtn,modulBtn;	
	String operation;
	String btnType="";
	ArrayList<Float> number =new ArrayList<>();
	float num1,num2,ans;
	String oldoperator="";
	int count=0;
	
	
	javaSwingCalculator(){
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(360, 460);
		jf.setLocation(250, 78);
		jf.getContentPane().setBackground(Color.black);
	
		
			
		
		valdes=new JLabel();
		valdes.setBounds(5, 50, 335, 30);
		valdes.setBackground(Color.darkGray);
		valdes.setOpaque(true);
		valdes.setHorizontalAlignment(SwingConstants.RIGHT);
		valdes.setForeground(Color.white);
		jf.add(valdes);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(5, 80, 335, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setBackground(Color.darkGray);
		jf.add(displayLabel);
		
		
		clearBtn=new JButton("C");
		clearBtn.setBounds(5, 145, 80, 50);
		clearBtn.setBackground(Color.LIGHT_GRAY);
		clearBtn.addActionListener(this);
		jf.add(clearBtn);
		
		backBtn=new JButton("Back");
		backBtn.setBounds(90, 145, 80, 50);
		backBtn.setBackground(Color.LIGHT_GRAY);
		backBtn.addActionListener(this);
		jf.add(backBtn);
		
		modulBtn=new JButton("%");
		modulBtn.setBounds(175, 145, 80, 50);
		modulBtn.setBackground(Color.LIGHT_GRAY);
		modulBtn.addActionListener(this);
		jf.add(modulBtn);
		
		
		
		sevenBtn=new JButton("7");
		sevenBtn.setBounds(5, 200, 80, 50);
		sevenBtn.setBackground(Color.LIGHT_GRAY);
		sevenBtn.addActionListener(this);
		jf.add(sevenBtn);
		
		
	    eightBtn=new JButton("8");
		eightBtn.setBounds(90, 200, 80, 50);
		eightBtn.setBackground(Color.LIGHT_GRAY);
		eightBtn.addActionListener(this);
		jf.add(eightBtn);
		
	    nineBtn=new JButton("9");
		nineBtn.setBounds(175, 200, 80, 50);
		nineBtn.setBackground(Color.LIGHT_GRAY);
		nineBtn.addActionListener(this);
		jf.add(nineBtn);
		
		 fourBtn=new JButton("4");
		fourBtn.setBounds(5, 255, 80, 50);
		fourBtn.setBackground(Color.LIGHT_GRAY);
		fourBtn.addActionListener(this);
		jf.add(fourBtn);

		 fiveBtn=new JButton("5");
		fiveBtn.setBounds(90, 255, 80, 50);
		fiveBtn.setBackground(Color.LIGHT_GRAY);
		fiveBtn.addActionListener(this);
		jf.add(fiveBtn);

		 sixBtn=new JButton("6");
		sixBtn.setBounds(175, 255, 80, 50);
		sixBtn.setBackground(Color.LIGHT_GRAY);
		sixBtn.addActionListener(this);
		jf.add(sixBtn);
		
		 oneBtn=new JButton("1");
		oneBtn.setBounds(5, 310, 80, 50);
		oneBtn.setBackground(Color.LIGHT_GRAY);
		oneBtn.addActionListener(this);
		jf.add(oneBtn);
		
		 twoBtn=new JButton("2");
		twoBtn.setBounds(90, 310, 80, 50);
		twoBtn.setBackground(Color.LIGHT_GRAY);
		twoBtn.addActionListener(this);
		jf.add(twoBtn);
		
		 threeBtn=new JButton("3");
		threeBtn.setBounds(175, 310, 80, 50);
		threeBtn.setBackground(Color.LIGHT_GRAY);
		threeBtn.addActionListener(this);
		jf.add(threeBtn);
		
		 dotBtn=new JButton(".");
		dotBtn.setBounds(5, 365, 80, 50);
		dotBtn.setBackground(Color.LIGHT_GRAY);
		dotBtn.addActionListener(this);
		jf.add(dotBtn);
		
		 zeroBtn=new JButton("0");
		zeroBtn.setBounds(90, 365, 80, 50);
		zeroBtn.setBackground(Color.LIGHT_GRAY);
		zeroBtn.addActionListener(this);
		jf.add(zeroBtn);
		
		 equalBtn=new JButton("=");
		equalBtn.setBounds(175, 365, 165, 50);
		equalBtn.setBackground(Color.LIGHT_GRAY);
		equalBtn.addActionListener(this);
		jf.add(equalBtn);
		
		 divisionBtn=new JButton("/");
		divisionBtn.setBounds(260, 145, 80, 50);
		divisionBtn.setBackground(Color.LIGHT_GRAY);
		divisionBtn.addActionListener(this);
		jf.add(divisionBtn);
		
		 mulBtn=new JButton("*");
		mulBtn.setBounds(260, 200, 80, 50);
		mulBtn.setBackground(Color.LIGHT_GRAY);
		mulBtn.addActionListener(this);
		jf.add(mulBtn);
		
		
		 minusBtn=new JButton("-");
		minusBtn.setBounds(260, 255, 80, 50);
		minusBtn.setBackground(Color.LIGHT_GRAY);
		minusBtn.addActionListener(this);
		jf.add(minusBtn);
		
		 plusBtn=new JButton("+");
		plusBtn.setBounds(260, 310, 80, 50);
		plusBtn.setBackground(Color.LIGHT_GRAY);
		plusBtn.addActionListener(this);
		jf.add(plusBtn);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	 void btnNumberClicked(java.awt.event.ActionEvent evt) {
		
		if(btnType.equals("opr")){
			displayLabel.setText("");;
		}
		
		String num = ((JButton)evt.getSource()).getText();
		String oldnum=displayLabel.getText();
		
		System.out.println("oldnum"+oldnum+"num"+num);
		displayLabel.setText(oldnum +  num);
		
		btnType="num";
		count=0;
	}
	 
	 
	 
	
	void btnOperatorClicked(java.awt.event.ActionEvent evt) {
		btnType="opr";
		count++;
		String opr = ((JButton)evt.getSource()).getText();
		if(count==1) {
			
		
		String str = valdes.getText()+displayLabel.getText()+opr;
		valdes.setText(str);
		
		number.add(Float.valueOf(displayLabel.getText()));
		if(number.size()==2) {
			num1=number.get(0);
			num2=number.get(1);
			
			
			number.clear();
			if(oldoperator.equals("+")) {
				ans=num1+num2;
				
			}else if(oldoperator.equals("-")) {
				ans=num1-num2;
				
			}else if(oldoperator.equals("*")) {
				ans=num1*num2;
				
			}else if(oldoperator.equals("/")) {
				ans=num1/num2;
				
			}
			else if(oldoperator.equals("%")) {
				ans=num1%num2;
				
			}
			number.add(ans);
			
			displayLabel.setText(ans +"");
		}
		
	
		
		oldoperator = opr;
		
	//	System.out.println(number);
		if(opr.equals("=")){
			valdes.setText("");
		}
		}
		else {
			String str=valdes.getText();
			
			String str1=str.substring(0,str.length()-1);
			valdes.setText(str1+opr);
			
			oldoperator=opr;
			}
	}
	
	
	
	public static void main(String[] args) {
		
		new javaSwingCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenBtn) {

			btnNumberClicked(e);
			
		}else if(e.getSource()==eightBtn){

			btnNumberClicked(e);
			
		}else if(e.getSource()==nineBtn){

			btnNumberClicked(e);
			
		}else if(e.getSource()==fourBtn){

			
			btnNumberClicked(e);
		}else if(e.getSource()==fiveBtn){

			btnNumberClicked(e);
			
		}else if(e.getSource()==sixBtn){

			btnNumberClicked(e);
			
			
		}else if(e.getSource()==oneBtn){

			btnNumberClicked(e);
			
			
		}else if(e.getSource()==twoBtn){

			
			btnNumberClicked(e);
			
		}else if(e.getSource()==threeBtn){

			btnNumberClicked(e);
			
		}else if(e.getSource()==zeroBtn) {
			btnNumberClicked(e);
		
			
		}else if(e.getSource()==dotBtn){
			btnNumberClicked(e);

		}else if(e.getSource()==divisionBtn){
			btnOperatorClicked(e);

			btnType="opr";
			
		}else if(e.getSource()==mulBtn){
			btnOperatorClicked(e);

			btnType="opr";
			
		}else if(e.getSource()==minusBtn){
			btnOperatorClicked(e);

			btnType="opr";
			
		}else if(e.getSource()==plusBtn){
			btnType="opr";
			btnOperatorClicked(e);

		}else if(e.getSource()==modulBtn){
			btnType="opr";
			btnOperatorClicked(e);

			

		}else if(e.getSource()==clearBtn){
			number.clear();
			displayLabel.setText("");
			valdes.setText("");

		
		}else if(e.getSource()==equalBtn){
			
			btnOperatorClicked(e);
			
			
		}else if(e.getSource()==backBtn){
			String strg=displayLabel.getText();
			String strg1= strg.substring(0,strg.length()-1);
			displayLabel.setText(strg1);	
			

		}
	}


}

