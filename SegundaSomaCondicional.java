import javax.swing.JOptionPane;

public class SegundaSomaCondicional{
   public static void main (String [] args){
      //declara��o de vari�veis
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero inteiro"));
      int soma = a + b;
      
      JOptionPane.showMessageDialog(null, soma <=20 ? "O total � de " + (soma - 5): "O valor excede 20");
   }
}