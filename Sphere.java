
/**
 * Write a description of class Sphere here.
 * 
 * @Darius Little 
 * @10/21/2015
 */
import java.util.Scanner;
import java.lang.Math;
public class Sphere
{
    private double diameter;
   
    public Sphere(){
        setDiameter(5);
        
    }
    public  Sphere(double newDiameter){
        setDiameter(newDiameter);
       
       
    }
    
    public void setDiameter(double diameter){
        this.diameter =diameter;   
    }
   
     public double getDiameter(){
        return diameter;
    }
    
   
    public  double Diameter (double radius){
        
        diameter=radius/2;
        System.out.println("Sphere  Diameter =") ;
        return diameter;
    }
     
   
      public String toString(){
    return   "\nDiameter: " + diameter; 
}
}
