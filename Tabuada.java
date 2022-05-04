// algoritmo mostra a tabuda de um  numero;

package JAVA; 
import javax.swing.JOptionPane; //biblioteca 
public class Tabuada {
    static public void main(String args[]){// metedo princiapl;
     
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deve ser a tabuada"));

        JOptionPane.showMessageDialog(null, numero + " x 1 =" +( numero * 1)+ //saída
                                                           numero + " x 2 =" +( numero * 2)+// saída
                                                           numero + " x 3 =" +( numero * 3)+// saída 
                                                           numero + " x 4 =" +( numero * 4)+// saída 
                                                           numero + " x 5 =" +( numero * 5)+// saída 
                                                           numero + " x 6 =" +( numero * 6)+// saída 
                                                           numero + " x 7 =" +( numero * 7)+// saída 
                                                           numero + " x 8 =" +( numero * 8)+// saída 
                                                           numero + " x 9 =" +( numero * 9)+ // saída 
                                                           numero + " x 10 =" +( numero * 10)); //saída
                                                           
    
    }
}