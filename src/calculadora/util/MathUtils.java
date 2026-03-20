package calculadora.util;

public class MathUtils {
    public static int contarCasasDecimais(double n) {
        String valor = String.valueOf(n);
        return valor.length() - valor.indexOf('.') - 1;
    }
    public static boolean inteiroOuNao(double n) {
        return Math.abs(n - Math.round(n)) < 1e-9;
    }
    public static String verdadeiroOuFalso(boolean afirmacao) {
        return afirmacao ? "verdadeiro" : "falso";
    }
}