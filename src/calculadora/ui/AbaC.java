package calculadora.ui;
import calculadora.service.ComparacaoService;
import calculadora.util.MathUtils;
import java.util.Scanner;

public class AbaC {
    public static void executarAbaC(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA C =====\n");
        int option = -1;
        int a, b;
        boolean resultadoBoolean;
        String afirmacao;
        String load = "...";
        ComparacaoService comp = new ComparacaoService();
        do {
            System.out.println("11. Igual a");
            System.out.println("12. Diferente de");
            System.out.println("13. Maior que");
            System.out.println("14. Menor que");
            System.out.println("15. Maior ou igual a");
            System.out.println("16. Menor ou igual a");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opcoes acima: ");
            option = sc.nextInt();
            switch (option) {
                case 11:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.igualA(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " == " + b + ": " + afirmacao + "\n");
                    break;
                case 12:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.diferenteDe(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " != " + b + ": " + afirmacao + "\n");
                    break;
                case 13:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.maiorQue(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " > " + b + ": " + afirmacao + "\n");
                    break;
                case 14:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.menorQue(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " < " + b + ": " + afirmacao + "\n");
                    break;
                case 15:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.maiorOuIgualA(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " >= " + b + ": " + afirmacao + "\n");
                    break;
                case 16:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.menorOuIgualA(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " <= " + b + ": " + afirmacao + "\n");
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