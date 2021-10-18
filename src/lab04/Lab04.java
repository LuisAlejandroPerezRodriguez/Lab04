/*

 */
package lab04;
import java.util.Scanner;

public class Lab04 {

    public static void main(String[] args) {
        
        Scanner key3=new Scanner(System.in);
       int resultado; 
        char desicion='y';
       for(;desicion!='n';){ 
       do{
        System.out.println(" Introduzca #1. para ver proramming Challenges 1 de la parte 1"
                + "\n Introduzca #2. para ver proramming Challenges 5 de la parte 1 "+ "\n Introduzca #3. para ver proramming Challenges 6 de la parte 1"
                +"\n Introduzca #4. para ver proramming Challenges 2 de la parte 2 "+ "\n Introduzca #5. para ver proramming Challenges 4 de la parte 2"
                +"\n Introduzca #6. para ver proramming Challenges 7 de la parte 2" + "\n Introduzca #7. para ver proramming Challenges 9 de la parte 2"
                +"\n Introduzca #0. para salir del programa");
        
        resultado=key3.nextInt();
       } while( resultado!=0 && resultado>8);
       
       
        
       if(resultado!=0 ){
       switch (resultado){ 
           
        case 1:
        Parte5pc1 a1=new Parte5pc1();
        //parte 1 PCH 1
        a1.valores();
        break;
        
        case 2:
        //parte 1 PCH5
        Parte5pc5 a2=new Parte5pc5();
        a2.valores();
        break;
        
        case 3:
        //parte 1 PCH6
        Parte5pc6 a3=new Parte5pc6();
        a3.temperaturaF();
        break;
        
        case 4:
            
        //Parte 2 ejercicio 2
        Car c1=new Car(2022,"Porshe");
        //acelerando
        c1.acelerar();
        System.out.print(c1.getspeed());
        System.out.println(" m/s");
        
        c1.acelerar();
        System.out.print(c1.getspeed());
        System.out.println(" m/s");
        
        c1.acelerar();
        System.out.print(c1.getspeed());
        System.out.println(" m/s");
        
        c1.acelerar();
        System.out.print(c1.getspeed());
        System.out.println(" m/s");
        
        c1.acelerar();
        System.out.print(c1.getspeed());
        System.out.println(" m/s");
        
        //frenando
        c1.brake();
        System.out.print(c1.getspeed());
        System.out.println(" m/s");
        
        c1.brake();
        System.out.print(c1.getspeed());
        System.out.println(" m/s");
        
        c1.brake();
        System.out.print(c1.getspeed());
        System.out.println(" m/s");
        
        c1.brake();
        System.out.print(c1.getspeed());
        System.out.println(" m/s");
        
        c1.brake();
        System.out.print(c1.getspeed());
        System.out.println(" m/s");
        break;
        
        case 5:
            // parte 2 ejercicio 4
            RetailItem obj1=new RetailItem("Jacket",12,59.95);
            RetailItem obj2=new RetailItem("Designer Jeans",40,34.95);
            RetailItem obj3=new RetailItem("Shirt",20,24.95);
            System.out.println("Description"+" \tUnits on Hand"+ "\t price"+
                      "\n ------------------------------------------");
             System.out.println(obj1.getdescription()+"\t \t"+obj1.getunitsOnHand()+"\t \t"+obj1.getprice());
             System.out.println(obj2.getdescription()+"\t"+obj2.getunitsOnHand()+"\t \t"+obj2.getprice());
             System.out.println(obj3.getdescription()+"\t \t"+obj3.getunitsOnHand()+"\t \t"+obj3.getprice());
             break;
             
        case 6:             
             //Parte 2 ejercicio 7
             Scanner key=new Scanner(System.in);
             double area;
             Circle cir=new Circle();
             System.out.println("introduzca el radio que va tener el circulo");
             area=key.nextDouble();
             cir.setRadius(area);
             System.out.println("El area del circulo es: " + cir.getArea(area));
             System.out.println("El diametro del circulo es: " + cir.getDiameter(area));
             System.out.println("La circunferencia del circulo es: " + cir.getCircumference(area));
             break;
             
        case 7:
             //parte 2 ejercicio 9
             Scanner key2=new Scanner(System.in);
             int mes;
             int year;
             System.out.println("Introduzca el numero del mes (1-12): ");
             mes=key2.nextInt();
             System.out.println("Introduzca el año ");
             year=key2.nextInt();
             Daysinamonth d1=new Daysinamonth(mes,year);
             d1.getNumberOfDays();
             break;
             
          
       }
    
       }
       
         System.out.println("Desea continuar? (Escribir y para continuar o n para salir del programa)");
        desicion=key3.next().charAt(0);
        }
    
}
}