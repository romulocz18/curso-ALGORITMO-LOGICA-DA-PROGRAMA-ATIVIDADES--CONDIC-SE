// esse algoritmo mostra a media da turma de quantidade de alunos que ficaram acima da media;
/// utilizando variáveis com vetores///
// Usando laços de repetição//

package JAVA;
import javax.swing.JOptionPane; // biblioteca para caixa de texto
public class VetorComLaçosDeRepetição {
    public static void main(String args []){// metodo princiapal;
        float notas [] = new float [5]; // Essa e estrutura em java quanto eu quero usar variável de vetor;
        float CalcMedia, SomaNotas; // variáveis do tipo float
        int contador; // variável do tipo inteiro;
         contador = 0;
         SomaNotas = 0;
    for (int i=0;i<=4;i++) // laço de repetição com as variáveis de vetores;
    {
        notas[i] = Float.parseFloat(JOptionPane.showInputDialog("digite a"   +i+   "notas: ")); // definição das variáveis;
        SomaNotas = SomaNotas + notas[i]; // soma das variáveis;
    }

    CalcMedia = SomaNotas / 5; // soma das medias;
    for (int i=0;i<=4;i++) // laço de repetição;
    if(notas[i]>= CalcMedia) // condição para ficar acima da media;
    contador++;

     JOptionPane.showMessageDialog(null,"a media da turma foi de"  +CalcMedia+
    "\n"+contador+" ficaram acima da media");// saídas;

    }
    
}
