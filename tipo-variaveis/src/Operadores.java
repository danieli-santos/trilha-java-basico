import org.xml.sax.ext.EntityResolver2;

public class Operadores {
    // public static void main(String[] args) {
    //     String nomeCompleto = "LINGUAGEM" + " JAVA";
    //     System.out.println(nomeCompleto);
    // }

    // public static void main(String[] args){

    //     String concatenacao ="?"; 

    //         concatenacao = 1+1+1+"1";
    //         System.out.println(concatenacao);

    //         concatenacao = 1+"1"+1+1;
    //         System.out.println(concatenacao);

    //         concatenacao = 1+"1"+1+"1";
    //         System.out.println(concatenacao);

    //         concatenacao = "1"+1+1+1;
    //         System.out.println(concatenacao);

    //         concatenacao = "1"+(1+1+1);
    //         System.out.println(concatenacao);

    // }

    // public static void main(String[] args) {
    //     int numero = 5;
        
    //     numero = - numero ;
    //     System.out.println(numero); 

    //     numero = numero * -1;

    //     System.out.println(numero);
        
    // }


    // public static void main(String[] args) {
    //     int numero = 5;
    //     //x repeticao
    //     // numero = numero + 2;
    //     //  System.out.println(numero);

    //     //  numero++;
    //      System.out.println( -- numero);

    //      System.out.println(numero);   
    // }


  //  public static void main(String[] args) {
 //       int a, b;
        
  //      a = 5;
 //       b = 6;

        // String resultado = "";
        // if(a==b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";

        //     System.out.println(resultado);

  //      String resultado = a==b ? "verdadeiro" : "falso"; // precisa ser um op boleana
  //       System.out.println(resultado);

   // }

       // public static void main(String[] args) {
            //String nomeUm = "Danieli";
            //String nomeDois = "Danieli";

           // String nomeUm = "Danieli";
           // String nomeDois = new String("Danieli");// caso quando é dois objetos em memoria, nesse caso devemos usar o equals

          //  System.out.println(nomeUm == nomeDois);





           // int numero1 = 1;
           // int numero2 = 2;
            
           // boolean simNao = numero1 == numero2;

           // if (numero1 == numero2){
           //     System.out.println("a nossa condiçao é verdadeira");
           // }

           // System.out.println("numeroUm é igual a numeroDois? " + simNao);

          //  simNao = numero1 != numero2;

           // System.out.println("numeroUm é diferente de numeroDois? " + simNao);

           // simNao = numero1 > numero2;

           // System.out.println("numeroUm é maior que numeroDois? " + simNao);
   // }

   public static void main(String[] args) {
    boolean condicao1 = true;

    boolean condicao2 = false;

    if(condicao1 && (7 > 4)){
        System.out.println("as duas condiçôes sâo verdadeiras");
    }

    if (condicao1 || condicao2) {
        System.out.println("um da condiçôes sâo verdadeiras");
        
    }
    System.out.println("fim");

   }
}
