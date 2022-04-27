// O algoritmo mostras as testa as condições necessaria para ser um triangulo, um vez que os lados respeita a propriedades 
// O sistema também mostra se é um triangulo equilatero, isosceles, escaleno;

package JAVA;
import javax.swing.JOptionPane; //biblioteca 
public class LadosTriangulos {
    public static void main(String args[]){ // medoto principal;
      
      float l1, l2, l3;

      l1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado l1"));// definiação do valor de l1
      l2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado l2"));// definiação do valor de l2
      l3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado l3"));// definiação do valor de l3

    if ((l1 < (l2 + l3)) && (l2 < (l3 + l1)) && (l3 < (l1 + l2))) // condição necessaria para um triangulo;
   
     if ((l1 == l2) && (l2 == l3)) 
      JOptionPane.showMessageDialog(null, "triangulo equilatero"); // saída;
     else if ((l1 == l2) || (l1 == l3) || (l2 == l3))
      JOptionPane.showMessageDialog(null, "triangulo isoscels");// saída;
     else
      JOptionPane.showMessageDialog(null, "triangulo escaleno");// saída;
    
    else
      JOptionPane.showMessageDialog(null, "Não e um triangulo");// saída;
 } 
    
}
