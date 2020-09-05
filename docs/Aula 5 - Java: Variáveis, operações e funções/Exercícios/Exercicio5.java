public class Exercicio5 {

    /* 5. Crie uma função que receba 3
     * números com casas decimais e
     * execute o seguinte cálculo:
     * ((x + y) * x) / z
     * Faça o retorno com casas decimais.
     */

    private double calculadoraDecimal(double x, double y, double z){
        return (((x + y) * x) / z);
    }

    public static void main(String[] args) {
        Exercicio5 e = new Exercicio5();
        System.out.println(e.calculadoraDecimal(32.4, 54.9, 60.0));
    }
}
