package calculadora.service;

public class ComparacaoService {
    public ComparacaoService() {
    }
    public boolean igualA(int a, int b) {
        if (a == b) return true;
        else return false;
    }
    public boolean diferenteDe(int a, int b) {
        if (a != b) return true;
        else return false;
    }
    public boolean maiorQue(int a, int b) {
        if (a > b) return true;
        else return false;
    }
    public boolean menorQue(int a, int b) {
        if (a < b) return true;
        else return false;
    }
    public boolean maiorOuIgualA(int a, int b) {
        if (a >= b) return true;
        else return false;
    }
    public boolean menorOuIgualA(int a, int b) {
        if (a <= b) return true;
        else return false;
    }
}