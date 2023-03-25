import javax.swing.JOptionPane;

public class valoresTrocados {
   
        /**
         * @param args
         * @throws Exception
         */
        public static void main(String[] args){
       
            int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
            int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
            int valor3;
            valor3=valor1;
            valor1=valor2;
            valor2=valor3;
            System.out.println("Valor 1 igual "+valor1);
            System.out.println("Valor 2 igual " +valor2);

            
        }
    }
    

