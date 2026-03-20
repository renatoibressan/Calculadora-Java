package calculadora.ui;
import calculadora.service.AvancadoService;
import calculadora.util.MathUtils;
import java.util.Scanner;

public class AbaB {
    public static void executarAbaB(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA B =====\n");
        int option = -1, casasDecimais;
        int n, a, b, resultadoInt;
        double m, p, resultadoDouble;
        long resultadoLong;
        String load = "...";
        AvancadoService avanc = new AvancadoService();
        do {
            casasDecimais = 0;
            System.out.println("7. Raiz quadrada");
            System.out.println("8. Modulo");
            System.out.println("9. Fatorial");
            System.out.println("10. Media de dois");
            System.out.println("11. Somatorio");
            System.out.println("12. Produtorio");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opcoes acima: ");
            option = sc.nextInt();
            switch (option) {
                case 7:
                    System.out.print("\nDigite uma base real nao negativa: ");
                    m = sc.nextDouble();
                    System.out.print("Digite a precisao desejada: ");
                    p = sc.nextDouble();
                    try {
                        resultadoDouble = avanc.raizQuadrada(m, p);
                        if (m != (int) m && p != (int) p) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\n" + m + " ^ 1/2 = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (ArithmeticException e) {
                        System.out.println("\n" + e.getMessage() + "\n");
                    }
                    break;
                case 8:
                    System.out.print("\nDigite um numero inteiro: ");
                    n = sc.nextInt();
                    resultadoInt = avanc.modulo(n);
                    System.out.println("\n|" + n + "| = " + resultadoInt + "\n");
                    break;
                case 9:
                    System.out.print("\nDigite um numero natural: ");
                    n = sc.nextInt();
                    try {
                        resultadoLong = avanc.fatorial(n);
                        System.out.println("\n" + n + "! = " + resultadoLong + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("\n" + e.getMessage() + "\n");
                    }
                    break;
                case 10:
                    System.out.print("\nDigite a primeira parcela: ");
                    a = sc.nextInt();
                    System.out.print("Digite a segunda parcela: ");
                    b = sc.nextInt();
                    resultadoDouble = avanc.mediaDeDois(a, b);
                    if ((a + b) % 2 != 0) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                    System.out.println("\nMedia de " + a + " e " + b + ": " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
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
                    resultadoLong = avanc.somatorio(a, b);
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
                    resultadoLong = avanc.produtorio(a, b);
                    System.out.println("\nProdutorio de " + a + " -> " + b + ": " + resultadoLong + "\n");
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