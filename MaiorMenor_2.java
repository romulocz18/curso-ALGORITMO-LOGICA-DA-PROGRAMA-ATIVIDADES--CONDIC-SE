package JAVA;
import javax.swing.JOptionPane;
public class MaiorMenor_2 {
    public static void main(String args[]){
     
     int n1, n2, n3;
            
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Didite o valor n1: "));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Didite o valor n2: "));
    n3 = Integer.parseInt(JOptionPane.showInputDialog("Didite o valor n3: "));

    if ((n1 >= n2) && (n1 >= n3))
    {
    JOptionPane.showMessageDialog(null,"O maior numero : "+n1);
    if (n2 <= n3)
    JOptionPane.showMessageDialog(null,"O menor numero :"+n2);
    }
    else if ((n2 >= n1) && (n2 >= n3))
    {
       JOptionPane.showMessageDialog(null, "O maior numero : "+n2);
    if (n1 <= n3)
        JOptionPane.showMessageDialog(null,"O menor numero : "+n1);
    else
         JOptionPane.showMessageDialog(null,"O menor numero : "+n3);  
   }
  else
  {
    JOptionPane.showMessageDialog(null,"O maior numero: "+n3);
    if (n2 <= n1)
    JOptionPane.showMessageDialog(null, "O menor numero: "+n2);
    else 
     JOptionPane.showMessageDialog(null,"O menor numero: "+n1);
  }

 }
}