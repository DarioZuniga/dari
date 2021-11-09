/*Jose Dario Zuniga Gamboa
U Fide
5-oct-21
*/
package s3.pkg4;
import javax.swing.JOptionPane;

public class S34 {

    
    public static void main(String[] args) 
    {
     int n;
     int n2;
     int n3;
     int n4;
     n=Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero"));
     n2=Integer.parseInt(JOptionPane.showInputDialog("Denuevo"));
     n3=Integer.parseInt(JOptionPane.showInputDialog("otra vez?"));
     n4=Integer.parseInt(JOptionPane.showInputDialog("uno mas"));
    if(n>=n2){
        if(n>=n3){
            if(n>=n4){
                System.out.println("El numero mayor es: "+n);
               
            } 
        } 
    }
    else if(n2>=n3){
        if(n2>=n){
            if(n2>=n4){
                System.out.println("El numero mayor es: "+n2);
            }}}
    else if(n3>=n2){
        if(n3>=n){
            if(n3>=n4){
                System.out.println("El numero mayor es: "+n3);
            }}}
    else if(n4>=n2){
        if(n4>=n){
            if(n4>=n3){
                System.out.println("El numero mayor es: "+n4);
            }}}
    }}