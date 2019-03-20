package simpleinterest;

import java.util.Scanner;

public class Interest 
{
	double s_i;
	double c_i;
	public double SimpleIntCalc(double principle,double time,double rate)
	{
		
		    s_i=(principle*time*rate)/100;
		    return s_i;
	}
	
	public double CompoundIntCalc(double principle,double time,double rate)
	{
		
		   c_i=principle* Math.pow(1.0+rate/100.0,time)-principle;
		   return c_i;
	}
	public static void main(String[] args)
	{
		Interest i=new Interest();
		double principal, rate, time, s_i,c_i;
	    Scanner sc=new Scanner (System.in);
	    System.out.println("Enter the amount :");
	    principal=sc.nextDouble();
	    System. out. println("Enter the No.of years :");
	    time=sc.nextDouble();
	    System. out. println("Enter the Rate of  interest :");
	    rate=sc.nextDouble();
	    sc.close();
	    s_i=ic.SimpleIntCalc(principal,time,rate);
	    c_i=ic.CompoundIntCalc(principal,time,rate);
	    System.out.println("Simple Interest is :"+s_i);
	    System.out.println("Compound Interest is :"+c_i);
	}
}