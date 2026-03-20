package calculadora.service;

public class AvancadoService {
    public AvancadoService() {
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
    public long fatorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Fatorial de negativos detectada!");
        if (n == 0 || n == 1) return 1;
        long f = 1;
        for (int i = n; i >= 1; i--) {
            f *= i;
        }
        return f;
    }
    public double mediaDeDois(int a, int b) {
        return ((double)a + (double)b) / 2;
    }
    public long somatorio(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        long s = 0;
        for (int i = a; i <= b; i++) {
            s += i;
        }
        return s;
    }
    public long produtorio(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        long p = 1;
        for (int i = a; i <= b; i++) {
            p *= i;
        }
        return p;
    }
}