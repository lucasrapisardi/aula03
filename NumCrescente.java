import javax.swing.JOptionPane;

public class NumCrescente
{
   public static void main (String [] args)
   {
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
      int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero"));
 
         if ((a<=b) && (a<=c)){
            if (b<=c){
               JOptionPane.showMessageDialog(null, "Os n�meros em ordem crescente s�o: " + a + ", " + b + ", " + c);
            }
               else{
               JOptionPane.showMessageDialog(null, "Os n�meros em ordem crescente s�o: " + a + ", " + c + ", " + b);
               }
         }
                  else if((b<=a) && (b<=c)){
                     if (a<=c){
                      JOptionPane.showMessageDialog(null, "Os n�mero em ordem crescente s�o: " + b + ", " + a + ", " + c);
                     }
                     
               else {
                  JOptionPane.showMessageDialog(null, "Os n�meros em ordem crescente s�o: " + b + ", " + c + ", " + a);
               }
                  }
                  
                  else if ((c<=a) && (c<=b))
                  {
                  if (c<=a){
                  JOptionPane.showMessageDialog(null, "Os n�meros em ordem crescente s�o: " + c + ", " + b + ", " + a);}
                     }
                     else {JOptionPane.showMessageDialog(null, "Os n�meros em ordem crescente s�o: " + c + ", " + a + ", " + b);}
   }
}
