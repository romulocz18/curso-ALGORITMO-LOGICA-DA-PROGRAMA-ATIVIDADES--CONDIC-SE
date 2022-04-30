package JAVA;
import javax.swing.JOptionPane;
public class PARouIMPAR {
    public static void main(String args[]){

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero para ser indentificado em Par ou Impar"));

        if (numero % 2 == 0)
        JOptionPane.showMessageDialog(null,"null, esse "+numero+  " e Par" );
        else 
        JOptionPane.showMessageDialog(null,"null, esse "+numero+ " e Impar" );

    }
    
}
