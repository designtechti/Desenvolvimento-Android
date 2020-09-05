public class Operadores {
    public static void main(String[] args) {

        Integer numero = 10;

        System.out.println(numero + 950);
        System.out.println(numero - 89);
        System.out.println(numero * 2);
        System.out.println(numero / 3);
        System.out.println(numero % 4);

        // Forma simplificada de definir as operações
        System.out.println(numero += 950); // Ao invés de numero = numero + 950
        System.out.println(numero -= 950); // Ao invés de numero = numero - 950
        System.out.println(numero *= 950); // Ao invés de numero = numero * 950
        System.out.println(numero /= 950); // Ao invés de numero = numero / 950
        System.out.println(numero %= 950); // Ao invés de numero = numero % 950
    }
}
