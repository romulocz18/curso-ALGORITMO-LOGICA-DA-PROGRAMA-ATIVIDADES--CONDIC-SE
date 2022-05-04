package JAVA;
import javax.swing.JOptionPane;
public class TabuadaWHILE{
     public static void main(String args []){
        
        int numero, i;
        String mensagem = "";
         numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
          i = 1;
        while ( i <= 9)
        {
           mensagem = mensagem + "\n" +numero + " x  "+i+"  = "+(numero * i);
           i++;
           
           System.out.println(mensagem);
            
        }

     
    

     }
    
}
