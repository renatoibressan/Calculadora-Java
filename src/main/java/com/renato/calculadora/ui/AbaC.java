package com.renato.calculadora.ui;
import com.renato.calculadora.service.ComparacaoService;
import com.renato.calculadora.util.MathUtils;
import java.util.Scanner;

public class AbaC {
    public static void executarAbaC(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA C =====\n");
        int option = -1, a, b;
        boolean resultadoBoolean;
        String afirmacao;
        String load = "...";
        ComparacaoService comp = new ComparacaoService();
        do {
            System.out.println("17. Igual a");
            System.out.println("18. Diferente de");
            System.out.println("19. Maior que");
            System.out.println("20. Menor que");
            System.out.println("21. Maior ou igual a");
            System.out.println("22. Menor ou igual a");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opcoes acima: ");
            option = sc.nextInt();
            switch (option) {
                case 17:
                    System.out.print("\nDigite um numero para ser comparado: ");
                    a = sc.nextInt();
                    System.out.print("Digite outro numero para comparar ao anterior: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.igualA(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " == " + b + ": " + afirmacao + "\n");
                    break;
                case 18:
                    System.out.print("\nDigite um numero para ser comparado: ");
                    a = sc.nextInt();
                    System.out.print("Digite outro numero para comparar ao anterior: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.diferenteDe(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " != " + b + ": " + afirmacao + "\n");
                    break;
                case 19:
                    System.out.print("\nDigite um numero para ser comparado: ");
                    a = sc.nextInt();
                    System.out.print("Digite outro numero para comparar ao anterior: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.maiorQue(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " > " + b + ": " + afirmacao + "\n");
                    break;
                case 20:
                   System.out.print("\nDigite um numero para ser comparado: ");
                    a = sc.nextInt();
                    System.out.print("Digite outro numero para comparar ao anterior: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.menorQue(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " < " + b + ": " + afirmacao + "\n");
                    break;
                case 21:
                    System.out.print("\nDigite um numero para ser comparado: ");
                    a = sc.nextInt();
                    System.out.print("Digite outro numero para comparar ao anterior: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.maiorOuIgualA(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " >= " + b + ": " + afirmacao + "\n");
                    break;
                case 22:
                    System.out.print("\nDigite um numero para ser comparado: ");
                    a = sc.nextInt();
                    System.out.print("Digite outro numero para comparar ao anterior: ");
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