import javax.swing.JOptionPane;

public class SomaCondicional {
   public static void main (String [] args){
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro inteiro"));
      int soma = a + b;
      JOptionPane.showMessageDialog(null, soma <= 10 ? "Sua soma � " + soma : "Passou de 10");
      
   }
}