/*
 Jose Dario Zuniga Gamboa
U Fide
5-oct-21
 */
package s3.pkg2;
//Libreria import
import javax.swing.JOptionPane;

public class S32 {

   
    public static void main(String[] args) 
    {
       //Declarar
        int nota;
        //Entrada
        nota=Integer.parseInt(JOptionPane.showInputDialog("Cual es su nota?"));
        
        if ( nota >= 70){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
     
    }
    
}
