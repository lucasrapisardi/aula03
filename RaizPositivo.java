import javax.swing.JOptionPane;
import static java.lang.Math.sqrt;

public class RaizPositivo {
   public static void main (String [] args){
      //declaração de variáveis
      double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número positivo, ou negativo"));
      double raiz = Math.sqrt(numero1);
      double quadrado = Math.pow(numero1, 2);
      
      JOptionPane.showMessageDialog(null, numero1 >= 0 ? "A raíz do número " + numero1 + ", é " + raiz : "O quadrado do número é " + quadrado);
   }
}