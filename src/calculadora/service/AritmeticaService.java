package calculadora.service;

public class AritmeticaService {
    public AritmeticaService() {
    }
    public int adicao(int a, int b) {
        return a + b;
    }
    public int subtracao(int a, int b) {
        return a - b;
    }
    public int multiplicacao(int a, int b) {
        return a * b;
    }
    public double divisao(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divisao por zero detectada!");
        return (double) a / (double) b;
    }
    public int resto(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divisao por zero detectada!");
        return a % b;
    }
}