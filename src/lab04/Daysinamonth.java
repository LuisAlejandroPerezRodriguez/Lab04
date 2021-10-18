/*
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930

 */
package lab04;


public class Daysinamonth {
    
    int month;
    int year;
    
   Daysinamonth(int mes, int ayear) {
    month=mes; 
    year=ayear;
   }

   public void getNumberOfDays( ){
       String nombre;
       int dias;
   switch(month){
       
         case 1: 
         nombre="enero";
         dias=31;
         System.out.println(nombre+" tiene "+dias+" dias");
         break;
         
         case 2:
             if((year %400==0)||(year %4==0)&&(year%100!=0)){
             nombre="febrero";
             dias=29;
              System.out.println(nombre+" tiene "+dias+" dias");
             } else {
             nombre="febrero";
             dias=28;
              System.out.println(nombre+" tiene "+dias+" dias");
             } break;
             
         case 3: 
         nombre="marzo";
         dias=31;
         System.out.println(nombre+" tiene "+dias+" dias");
         break;
         
         
         case 4: 
         nombre="abril";
         dias=30;
         System.out.println(nombre+" tiene "+dias+" dias");
         break;
         
         case 5: 
         nombre="mayo";
         dias=31;
         System.out.println(nombre+" tiene "+dias+" dias");
         break;
         
         case 6: 
         nombre="junio";
         dias=30;
         System.out.println(nombre+" tiene "+dias+" dias");
         break;
         
         case 7: 
         nombre="julio";
         dias=31;
         System.out.println(nombre+" tiene "+dias+" dias");
         break;
         
         case 8: 
         nombre="agosto";
         dias=31;
         System.out.println(nombre+" tiene "+dias+" dias");
         break;
         
         case 9: 
         nombre="septiembre";
         dias=30;
         System.out.println(nombre+"tiene"+dias+" dias");
         break;
         
         case 10: 
         nombre="octubre";
         dias=31;
         System.out.println(nombre+" tiene "+dias);
         break;
         
         case 11: 
         nombre="noviembre";
         dias=30;
         System.out.println(nombre+" tiene "+dias+ " dias");
         break;
         
         case 12: 
         nombre="diciembre";
         dias=31;
         System.out.println(nombre+" tiene "+dias+" dias");
         break;
         
         default: System.out.println("Introduzca el numero del mes del 1 al 12");
   }
   
   }
    
    
}
