public class Funcoes {

    // Void não retorna valor
    private void helloWorld(){
       System.out.println("Olá, Mundo!");
    }

    // Int retorna um valor
    private long soma(long a, long b){

         return a+b;
    }

    public static void main(String[] args){
        Funcoes funcoes = new Funcoes();
        funcoes.helloWorld();

        System.out.println(funcoes.soma(5, 4));
    }
}
