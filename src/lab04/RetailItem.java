/*
    Estudiante: Luis Alejandro Perez Rodriguez
    Matricula: 10141930
 */
package lab04;

public class RetailItem {
    
    String description;
    int unitsOnHand;
    double price;
    
    RetailItem(String des, int cantidad, double precio){
    
    description=des;
    unitsOnHand=cantidad;
    price=precio;
    
    }
    
    public void setdescription(String articulo){
    
    description=articulo;
    
    }
    
    public void setunitsOnHand(int cuanto){
        
    unitsOnHand=cuanto;
    
    }
    
    public void setprice(double cuanto){
    
      price=cuanto;  
    
    }
    
    public String getdescription(){
    return description; 
    }
    
   public int getunitsOnHand(){ 
       return unitsOnHand;
   }
   
     public double getprice(){ 
         return price;
     }
    
}
