package calculadora.service;
import calculadora.util.MathUtils;

public class TrigonometricaService {
    public TrigonometricaService() {
    }
    public double valorRadianos(double x) {
        return x * (Math.PI / 180);
    }
    public double seno(double x) {
        return Math.sin(x);
    }
    public double cosseno(double x) {
        return Math.cos(x);
    }
    public double tangente(double x) {
        double cos = Math.cos(x);
        if (MathUtils.zeroOuNao(cos)) throw new ArithmeticException("Tangente indefinida!");
        return Math.tan(x);
    }
    public double arcoSeno(double razao) {
        if (razao < -1 || razao > 1) throw new ArithmeticException("Valor fora do dominio!");
        return Math.asin(razao);
    }
    public double arcoCosseno(double razao) {
        if (razao < -1 || razao > 1) throw new ArithmeticException("Valor fora do dominio!");
        return Math.acos(razao);
    }
    public double arcoTangente(double razao) {
        if (razao < -1 || razao > 1) throw new ArithmeticException("Valor fora do dominio!");
        return Math.atan(razao);
    }
    public double secante(double x) {
        double cos = Math.cos(x);
        if (MathUtils.zeroOuNao(cos)) throw new ArithmeticException("Secante indefinida!");
        return 1 / cos;
    }
    public double cossecante(double x) {
        double sin = Math.sin(x);
        if (MathUtils.zeroOuNao(sin)) throw new ArithmeticException("Cossecante indefinida!");
        return 1 / sin;
    }
    public double cotangente(double x) {
        double tan = Math.tan(x);
        if (MathUtils.zeroOuNao(tan)) throw new ArithmeticException("Cotangente indefinida!");
        return 1 / tan;
    }
}