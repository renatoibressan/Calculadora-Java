package com.renato.calculadora.util;

public class MathUtils {
    public static int contarCasasDecimais(double n) {
        String valor = String.valueOf(n);
        return valor.length() - valor.indexOf('.') - 1;
    }
    public static boolean inteiroOuNao(double n) {
        return Math.abs(n - Math.round(n)) < 1e-9;
    }
    public static boolean zeroOuNao(double x) {
        return Math.abs(x) < 1e-10;
    }
    public static String verdadeiroOuFalso(boolean afirmacao) {
        return afirmacao ? "é verdadeiro" : "é falso";
    }
    public static String primoOuNao(boolean afirmacao) {
        return afirmacao ? "é primo" : "não é primo";
    }
}