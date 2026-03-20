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
    public double potenciacao(int a, int b) {
        double p = 1.0;
        int i;
        if (b == 0) {
            if (a == 0) throw new ArithmeticException("Divisao por zero detectada!");
            return 1;
        } else if (b > 0) {
            for (i = 0; i < b; i++) {
                p *= a;
            }
        } else {
            if (a == 0) throw new ArithmeticException("Divisao por zero detectada!");
            for (i = 0; i > b; i--) {
                p /= a;
            }
        }
        return p;
    }
}