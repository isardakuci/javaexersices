import java.util.Arrays;
import java.util.Scanner;


public class app {

   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter a,b,c:");
     double a = in.nextDouble();
     double b = in.nextDouble();
     double c = in.nextDouble();
     double discriminant = Math.pow(Math.pow(b,2)-(4*a*c), 0.5);
     System.out.print("The equation has");
     if (discriminant > 0)
     {
         double root1 = (-b+Math.pow(discriminant, 0.5))/(2*a);
         double root2 = (-b-Math.pow(discriminant, 0.5))/(2*a);
         
     }
   }



   }

