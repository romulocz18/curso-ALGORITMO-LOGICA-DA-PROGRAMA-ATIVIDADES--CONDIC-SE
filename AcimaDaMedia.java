package JAVA;
import javax.swing.JOptionPane;
public class AcimaDaMedia {
    public static void main(String args []){
    float n1,n2,n3,n4,n5,somaNota,calcMedia;
    int contador = 0;
     n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
     n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
     n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 3"));
     n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 4"));
     n5 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 5"));
    
     somaNota = n1+n2+n3+n4+n5;
     calcMedia = somaNota / 5;
     
    if(n1 > calcMedia)
       contador = contador + 1;
    if(n2 > calcMedia)
       contador = contador + 1;
    if(n3 > calcMedia)
       contador = contador + 1;
    if(n4 > calcMedia)
       contador = contador + 1;
    if(n5> calcMedia)
       contador = contador + 1; 
       
   
   JOptionPane.showMessageDialog(null,"A media da turma é"  +calcMedia+ "\n"
+contador+ "alunos ficaram com nota acima da media");
   
  }
}
