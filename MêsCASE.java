// Esse algoritmo mostra  como descobrimos o meses do ano refente ao numero;
//Para fazer esse algoritmo usamos a  funcionalidade do CASE;


package JAVA;
import javax.swing.JOptionPane;
public class MêsCASE {
    public static void main(String args []){
        int mes;
    
    mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do mês")); 

    switch(mes)
    {
      case 1:JOptionPane.showMessageDialog(null,"O mes = Janeiro ");break;
      case 2:JOptionPane.showMessageDialog(null,"O mes = Fevereiro");break;
      case 3:JOptionPane.showMessageDialog(null,"O mes = Março");break;
      case 4:JOptionPane.showMessageDialog(null,"O mes = Abril");break;
      case 5:JOptionPane.showMessageDialog(null,"O mes = Maio");break;
      case 6:JOptionPane.showMessageDialog(null,"O mes = junho");break;
      case 7:JOptionPane.showMessageDialog(null,"O mes = julho");break;
      case 8:JOptionPane.showMessageDialog(null,"O mes = Agosto");break;
      case 9:JOptionPane.showMessageDialog(null,"O mes = Setembro");break;
      case 10:JOptionPane.showMessageDialog(null,"O mes = Outubro");break;
      case 11:JOptionPane.showMessageDialog(null,"O mes = Novembro");break;
      case 12:JOptionPane.showMessageDialog(null,"O mes = Dezembro");break;
      default:JOptionPane.showMessageDialog(null,"Esse numero não corresponde ao meses");
    }

    }  
}
