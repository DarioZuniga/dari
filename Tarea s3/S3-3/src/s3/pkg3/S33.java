/*
Jose Dario Zuniga Gamboa
U Fide
5-oct-21
 */
package s3.pkg3;

import javax.swing.JOptionPane;
public class S33 {

    public static void main(String[] args)
    {
        //declarar
       int dia;
       //enter
        
       dia=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero de dia:"));
       
      switch(dia){
      case 1:
        System.err.println("Domingo");
        System.err.println("Dia Libre");
        break;
         case 2:
        System.err.println("Lunes");
        System.err.println("Dia de trabajo");
        break;
         case 3:
        System.err.println("Martes");
         System.err.println("Dia de trabajo");
        break;
         case 4:
        System.err.println("Miercoles");
         System.err.println("Dia de trabajo");
        break;
         case 5:
        System.err.println("Jueves ");
         System.err.println("Dia de trabajo");
        break;
         case 6:
        System.err.println("vierne");
        System.err.println("Dia de trabajo");
        break;
         default:
        
      System.err.println("Sabado");
      System.err.println("Dia Libre");
        
        break;
    }
    
}
}