package JAVA;
import javax.swing.JOptionPane;
public class MediaFOR {
    public static void main(String args []){
         
        float nota, CalcMedia=0, SomaMedia=0;
        int i;
        
        for (i=1;i<=10;i++)
        {
        nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a :"+i+ " . nota 10 notas. Somente de 0 a 10"));
        
        if ((nota >= 0) && (nota <= 10))
        SomaMedia = SomaMedia + nota;
         
        else
        {
             JOptionPane.showMessageDialog(null,"Essa nota não é valida");
             i=i-1;
        }

     CalcMedia = SomaMedia / 10;
    }
    JOptionPane.showMessageDialog(null,"A media geral das notas: "+CalcMedia);
}
    
}
