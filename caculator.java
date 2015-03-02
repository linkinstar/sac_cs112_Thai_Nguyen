//Build a calculator by unconditionally add/ substract/multiply/divide 2 numbers
import java.util.Scanner;
public class main
{
public static void main( String[] args)
{
Scanner input= new Scanner( System.in);
long number1;
long number2;
long sum;
long sub;
long multiply;
long divide;
long remainder;
System.out.println("Enter first number: ");
number1= input.nextInt();//input first number
System.out.println("Enter Second number(must not be zero): ");
number2= input.nextInt();//input second number
sum = number1 + number2;
sub = number1 - number2;
multiply = number1 * number2 ;
divide = number1 / number2 ;
remainder = number1 % number2 ;
System.out.println("Sum is %d\n", sum);
System.out.println("Subtract is %d\n", sub);
System.out.println("Multiply is %d\n", multiply);
System.out.println("Divide is %d.%d\n",divide,remainder);
}
}//end class
