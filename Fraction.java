import javax.swing.JOptionPane;
public class Fraction {
	int deno;
	int num;
	Fraction()
	{
		num=1;
		deno=1;
	}
	Fraction(int n,int d)
	{
		num=n;
		deno=d;
		
	}
	void getFraction()
	{ 
		String numerator=JOptionPane.showInputDialog("Enter Numerator: ");	
		String denominator=JOptionPane.showInputDialog("Enter Denominator: ");
		num=Integer.parseInt(numerator);
		deno=Integer.parseInt(denominator);
		
	}
	void reduceFraction(int num,int deno)
	{
		int HCF=1;
	    for(int i = 1; i <= num && i <= deno; ++i) 
	    {   
	        if(num % i == 0 && deno % i == 0) 
	            HCF= i; 
	    } 
	    deno=deno/HCF;
	    num=num/HCF; 
	    System.out.println("Fraction:  " +num +"/" +deno);
	}
	void displayFraction()
	{
		System.out.println("Fraction:  " +num +"/" +deno);
	}
	Fraction addFraction(Fraction F1)
	{
		int n1,d1;
		n1=((num*F1.deno)+(deno*F1.num));
		d1=(deno*F1.deno);
		System.out.print("Add");
		F1.reduceFraction(n1, d1);
		return F1;
	}
	Fraction subFraction(Fraction F1)
	{
		int n1,d1;
		n1=((num*F1.deno)-(deno*F1.num));
		d1=(deno*F1.deno);
		System.out.print("Sub");
		F1.reduceFraction(n1, d1);
		return F1;
	}
	Fraction mulFraction(Fraction F1)
	{
		int n1,d1;
		n1=(num*F1.num);
		d1=(deno*F1.deno);
		System.out.print("Mul");
		F1.reduceFraction(n1, d1);
		return F1;
	}
	Fraction divFraction(Fraction F1)
	{
		int n1,d1;
		n1=(F1.deno*num);
		d1=(F1.num*deno);
		System.out.print("Div");
		F1.reduceFraction(n1, d1);
		return F1;
	}
}
