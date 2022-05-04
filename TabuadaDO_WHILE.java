// Algoritmo mostra a tabuada de qualquer numeeo interior utilizando os laços de repetição DO WHILE;


package JAVA;
import javax.swing.JOptionPane; // biblioteca para caixa texto;
public class TabuadaDO_WHILE {
    public static void main(String args []){ // metodo principal;

        int numero,i;
        String mensagem = "";

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o nomero: ")); // definição do numeor para mostra a tabuada;
        i = 1;
        do{
            mensagem = mensagem + "\n "+numero + " x "+i+" = " +(numero * i);
            i++;

        }
        while (i <= 9); // condição para a repetição;
        System.out.println(mensagem);// mostra no terminal 
        JOptionPane.showMessageDialog(null, mensagem);// mostra na caixa de texto

    }
    
}
