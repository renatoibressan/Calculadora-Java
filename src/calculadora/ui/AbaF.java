package calculadora.ui;
import calculadora.service.EstatisticaService;
import calculadora.util.MathUtils;
import java.util.Scanner;

public class AbaF {
    public static void executarAbaF(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA F =====\n");
        int option = -1, casasDecimais, n, i;
        double[] dados;
        double resultadoDouble;
        String load = "...";
        EstatisticaService stats = new EstatisticaService();
        do {
            casasDecimais = 0;
            System.out.println("37. Media");
            System.out.println("38. Moda");
            System.out.println("39. Mediana");
            System.out.println("40. Variancia");
            System.out.println("41. Desvio padrao");
            System.out.println("42. Maior dado");
            System.out.println("43. Menor dado");
            System.out.println("44. Amplitude");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opcoes acima: ");
            option = sc.nextInt();
            switch (option) {
                case 37:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.media(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nMedia: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 38:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.moda(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nModa: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 39:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.mediana(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nMediana: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 40:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.variancia(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nVariancia: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 41:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.desvioPadrao(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nDesvio padrao: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 42:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.maiorDado(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nMaior dado: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 43:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.menorDado(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nMenor dado: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 44:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.amplitude(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nAmplitude: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.print("\nRetornando ao menu principal");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.print("\n");
                    break;
                default:
                    System.out.print("\nOpcao " + option + " invalida!\n\nRetornando ao menu da aba C");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.print("\n");
                    sc.nextLine();
            }
        } while (option != 0);
    }
}