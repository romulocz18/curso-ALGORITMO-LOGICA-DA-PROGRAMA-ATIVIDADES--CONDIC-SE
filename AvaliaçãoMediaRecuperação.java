package JAVA;
import javax.swing.JOptionPane; 
public class AvaliaçãoMediaRecuperação {
    public static void main(String args[]){
        float prova1, prova2, prova3, media;
        prova1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da Prova 1: "));
        prova2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da Prova 2: "));
        prova3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da Prova 3  "));

        prova1 = prova1 * 2 /10;
        prova2 = prova2 * 3 /10;
        prova3 = prova3 * 5 /10;
         
        media = prova1 + prova2 + prova3;
        if (media >= 6)
            JOptionPane.showMessageDialog(null,"O aluno foi aprovado com media: "+media);
        else if (media >= 4)
             JOptionPane.showInputDialog(null,"O aluno esta de recuperaçõa com a media: "+media);
        else                  
             JOptionPane.showInputDialog(null,"O aluno esta reprovado com a media "+media);
    }
}
