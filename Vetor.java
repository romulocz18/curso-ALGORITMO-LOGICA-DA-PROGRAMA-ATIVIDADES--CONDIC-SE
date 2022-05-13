// O algoritmo mostra quantos alunos firam acima da media;
// utilizandos o vetor da varivel notas;



package JAVA;
import javax.swing.JOptionPane; // biblioteca para caixa de texto;
public class Vetor{
    public static void main(String args []){//medoto principal;
        
        float notas [] = new float [5]; // veriável na qual eu vou usar o vetor[] do tipo Real;
        float SomaNotas, CalcMedia;// para saber a media da turma; 
        int contador;// para ser feita a condição;
        
        contador = 0;
        // As variáveis que possui vetores devem são iniviadas aparte do 0 em JAVA; 
        notas[0] = Float.parseFloat(JOptionPane.showInputDialog("Digidi a nota 1: ")); // definição da nota 1
        notas[1] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: ")); // definiação da nota 2
        notas[2] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 3: ")); // definição da nota 3
        notas[3] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 4: "));// denfinição da nota 4
        notas[4] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 5: ")); // definição da nota 5

        SomaNotas = notas[0] + notas[1] + notas[2] + notas[3] + notas[4]; // soma das notas;
        CalcMedia = SomaNotas / 5; // media dos Alunos;

            if (notas[0] > CalcMedia) // condição;
            contador++;
            if (notas[1] > CalcMedia) //// condição;
            contador++;
            if (notas[2] > CalcMedia)// condição;
            contador++;
            if (notas[3] > CalcMedia)// condição;
            contador++;
            if (notas[4] > CalcMedia)// condição;
            contador++;

            JOptionPane.showMessageDialog(null,"a media da turma foi de"  +CalcMedia+
                                           "\n"+contador+" ficaram acima da media");// saídas;
    }
}