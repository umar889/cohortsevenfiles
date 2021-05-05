import java.util.Scanner;
public class TempConvert
{
public static void main (String...args)
{
Scanner input = new Scanner(System.in);

double Celsius;
double Fahrenheit;


System.out.println("Application to convert Celsius to Fahrenheit");
System.out.println("Enter degree in Celsius: ");
Celsius= input.nextDouble();
Fahrenheit = 9.0 / 5 * Celsius + 32;
System.out.print(Celsius+ " "+"Celsius is"+ " " + Fahrenheit + " "+ "Fahrenheit");

}

}


