/*
 
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930

 */
package lab04;

public class Circle {
    
   double radius;
   double pi= 3.14159;
   
   
   Circle(double radio){
   radius=radio;
   }
   
    Circle(){
    radius=0;
    }
    
   public void setRadius(double ra){
   radius=ra;
   } 
   
   public double getRadius(){
   return radius;
   }
   
   public double getArea(double area){
   
       area=pi*radius*radius;
       return area;
   }
    
   public double getDiameter(double diametro){
    diametro=radius*2;
    return diametro;
   }
   
   public double getCircumference(double circunferencia){
   circunferencia=2*pi*radius;
   return circunferencia;
   }
}
