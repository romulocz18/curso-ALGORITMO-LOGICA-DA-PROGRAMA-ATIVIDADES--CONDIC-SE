package JAVA;
import javax.swing.JOptionPane;
class MaiorMenor_3 { 
    public static void main(String args[]){ // metodo principal; 
     
     int n1, n2, n3; // váriáveis do tipo inteiro;
     String mensagem="";       
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Didite o valor n1: "));//  definição de n1;
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Didite o valor n2: "));//  definição de n2;
    n3 = Integer.parseInt(JOptionPane.showInputDialog("Didite o valor n3: "));//  definição de n3;

    if ((n1 >= n2) && (n1 >= n3)) // Condições para o maior
    {
    mensagem = mensagem + "O maior numero : "+n1; ////saída caso n1 seja maior;
    if (n2 <= n3)// Condições para o menor
    mensagem = mensagem + "\n O menor numero :"+n2; ////saídas caso n2 seja menor; 
    }
    else if ((n2 >= n1) && (n2 >= n3))// Condiçoes para o maior  
    {
       mensagem = mensagem +"\n O maior numero : "+n2;//saída caso n2 seja maior;
    if (n1 <= n3)
        mensagem = mensagem + "\n O menor numero : "+n1;//saída caso n1 seja menor;
    else
         mensagem = mensagem + "\n O menor numero : "+n3;//saída caso n3 seja menor;
   }
  else
  {
    mensagem = mensagem + "\n O maior numero: "+n3;//saída caso n3 seja maior;  
    if (n2 <= n1)
    mensagem = mensagem + "\n O menor numero: "+n2;//saída caso n2 seja menor;
    else 
     mensagem = mensagem + "\n O menor numero: "+n1;//saída caso n1 seja menor;
  }
 
   JOptionPane.showMessageDialog(null,mensagem);
 }
}
     
    

