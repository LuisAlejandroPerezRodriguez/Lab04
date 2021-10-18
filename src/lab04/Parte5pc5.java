/*
        Estudiante: Luis Alejandro Perez Rodriguez
        Matricula:10141930
 */
package lab04;

/*
5. Falling Distance
When an object is falling because of gravity, the following formula can be used to determine 
the distance the object falls in a specific time period:

d 5 ½ gt2

The variables in the formula are as follows: d is the distance in meters, g is 9.8, and t is the 
amount of time, in seconds, that the object has been falling.

Write a method named fallingDistance that accepts an object’s falling time (in seconds) as 
an argument. The method should return the distance, in meters, that the object has fallen 
during that time interval. Demonstrate the method by calling it in a loop that passes the 
values 1 through 10 as arguments, and displays the return value
 */
public class Parte5pc5 {
    
    //metodo para ingresar los segundos
    public void valores(){
   
     for(int i=1;i<=10;i++){   
    FallDistance(i);}
    
    }
    
    //metodo para calcular la distancia
    public double FallDistance(int time){
    
    double distancia;
    distancia= (5*0.5)*(9.8*time*2);
    System.out.println("La distancia que estuvo callendo el objeto en el intervalo de: "+time+" segundos"+ " es de: "+distancia+" metros");
    
    return distancia ;
    }
    
    
    
    
}
