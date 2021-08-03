/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

/**
 *
 * @author Dell
 */import java.util.Scanner;
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
System.out.print("Enter a decmal value (0 to 15) ");
int decimal=input.nextInt();

if (decimal > 15 || decimal < 0)
    System.out.println("Invalid input");
else if (decimal < 10)
    System.out.println("The hex value is " + decimal);
else
    System.out.println("The hex value is " + (char)('A' + decimal - 10));
        // TODO code application logic here
    }
}
