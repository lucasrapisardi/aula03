import javax.swing.JOptionPane;

public class NumCrescente
{
   public static void main (String [] args)
   {
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
      int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
 
         if ((a<=b) && (a<=c)){
            if (b<=c){
               JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: " + a + ", " + b + ", " + c);
            }
               else{
               JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: " + a + ", " + c + ", " + b);
               }
         }
                  else if((b<=a) && (b<=c)){
                     if (a<=c){
                      JOptionPane.showMessageDialog(null, "Os número em ordem crescente são: " + b + ", " + a + ", " + c);
                     }
                     
               else {
                  JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: " + b + ", " + c + ", " + a);
               }
                  }
                  
                  else if ((c<=a) && (c<=b))
                  {
                  if (c<=a){
                  JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: " + c + ", " + b + ", " + a);}
                     }
                     else {JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: " + c + ", " + a + ", " + b);}
   }
}
