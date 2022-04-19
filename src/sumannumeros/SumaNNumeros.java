package sumannumeros;

import javax.swing.JOptionPane;


public class SumaNNumeros {
  /*
  Obtener la suma de los primeros N numeros naturales positivos
  */
  
  public static void main(String[] args) 
  {
    //Declaracion de variables
    int i,N, s = 0;
    
    //Input
    N = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite N: "));
    
    //Procesing 
    i = 1;
    while(i <= N)
    {
      s = s + i;
      i++;
     
    }
    
    //Output
    JOptionPane.showMessageDialog(null," La suma de los " + N + " Primeros numeros naturales positivos es " + s );
    
    //end
    System.exit(0);
  }
  
}
