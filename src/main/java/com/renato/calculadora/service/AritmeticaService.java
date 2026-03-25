package com.renato.calculadora.service;

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
        if (b == 0) throw new ArithmeticException("\nDivisão por zero detectada!\n");
        return (double) a / (double) b;
    }
    public int resto(int a, int b) {
        if (b == 0) throw new ArithmeticException("\nDivisão por zero detectada!\n");
        return a % b;
    }
    public double potenciacao(int a, int b) {
        if (a == 0 && b <= 0) throw new ArithmeticException("\nResultado indefinido!\n");
        double p = 1.0;
        int i;
        if (b == 0) return 1;
        else if (b > 0) {
            for (i = 0; i < b; i++) {
                p *= a;
            }
        } else {
            for (i = 0; i > b; i--) {
                p /= a;
            }
        }
        return p;
    }
    public double raizQuadrada(double m) {
        if (m < 0) throw new ArithmeticException("\nRaiz quadrada de negativo detectada!\n");
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
}