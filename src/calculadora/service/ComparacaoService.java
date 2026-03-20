package calculadora.service;

public class ComparacaoService {
    public ComparacaoService() {
    }
    public boolean igualA(int a, int b) {
        return a == b;
    }
    public boolean diferenteDe(int a, int b) {
        return a != b;
    }
    public boolean maiorQue(int a, int b) {
        return a > b;
    }
    public boolean menorQue(int a, int b) {
        return a < b;
    }
    public boolean maiorOuIgualA(int a, int b) {
        return a >= b;
    }
    public boolean menorOuIgualA(int a, int b) {
        return a <= b;
    }
}