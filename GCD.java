import java.util.Scanner;
//Java program that computes the greatest common divisor (gcd) of two integers.
public class GCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("*********                  *********");
        System.out.println("*********  GCD Calculator  *********");
        System.out.println("*********                  *********");
        System.out.println("************************************");
        System.out.println("                                    ");


        //Variables
        int num1, num2;
        
        //Input Numbers
        System.out.print("\nPlease enter the first number:");
        num1 = (int)scanner.nextInt();
        
        System.out.print("\nPlease enter the second number:");
        num2 = (int)scanner.nextInt();
        
        while (num1 != num2) 

        {

        	if(num1 > num2)
                num1 = num1 - num2;

            else
                num2 = num2 - num1;
        }

        //Output results
        System.out.printf("\nThe GCD of the given numbers is: %d", num2);
    }

}