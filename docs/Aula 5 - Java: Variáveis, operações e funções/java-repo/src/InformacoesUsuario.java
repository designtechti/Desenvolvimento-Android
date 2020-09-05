import java.util.Scanner;

public class InformacoesUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Cria um campo para digitar nome
        System.out.print("Informe seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.println("Seu nome é: " + nome + "\n");

        // Cria um campo 9 digitar a idade
        System.out.print("Digite a sua idade: ");
        Integer idade = scanner.nextInt();
        System.out.println("Você tem " + idade + " anos \n");

        // Métodos de acordo com os tipos de dados
        /*Double doubleValor = scanner.nextDouble();
        Float floatValor = scanner.nextFloat();
        Long longValor = scanner.nextLong();
        Short shortValor = scanner.nextShort();
        Byte byteValor = scanner.nextByte();
        Boolean boolValor = scanner.nextBoolean();
        Integer intValor = scanner.nextInt();
        */

    }
}
