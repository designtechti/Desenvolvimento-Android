/*
* Tipos de Dados
     Double    64
     Float     32
     Long      64
     Integer   32
     Short     16
     Byte      8
     Char      2
     String    ?
     Boolean   ?
* */

/**
 * Tipos de dados que são orientados à objetos
 *
 *
 */
public class TiposDeDados {
    public static void main(String[] args) {
        // Aceitam valores decimais
        Double d = 10.2;
        Float f = 100.435093850f;

        // Aceitam apenas valores inteiros
        Long l = 1045549l;
        Integer i = 100;
        Short s = 10;
        Byte b = 19;

        // Tamanho das variáveis
        System.out.println("Double: Max" + Double.MAX_VALUE + " - Double: " + Double.MIN_VALUE);
        System.out.println("Float: Max" + Float.MAX_VALUE + " - Float: " + Float.MIN_VALUE);
        System.out.println("Long: Max" + Long.MAX_VALUE + " - Long: " + Long.MIN_VALUE);
        System.out.println("Integer: Max" + Integer.MAX_VALUE + " - Integer: " + Integer.MIN_VALUE);
        System.out.println("Short: Max" + Short.MAX_VALUE + " - Short: " + Short.MIN_VALUE);
        System.out.println("Byte: Max" + Byte.MAX_VALUE + " - Byte: " + Byte.MIN_VALUE);

        // Variáveis que não se sabe o tamanho
        String texto = "no  noanaonfodondofnofon o no nfon fono fo nfod"; // Pois depende do tamanho
        Boolean bool = false; // Pois depende da JVM

        // Ocupa o espaço de 2 bytes na memória
        Character c = 'c';
    }
}
