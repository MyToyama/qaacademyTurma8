import javax.swing.JOptionPane;

public class lerNumeros {
    public static void main(String[] args){
       
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
        
        System.out.println("Número 1 : "+num1);
        System.out.println("Número 2 : "+num2);
        System.out.println("Número 3 : "+num3);
        
    }
}
