
 
package tarea3.pkg1;
//importar libreria
import javax.swing.JOptionPane;



public class Tarea31 {

    
    public static void main(String[] args) 
    {
      //Declarar
        int edad;
        
      //Entrada
        edad=Integer.parseInt(JOptionPane.showInputDialog("Digite un entero"));
        
        if (edad>= 18){
            System.err.println("Puede Votar");
        } else{
            System.out.print("No puede votar");
        }
        

        
        
    }
    
}
