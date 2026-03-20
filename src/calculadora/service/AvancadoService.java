package calculadora.service;

public class AvancadoService {
    public AvancadoService() {
    }
    public double raizQuadrada(double m) {
        if (m < 0) throw new ArithmeticException("Raiz quadrada de negativo detectada!");
        if (m == 0 || m == 1) return m;
        double x = m;
        double y = 1.0;
        double precisao = 0.0000000001;
        double diff;
        do {
            x = (x + y) / 2;
            y = m / x;
            diff = (x > y) ? x - y : y - x;
        } while (diff > precisao);
        return x;
    }
    public int modulo(int n) {
        return (n < 0) ? -n : n;
    }
    public long fatorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Fatorial de negativo detectada!");
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
        long s = 0;
        for (int i = a; i <= b; i++) {
            s += i;
        }
        return s;
    }
    public long produtorio(int a, int b) {
        long p = 1;
        for (int i = a; i <= b; i++) {
            p *= i;
        }
        return p;
    }
}