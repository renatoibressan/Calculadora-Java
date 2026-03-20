package calculadora.service;

public class SequenciasService {
    public SequenciasService() {
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
    public long termoFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Termo invalido detectado!");
        if (n == 0 || n == 1) return n;
        long anterior  = 1, atual = 1, proximo;
        for (int i = 2; i <= n; i++) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
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
    public double termoPA(double a1, double razao, int n) {
        if (n < 2) throw new IllegalArgumentException("Posicao de termo invalida detectada!");
        return a1 + (n - 1) * razao;
    }
    public double somaPA(double a1, double razao, int n) {
        if (n < 2) throw new IllegalArgumentException("Posicao de termo invalida detectada!");
        return ((a1 + termoPA(a1, razao, n)) * n) / 2;
    }
    public double termoPG(double a1, double razao, int n) {
        if (n < 2) throw new IllegalArgumentException("Posicao de termo invalida detectada!");
        return a1 * Math.pow(razao, n - 1);
    }
    public double somaPG(double a1, double razao, int n) {
        if (n < 2) throw new IllegalArgumentException("Posicao de termo invalida detectada!");
        if (razao == 1) throw new IllegalArgumentException("Razao invalida detectada!");
        return (a1 * (Math.pow(razao, n) - 1)) / (razao - 1);
    }
}