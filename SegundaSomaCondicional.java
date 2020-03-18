import javax.swing.JOptionPane;

public class SegundaSomaCondicional{
   public static void main (String [] args){
      //declaração de variáveis
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
      int soma = a + b;
      
      JOptionPane.showMessageDialog(null, soma <=20 ? "O total é de " + (soma - 5): "O valor excede 20");
   }
}