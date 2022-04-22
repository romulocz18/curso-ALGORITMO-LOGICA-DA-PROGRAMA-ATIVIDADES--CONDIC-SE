package JAVA;
import javax.swing.JOptionPane;
public class ordemCrecente {
       public static void main(String args[]){
        
        int a,b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Inciar o valor de A :"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Incira o valor de B: "));

       if (a > b)
           JOptionPane.showMessageDialog(null,"A ordem crecente B="+b+" - A="+a);
        else
            JOptionPane.showMessageDialog(null,"A ordem crecente A="+a+"- B="+b);
    
       }
}
