/*
        Estudiante: Luis Alejandro Perez Rodriguez
        Matricula: 10141930
 */
package lab04;

/*
6. Celsius Temperature Table

The formula for converting a temperature from Fahrenheit to Celsius is

C=5/9(F-32)

where F is the Fahrenheit temperature and C is the Celsius temperature. Write a method 
named celsius that accepts a Fahrenheit temperature as an argument. The method 
should return the temperature, converted to Celsius. Demonstrate the method by calling 
it in a loop that displays a table of the Fahrenheit temperatures 0 through 20 and their 
Celsius equivalents.

 */
public class Parte5pc6 {
    
    //valores de f
    public void temperaturaF(){
    
    for(int i=0;i<=20;i++){
    celsius(i);
              }

    }
    
    //meotodo para convertir de f a c
    public double celsius(int f){
    double c;
    
    c=(0.56)*(f-32);
    System.out.println("Temperatura en Fahrenheit" + "     Equivalente en celsius"
                         +"\n \t "+f                        +"\t \t \t \t"+String.format("%.3f",c)          );
    return c;
    }
    
    
}
