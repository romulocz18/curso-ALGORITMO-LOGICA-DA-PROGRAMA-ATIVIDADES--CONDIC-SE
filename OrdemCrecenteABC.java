package JAVA;
import javax.swing.JOptionPane;
public class OrdemCrecenteABC {
    public static void main(String args[]){
        int a, b,c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A : "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B : "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor C : "));

        if ((a <= b) && (a <= c )) // teste para saber A  e maior que os outros valores;
     if ((b <= c))
     JOptionPane.showMessageDialog(null,"A ordem crecente:"+a+ "," +b+ ","+c); // oredem crecente conforme as condições;
     else 
     JOptionPane.showMessageDialog(null,"A ordem crecente:"+a+ "," +c+ "," +b);// oredem crecente conforme as condições;
    else if (( b <= a) && (b <= c))// teste para saber B  e maior que os outros valores;
    if (a <= c)
    JOptionPane.showMessageDialog(null,"A ordem crecente: "+b+ ","+a+ ","+c);// oredem crecente conforme as condições;
    else
    JOptionPane.showMessageDialog(null,"A ordem crecente: "+b+ "," +c+ ","+a); // oredem crecente conforme as condições;
    else if (a <= b)// teste para saber C  e maior que os outros valores;
    JOptionPane.showMessageDialog(null,"A ordem crecente: "+c+ ","+a+ ","+b);// oredem crecente conforme as condições;
    else 
    JOptionPane.showMessageDialog(null,"A ordem crecente: "+c+ "," +b+ ","+a);


    }
}
