public class Exercicio3 {

    /* 3. Modifique o retorno da função
     * helloWorld para que retorne uma
     * String com o seguinte formato:
     * "A palavra possui X caracteres."
     * X - Deve ser a quantidade de caracteres da palavra passada por parâmetro.
     */

    private String helloWorld(String str){
        return "A palavra tem " + str.length() + " caracteres";
    }

    public static void main(String[] args) {
        Exercicio3 c = new Exercicio3();
        System.out.println(c.helloWorld("Olá, mundo!"));
    }
}