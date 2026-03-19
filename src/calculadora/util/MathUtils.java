package calculadora.util;

public class MathUtils {
    public static int contarCasasDecimais(double n) {
        String valor = String.valueOf(n);
        return valor.length() - valor.indexOf('.') - 1;
    }
    public static String verdadeiroOuFalso(boolean afirmacao) {
        if (afirmacao == true) return "verdadeiro";
        else return "falso";
    }
}