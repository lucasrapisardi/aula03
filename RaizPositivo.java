import javax.swing.JOptionPane;
import static java.lang.Math.sqrt;

public class RaizPositivo {
   public static void main (String [] args){
      //declara��o de vari�veis
      double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero positivo, ou negativo"));
      double raiz = Math.sqrt(numero1);
      double quadrado = Math.pow(numero1, 2);
      
      JOptionPane.showMessageDialog(null, numero1 >= 0 ? "A ra�z do n�mero " + numero1 + ", � " + raiz : "O quadrado do n�mero � " + quadrado);
   }
}