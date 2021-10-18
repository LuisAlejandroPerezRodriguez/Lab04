/*
        Estudiante: Luis Alejandro Perez Rodriguez
        Matricula:10141930
 */
package lab04;

/*
 1. showChar Method
Write a method named showChar. The method should accept two arguments: a reference to 
a String object and an integer. The integer argument is a character position within the 
String, with the first character being at position 0. When the method executes, it should 
display the character at that character position. Here is an example of a call to the method:

showChar("New York", 2);

In this call, the method will display the character w because it is in position 2. Demonstrate 
the method in a complete program


 */
public class Parte5pc1 {
    
    //Metodo para introducir mis valores
    public void valores(){
        String name = "New York";
        int pos=2;
        showChar(name,pos);
    }
    
    
    //metodo para buscar el caracter especificado
    public char showChar(String cadena,int posicion){
        char resultado;
        resultado=cadena.charAt(posicion);
        System.out.println(resultado);
        return resultado;
    }
    
    
    
    
    
    
}
