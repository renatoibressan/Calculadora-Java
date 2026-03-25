package com.renato.calculadora.service;

public class NumerosService {
    public NumerosService() {
    }
    public int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int mmc(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs((a / mdc(a, b)) * b);
    }
    public boolean primoOuNao(int n) {
        if (n < 0) throw new ArithmeticException("\nNúmero inválido!\n");
        if (n == 0 || n == 1) return false;
        for (int i = 2; (i * i) <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public boolean divisivelOuNao(int a, int b) {
        if (b == 0) throw new ArithmeticException("\nDivisão por zero detectada!\n");
        return a % b == 0;
    }
    public int quantidadeDivisores(int n) {
        if (n == 0) throw new ArithmeticException("\nQuantidade infinita de divisores!\n");
        int count = 0;
        n = Math.abs(n);
        for (int i = 1; (i * i) <= n; i++) {
            if (n % i == 0) count += (i * i == n) ? 1 : 2;
        }
        return count;
    }
    public int[] divisores(int n) {
        if (n == 0) throw new ArithmeticException("\nQuantidade infinita de divisores!\n");
        n = Math.abs(n);
        int[] v = new int[quantidadeDivisores(n)];
        int idx = 0;
        for (int i = 1; (i * i) <= n; i++) {
            if (n % i == 0) {
                v[idx++] = i;
                if (i != n / i) v[idx++] = n / i;
            }
        }
        return v;
    }
}