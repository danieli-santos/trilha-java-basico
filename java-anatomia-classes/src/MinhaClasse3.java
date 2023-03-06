public class MinhaClasse3 {
    public static void main(String[] args) {
        String primeiroNome = "Danieli ";
        String segundoNome = "Santos";

        String nomeCompleto =  nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado metodo " + primeiroNome.concat("").concat(segundoNome);
        
    }
    //Declarar uma variável em Java segue sempre a seguinte estrutura:

    // Estrutura

// Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)

// // Exemplo

// int idade = 23;
// double altura = 1.62;
// Dog spike; //observe que aqui a variável spike não tem valor, é normal




//Declarar métodos em Java segue uma estrutura bem simples:

// Estrutura

// TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

// //Exemplo

// int somar (int numeroUm, int numero2)

// String formatarCep (long cep)
    
}
