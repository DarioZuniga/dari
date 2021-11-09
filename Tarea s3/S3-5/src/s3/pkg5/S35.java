/*Jose Dario Zuniga Gamboa
U Fide
5-oct-21
*/
package s3.pkg5;
//importar libreria
import javax.swing.JOptionPane;
public class S35 {

    
    public static void main(String[] args) 
    {
     //declarar
      int anos; 
      double horaslps;
      double precioht;
      double bruto;
      double bono;
      double deduccion10;
      double deducion15;
      double neto;
      neto = 
      
     //enter
     anos=Integer.parseInt(JOptionPane.showInputDialog("Cantos anos lleva trabajado?"));
     horaslps=Integer.parseInt(JOptionPane.showInputDialog("Horas laborales?"));
     precioht=Integer.parseInt(JOptionPane.showInputDialog("A cuanto la hora?"));
     //operaciones
     bruto = horaslps * precioht;
        System.out.println("Su Salario bruto es de: "+bruto);
     if(anos>=10){
        bono=bruto * 0.20;  
        bruto=bruto + bono;
            if(bruto>=1000){
            deduccion10=bruto*0.10;
            neto=bruto-deduccion10;
                if(bruto>=2000){
                deducion15=bruto*0.15;
                neto=bruto-deducion15;

                
            }
                   
         
       
           
        }
     
     }
    
      System.out.println("Su salario neto es de "+neto);
       
     
     
     
              
      
    }
    
}
