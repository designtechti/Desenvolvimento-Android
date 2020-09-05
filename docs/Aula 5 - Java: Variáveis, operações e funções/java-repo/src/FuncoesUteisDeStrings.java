// Para ver a documentação de cada função basta digitar Ctrl + B

public class FuncoesUteisDeStrings {
    public static void main(String[] args) {
        String str = "Curso de Java";

        // Mostra o 3º caractere (de índice 2)
        System.out.println(str.charAt(2));

        /*
         * Função que compara se o valor das variáveis
         * são iguais, retornando TRUE ou FALSE
         */

        System.out.println(str.equals("lskdfjlsdfkj"));

        /*
         * Função que analisa se o valor da variável
         * começa com o caractere específicado (prefixo),
         * retornando TRUE ou FALSE
         */
        System.out.println(str.startsWith("Curso"));

        /*
         * Função que analisa se o valor da variável
         * termina com o caractere específicado (sufixo),
         * retornando TRUE ou FALSE
         */
        System.out.println(str.endsWith("Java"));

        /*
         * Função que pega a parte de uma string
         * entre os índices especificados nos
         * parâmetros
         */
        System.out.println(str.substring(8)); // Inicia a contagem a partir do 8º índice até o fim
        System.out.println(str.substring(3,5)); // Faz a contagem entre o 3º e o 5º índice (sem contar o 5º)

        // Função que substitui valores de uma String
        System.out.println(str.replace("Curso", "Cursinho"));

        // Funções que mudam a string para letras maiúsculas e minúsculas
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // Função que retira os espaços de uma string
        System.out.println(str.trim());

        // Função que retorna o número de caracteres de uma string
        System.out.println(str.length());
    }
}
