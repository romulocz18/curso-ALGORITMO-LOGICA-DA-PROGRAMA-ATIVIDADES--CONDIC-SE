package JAVA;
import javax.swing.JOptionPane;
public interface MêsSE {
    public static void main(String args []){

     int mes;

     mes = Integer.parseInt(JOptionPane.showInputDialog("Digiti o numero do mes: "));

     if (mes == 1)
     JOptionPane.showMessageDialog(null, " esse em e igual a JANEIRO "+mes);
     else if (mes == 2)
     JOptionPane.showMessageDialog(null, " esse em e igual a FEVEREIRO "+mes);
     else if (mes == 3)
     JOptionPane.showMessageDialog(null, " esse em e igual a MARÇO "+mes);
     else if (mes == 4)
     JOptionPane.showMessageDialog(null, " esse em e igual a ABRIL "+mes);
     else if (mes == 5)
     JOptionPane.showMessageDialog(null, " esse em e igual a MAIO "+mes);
     else if (mes == 6)
     JOptionPane.showMessageDialog(null, " esse em e igual a JUNHO "+mes);
     else if (mes == 7)
     JOptionPane.showMessageDialog(null, " esse em e igual a JULHO "+mes);
     else if (mes == 8)
     JOptionPane.showMessageDialog(null, " esse em e igual a AGOSTO "+mes);
     else if (mes == 9)
     JOptionPane.showMessageDialog(null, " esse em e igual a SETEMBRO "+mes);
     else if (mes == 10)
     JOptionPane.showMessageDialog(null, " esse em e igual a OUTUBRO "+mes);
     else if (mes == 11)
     JOptionPane.showMessageDialog(null, " esse em e igual a NOVEMBRO "+mes);
     else if (mes == 12)
     JOptionPane.showMessageDialog(null, " esse em e igual a DEZEMBRO "+mes);
     else 
     JOptionPane.showMessageDialog(null,"noa corresponde a nem mes do ano");
      




    }
    
}
