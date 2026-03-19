package calculadora.ui;
import calculadora.service.AritmeticaService;
import calculadora.util.MathUtils;
import java.util.Scanner;

public class AbaA {
    public static void executarAbaA(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA A =====\n");
        int option = -1, casasDecimais;
        int a, b, resultadoInt;
        double resultadoDouble;
        String load = "...";
        AritmeticaService arit = new AritmeticaService();
        do {
            casasDecimais = 0;
            System.out.println("1. Adicao");
            System.out.println("2. Subtracao");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Divisao");
            System.out.println("5. Resto");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opcoes acima: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    resultadoInt = arit.adicao(a, b);
                    System.out.println("\n" + a + " + " + b + " = " + resultadoInt + "\n");
                    break;
                case 2:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    resultadoInt = arit.subtracao(a, b);
                    System.out.println("\n" + a + " - " + b + " = " + resultadoInt + "\n");
                    break;
                case 3:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    resultadoInt = arit.multiplicacao(a, b);
                    System.out.println("\n" + a + " * " + b + " = " + resultadoInt + "\n");
                    break;
                case 4:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    try {
                        resultadoDouble = arit.divisao(a, b);
                        if (a % b != 0) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\n" + a + " / " + b + " = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    } catch (ArithmeticException e) {
                        System.out.println("\n" + e.getMessage() + "\n");
                    }
                    break;
                case 5:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    try {
                        resultadoInt = arit.resto(a, b);
                        System.out.println("\n" + a + " % " + b + " = " + resultadoInt + "\n");
                    } catch (ArithmeticException e) {
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
                    System.out.print("\nOpcao " + option + " invalida!\n\nRetornando ao menu da aba A");
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