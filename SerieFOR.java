package JAVA;
import javax.swing.JOptionPane;
public class SerieFOR {
    public static void main(String args []){

    int i;
     String mensagem = "";
     for(i=10;i<=1000;i=i+10)
     mensagem = mensagem + i + " - ";  
     System.out.println(mensagem);
     JOptionPane.showMessageDialog(null,mensagem);
    }
    
}
