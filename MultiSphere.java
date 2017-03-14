
/**
 * constructor for objects of class  MultiSphere here.
 * 
 * @Darius Little
 * @10/23/2015
 */
import java.lang.Math;
import java.util.Scanner;
public class MultiSphere
{
   public static void main(String[] args){
    Sphere a=new Sphere();
    System.out.println(a.toString());
    System.out.println();   
       
    Scanner scan= new Scanner(System.in);
    System.out.println("A new Sphere ");
    
    System.out.println("Please give me a radius");
    double b;
    b=scan.nextInt();
    
     
    
    
    
    Sphere x=new Sphere(b);
    System.out.println(x.Diameter(b));
    double volume= (4.0/3.0)*Math.PI*Math.pow(b,3);
    System.out.println("Volume= "+volume);
    
    
    double  surfaceArea=4.0*Math.PI*Math.pow(b,2);
     System.out.println(" Surface Area = "+surfaceArea) ;
    
   } 
}
