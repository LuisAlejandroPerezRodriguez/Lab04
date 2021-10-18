/*
 
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930

 */
package lab04;

public class Car {
    
   int  yearModel;
   String make;
   int speed;
   
   //constructor
   Car(int modelo,String marca){
   
     
       yearModel=modelo;
       make=marca;
       speed=0;
   }
   
   
   
   public int getspeed(){

   return speed;
   }
   
   public String getmake(){
       
   return make;
   }
   
    public int getyearModel(){

   return yearModel;
   }
    
    public void setspeed(int velocity)
    {
    speed=velocity;
    }
    
      
    public void setmake(String malca)
    {
    make=malca;
    }
    
     public void setyearModel(int modelo){
         yearModel=modelo;
   }
    
   
   
    //metodo para aumentar en 5 la velocidad
   public void acelerar( ){
     speed+=5;
     //System.out.println(speed+"m/s");
   }
   
      //metodo para disminuir en 5 la velocidad
   public void brake(){
    speed-=5;
     //System.out.println(speed+"m/s");
   
   }
   
    
}
