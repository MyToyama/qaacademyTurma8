public class metodoscomvalores {
    
    
    
    

    /**
     * @param frase1
     * @return
     */
    public static String frases(String frase1, String frase2){

        String resultado = "primeiro" + "segundo";
        return resultado;
    }

    public static boolean somaValores(int num1,int num2){

        
        int soma = num1+num2;
        if(soma>100)
        return true;
        else 
            return false;

        }


    /**
     * 
     */
    public static void main()
    {   String frase1 = "Bora";
        String frase2 = "pra balada";
        System.out.println(frases(frase1, frase2));
        System.out.println(somaValores(num1,num2));
    }

   


}
