/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequationroots;

/**
 *
 * @author Charlie Burris
 */
import java.util.Scanner;

public class QuadraticEquationRoots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize a scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b and c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double discriminant = (b * b) - (4 * a * c);
        
        if(discriminant > 0){
            double root1 = -b + Math.pow((b * b)-(4 * a * c), 0.5);
            root1 /= (2 * a * c);
            double root2 = -b - Math.pow((b * b)-(4 * a * c), 0.5);
            root2 /= (2 * a * c);
               System.out.println("Roots are " + root1 + root2);
        }
        else if (discriminant == 0){
            double root1 = -b + Math.pow((b * b)-(4 * a * c), 0.5);
            root1 /= (2 * a * c);
            System.out.println("The root is " + root1 );
        }
        else {
            System.out.println("There are no real roots. ");
        }
    }
    
}
