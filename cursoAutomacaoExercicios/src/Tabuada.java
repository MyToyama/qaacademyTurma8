import javax.swing.JOptionPane;

public class Tabuada {

    /**
     * @param args
     */
    public static void main(String[] args){
        final int num= Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        int tabuada;
        int i=1;

        while(i<=num)
            {tabuada=num*i;
            i++;
            System.out.println(tabuada);
            }


    }

    }
