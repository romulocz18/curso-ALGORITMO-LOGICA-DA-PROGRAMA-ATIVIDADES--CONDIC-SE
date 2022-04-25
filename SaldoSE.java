package JAVA;
import javax.swing.JOptionPane;
class SaldoSE {
    public static void main(String args[]){
        
        float  SaldoIncial, ValorCheque;
        
        SaldoIncial = 500;
        
        ValorCheque = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do cheque: "));

        if  (ValorCheque <= SaldoIncial)
        {
            SaldoIncial = SaldoIncial - ValorCheque;
            JOptionPane.showMessageDialog(null,"O seu nova saldo.: "+SaldoIncial);

        }
       else
       {
            JOptionPane.showMessageDialog(null,"Antenção seu cheque nao foi descontado: ");
           JOptionPane.showMessageDialog(null,"O seu saldo continua..............:"+SaldoIncial);
       }
    }
}
