package JAVA;
import javax.swing.JOptionPane;
public class CompraDesconto {
    public static void main(String args[]){

    float ValorCompra, ValorDesconto, ValorPago;
    int desconto;
    String nome;

    nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
    ValorCompra = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da compra: "));

    if  (ValorCompra <= 200)
        desconto = 10;
    else if  (ValorCompra >=500)
        desconto = 15;
      else
        desconto = 20;
    
    ValorDesconto = (ValorCompra * desconto)/100;
    ValorPago = ValorCompra - ValorDesconto;

    JOptionPane.showMessageDialog(null,"o nome do cliente: "+nome);
    JOptionPane.showMessageDialog(null,"Valor de Compra: "+ValorCompra);
    JOptionPane.showMessageDialog(null,"Percentual do desconto: "+desconto);
    JOptionPane.showMessageDialog(null,"Valor a ser descontado: "+ValorDesconto);
    JOptionPane.showMessageDialog(null, "Valor a ser Pago: "+ValorPago);



    } 
}
