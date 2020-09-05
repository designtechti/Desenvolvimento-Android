public class Excecoes {
    public static void main(String[] args) {

        // Funcionalidade que mostra os erros e mesmo assim roda o sistema
        try {
            String str = "Curso de Java";
            str.charAt(200);

            // Ou o erro mais conhecido do Java
            String s = null;
            System.out.println(s.length());

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Erro: índice de string fora do intervalo");
        } catch (NullPointerException e) {
            System.out.println("Erro: String Nula sem nenhum valor!");
        } catch (Exception e) {
            System.out.println("Erro: índice de string fora do intervalo");
        } finally {
            System.out.println("Executei!");
        }

        System.out.println("Teste");
    }
}
