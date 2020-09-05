public class ManipulandoStrings {
    public static void main(String[] args) {
        String nome = "Java";

        // Obtém os índices dos caracteres da string
        System.out.println("Primeiro caractere da palavra " + nome + ": " + nome.charAt(0));
        System.out.println("Segundo caractere da palavra " + nome + ": " + nome.charAt(1));
        System.out.println("Terceiro caractere da palavra " + nome + ": " + nome.charAt(2));
        System.out.println("Quarto caractere da palavra " + nome + ": " + nome.charAt(3));

        // Concatenando valores numéricos com strings
        Double d = 109283.9;
        String strDouble = String.valueOf(d);
        System.out.println(strDouble);

        System.out.println(String.valueOf(109f));

        Integer número = 23;
        System.out.println("Número: " + número);
    }
}
