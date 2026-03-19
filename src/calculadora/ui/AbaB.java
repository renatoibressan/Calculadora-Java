package calculadora.ui;
import calculadora.service.AvancadoService;
import calculadora.util.MathUtils;
import java.util.Scanner;

public class AbaB {
    public static void executarAbaB(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA B =====\n");
        int option = -1, casasDecimais;
        int n, a, b;
        long resultadoLong;
        double resultadoDouble;
        String load = "...";
        AvancadoService avanc = new AvancadoService();
        do {
            casasDecimais = 0;
            System.out.println("6. Potenciacao");
            System.out.println("7. Fatorial");
            System.out.println("8. Media de dois");
            System.out.println("9. Somatorio");
            System.out.println("10. Produtorio");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opcoes acima: ");
            option = sc.nextInt();
            switch (option) {
                case 6:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    try {
                        resultadoDouble = avanc.potenciacao(a, b);
                        if (b < 0) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\n" + a + " ^ " + b + " = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (ArithmeticException e) {
                        System.out.println("\n" + e.getMessage() + "\n");
                    }
                    break;
                case 7:
                    System.out.print("\nDigite um numero: ");
                    n = sc.nextInt();
                    try {
                        resultadoLong = avanc.fatorial(n);
                        System.out.println("\n" + n + "! = " + resultadoLong + "\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("\n" + e.getMessage() + "\n");
                    }
                    break;
                case 8:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    resultadoDouble = avanc.mediaDeDois(a, b);
                    if ((a + b) % 2 != 0) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                    System.out.println("\nMedia de " + a + " e " + b + ": " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    break;
                case 9:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    resultadoLong = avanc.somatorio(a, b);
                    if (a > b) {
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                    System.out.println("\nSomatorio de " + a + " -> " + b + ": " + resultadoLong + "\n");
                    break;
                case 10:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    resultadoLong = avanc.produtorio(a, b);
                    if (a > b) {
                        int temp = a;
                        a = b;
                        b = temp;
                    }
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