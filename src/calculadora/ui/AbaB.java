package calculadora.ui;
import calculadora.service.SequenciasService;
import calculadora.util.MathUtils;
import java.util.Scanner;

public class AbaB {
    public static void executarAbaB(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA B =====\n");
        int option = -1, casasDecimais;
        int n, a, b;
        double resultadoDouble;
        long resultadoLong;
        String load = "...";
        SequenciasService seq = new SequenciasService();
        do {
            casasDecimais = 0;
            System.out.println("9. Fatorial");
            System.out.println("10. Media de dois");
            System.out.println("11. Somatorio");
            System.out.println("12. Produtorio");
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
                    System.out.print("\nDigite a primeira parcela: ");
                    a = sc.nextInt();
                    System.out.print("Digite a segunda parcela: ");
                    b = sc.nextInt();
                    resultadoDouble = seq.mediaDeDois(a, b);
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