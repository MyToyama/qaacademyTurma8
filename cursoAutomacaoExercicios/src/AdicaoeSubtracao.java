public class AdicaoeSubtracao {
    
    /**
     * 
     */
    public static void soma()
    {
    
        int num1=5, num2=2;
        System.out.println(num1+num2);

    }


    public int subtracao()
    {   int sub1 = 20;
        int sub2 = 23;
        int resultado1 = sub2-sub1;
        return resultado1;

    }

    public static void main(String[]args) {
    soma();
    AdicaoeSubtracao somaResultado1 = new AdicaoeSubtracao();
    System.out.println(somaResultado1.subtracao());
        
     
    }
}

