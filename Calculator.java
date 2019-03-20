package calculator;
import java.util.Scanner;

public class Calculator
{
    public float calculator_func(char choice) throws ArithmeticException 
    {
    	 float result = 0;
        float n1,n2;
       
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextFloat();
        n2 = scan.nextFloat();
        switch(choice)
            {
                case '1' : 
                    
                    result = n1 + n2;
                    break;
                case '2' : 
                  
                	result = n1 - n2;
                    break;
                case '3' :
                   
                	result = n1 * n2;
                    break;
                case '4' :
                   
                    if(n2==0) {
                    		    scan.close();
                    			throw new ArithmeticException("Divide by zero ");
                    		 }
                    else {
                    	result = n1 / n2;
                    	 }
                    break;
                case '5' : System.exit(1);
                default : System.out.print("Wrong input");
                		  break;
                		  
            }     
        return result;
    }
    public static void main(String[] args)
	{
		Calculator test=new Calculator();
		Scanner scan = new Scanner(System.in);
		char choice;
		float res;
        do {   
        	
        	System.out.print("1.Addition\n");
            System.out.print("2.Subtraction\n");
            System.out.print("3.Multiplication\n");
            System.out.print("4.Division\n");
            System.out.print("5.Exit\n\n");
            System.out.print("Enter Your Choice and then the operands with spaces spaces: \n");
            choice = scan.next().charAt(0);
            res=test.calculator_func(choice);
            System.out.println("The answer is :"+res+"\n");
        }
		while(choice!=5);
		scan.close();
		return;
	}
}