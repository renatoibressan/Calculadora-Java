package calculadora.service;
import java.util.Arrays;

public class EstatisticaService {
    public EstatisticaService() {
    }
    public double media(double dados[]) {
        int n = dados.length;
        if (dados == null || n == 0) throw new IllegalArgumentException("\nArray de dados invalido!\n");
        double soma = 0.0;
        for (double d : dados) {
            soma += d;
        }
        return soma / n;
    }
    public double moda(double dados[]) {
        Arrays.sort(dados);
        int n = dados.length, freqMax = 0;
        double moda = dados[0];
        if (dados == null || n == 0) throw new IllegalArgumentException("\nArray de dados invalido!\n");
        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (dados[j] == dados[i]) freq++;
            }
            if (freq > freqMax) {
                freqMax = freq;
                moda = dados[i];
            }
        }
        return moda;
    }
    public double mediana(double dados[]) {
        Arrays.sort(dados);
        int n = dados.length;
        if (dados == null || n == 0) throw new IllegalArgumentException("\nArray de dados invalido!\n");
        return (n % 2 == 0) ? (dados[(n / 2) - 1] + dados[n / 2]) / 2.0 : dados[n / 2];
    }
    public double variancia(double dados[]) {
        double soma = 0.0;
        double somaQuadrados = 0.0;
        int n = dados.length;
        if (dados == null || n <= 1) throw new IllegalArgumentException("\nArray de dados invalido!\n");
        for (double d : dados) {
            soma += d;
            somaQuadrados += d * d;
        }
        double media = soma / n;
        double mediaQuadrada = media * media;
        return (somaQuadrados - (n * mediaQuadrada)) / n - 1;
    }
    public double desvioPadrao(double dados[]) {
        if (dados == null) throw new IllegalArgumentException("\nArray de dados invalido!\n");
        return Math.sqrt(variancia(dados));
    }
    public double maiorDado(double dados[]) {
        double maior = -Double.MIN_VALUE;
        int n = dados.length;
        if (dados == null || n == 0) throw new IllegalArgumentException("\nArray de dados invalido!\n");
        for (int i = 0; i < n; i++) {
            if (dados[i] > maior) maior = dados[i];
        }
        return maior;
    }
    public double menorDado(double dados[]) {
        double menor = Double.MAX_VALUE;
        int n = dados.length;
        if (dados == null || n <= 0) throw new IllegalArgumentException("\nArray de dados invalido!\n");
        for (int i = 0; i < n; i++) {
            if (dados[i] < menor) menor = dados[i];
        }
        return menor;
    }
    public double amplitude(double dados[]) {
        if (dados == null) throw new IllegalArgumentException("\nArray de dados invalido!\n");
        return maiorDado(dados) - menorDado(dados);
    }
}