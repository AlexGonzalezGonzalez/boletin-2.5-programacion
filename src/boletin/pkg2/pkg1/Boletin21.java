
package boletin.pkg2.pkg1;
import java.util.Scanner;
public class Boletin21 {

    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       int m= 1852, millas,metros;
    System.out.println("teclea el numero de millas:");
       millas=sc.nextInt();
       metros =millas*m;         
       System.out.println("metros = "+metros);
    }
    
}
