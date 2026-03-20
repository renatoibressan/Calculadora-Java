package calculadora.ui;
import calculadora.service.SequenciasService;
import calculadora.util.MathUtils;
import java.util.Scanner;

public class AbaB {
    public static void executarAbaB(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA B =====\n");
        int option = -1, casasDecimais;
        int n, a, b;
        double a1, razao, resultadoDouble;
        long resultadoLong;
        String load = "...";
        SequenciasService seq = new SequenciasService();
        do {
            casasDecimais = 0;
            System.out.println("9. Fatorial");
            System.out.println("10. Termo de Fibonacci");
            System.out.println("11. Somatorio");
            System.out.println("12. Produtorio");
            System.out.println("13. Termo de PA");
            System.out.println("14. Soma de PA");
            System.out.println("15. Termo de PG");
            System.out.println("16. Soma de PG");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opcoes acima: ");
            option = sc.nextInt();
            switch (option) {
                case 9:
                    System.out.print("\nDigite um numero natural: ");
                    n = sc.nextInt();
                    try {
                        resultadoLong = seq.fatorial(n);
                        System.out.println("\n" + n + "! = " + resultadoLong + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("\n" + e.getMessage() + "\n");
                    }
                    break;
                case 10:
                    System.out.print("\nDigite um numero natural: ");
                    n = sc.nextInt();
                    try {
                        resultadoLong = seq.termoFibonacci(n);
                        System.out.println("\nF" + n + " = " + resultadoLong + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("\n" + e.getMessage() + "\n");
                    }
                    break;
                case 11:
                    System.out.print("\nDigite o limite inferior: ");
                    a = sc.nextInt();
                    System.out.print("Digite o limite superior: ");
                    b = sc.nextInt();
                    if (a > b) {
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                    resultadoLong = seq.somatorio(a, b);
                    System.out.println("\nSomatorio de " + a + " -> " + b + ": " + resultadoLong + "\n");
                    break;
                case 12:
                    System.out.print("\nDigite o limite inferior: ");
                    a = sc.nextInt();
                    System.out.print("Digite o limite superior: ");
                    b = sc.nextInt();
                    if (a > b) {
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                    resultadoLong = seq.produtorio(a, b);
                    System.out.println("\nProdutorio de " + a + " -> " + b + ": " + resultadoLong + "\n");
                    break;
                case 13:
                    System.out.print("\nDigite o primeiro termo da PA: ");
                    a1 = sc.nextDouble();
                    System.out.print("Digite a razao da PA: ");
                    razao = sc.nextDouble();
                    System.out.print("Digite a posicao do termo desejado: ");
                    n = sc.nextInt();
                    try {
                        resultadoDouble = seq.termoPA(a1, razao, n);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\na" + n + " = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("\n" + e.getMessage() + "\n");
                    }
                    break;
                case 14:
                    System.out.print("\nDigite o primeiro termo da PA: ");
                    a1 = sc.nextDouble();
                    System.out.print("Digite a razao da PA: ");
                    razao = sc.nextDouble();
                    System.out.print("Digite a quantidade de termos desejada: ");
                    n = sc.nextInt();
                    try {
                        resultadoDouble = seq.somaPA(a1, razao, n);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nS(" + n + ") = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("\n" + e.getMessage() + "\n");
                    }
                    break;
                case 15:
                    System.out.print("\nDigite o primeiro termo da PG: ");
                    a1 = sc.nextDouble();
                    System.out.print("Digite a razao da PG: ");
                    razao = sc.nextDouble();
                    System.out.print("Digite a posicao do termo desejado: ");
                    n = sc.nextInt();
                    try {
                        resultadoDouble = seq.termoPG(a1, razao, n);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\na" + n + " = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("\n" + e.getMessage() + "\n");
                    }
                    break;
                case 16:
                    System.out.print("\nDigite o primeiro termo da PG: ");
                    a1 = sc.nextDouble();
                    System.out.print("Digite a razao da PG: ");
                    razao = sc.nextDouble();
                    System.out.print("Digite a quantidade de termos desejada: ");
                    n = sc.nextInt();
                    try {
                        resultadoDouble = seq.somaPG(a1, razao, n);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nS(" + n + ") = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("\n" + e.getMessage() + "\n");
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
                    System.out.print("\nOpcao " + option + " invalida!\n\nRetornando ao menu da aba B");
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