package com.renato.calculadora.ui;
import com.renato.calculadora.io.HistoricoService;
import com.renato.calculadora.model.TipoOperacao;
import com.renato.calculadora.service.ComparacaoService;
import com.renato.calculadora.util.*;

import java.io.IOException;
import java.util.Scanner;

public class AbaC {
    public static void executarAbaC(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA C =====\n");
        int option = -1, a, b;
        boolean resultadoBoolean;
        String afirmacao;
        String load = "...", registro;
        ComparacaoService comp = new ComparacaoService();
        HistoricoService historico = new HistoricoService("historico.txt");
        TipoOperacao op;
        do {
            System.out.println("19. Igual a");
            System.out.println("20. Diferente de");
            System.out.println("21. Maior que");
            System.out.println("22. Menor que");
            System.out.println("23. Maior ou igual a");
            System.out.println("24. Menor ou igual a");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opcoes acima: ");
            option = sc.nextInt();
            switch (option) {
                case 19:
                    System.out.print("\nDigite um numero para ser comparado: ");
                    a = sc.nextInt();
                    System.out.print("Digite outro numero para comparar ao anterior: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.igualA(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " == " + b + ": " + afirmacao + "\n");
                    op = TipoOperacao.IGUAL;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoBoolean);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 20:
                    System.out.print("\nDigite um numero para ser comparado: ");
                    a = sc.nextInt();
                    System.out.print("Digite outro numero para comparar ao anterior: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.diferenteDe(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " != " + b + ": " + afirmacao + "\n");
                    op = TipoOperacao.DIFERENTE;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoBoolean);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 21:
                    System.out.print("\nDigite um numero para ser comparado: ");
                    a = sc.nextInt();
                    System.out.print("Digite outro numero para comparar ao anterior: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.maiorQue(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " > " + b + ": " + afirmacao + "\n");
                    op = TipoOperacao.MAIOR;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoBoolean);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 22:
                   System.out.print("\nDigite um numero para ser comparado: ");
                    a = sc.nextInt();
                    System.out.print("Digite outro numero para comparar ao anterior: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.menorQue(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " < " + b + ": " + afirmacao + "\n");
                    op = TipoOperacao.MENOR;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoBoolean);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 23:
                    System.out.print("\nDigite um numero para ser comparado: ");
                    a = sc.nextInt();
                    System.out.print("Digite outro numero para comparar ao anterior: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.maiorOuIgualA(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " >= " + b + ": " + afirmacao + "\n");
                    op = TipoOperacao.MAIOR_OU_IGUAL;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoBoolean);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 24:
                    System.out.print("\nDigite um numero para ser comparado: ");
                    a = sc.nextInt();
                    System.out.print("Digite outro numero para comparar ao anterior: ");
                    b = sc.nextInt();
                    resultadoBoolean = comp.menorOuIgualA(a, b);
                    afirmacao = MathUtils.verdadeiroOuFalso(resultadoBoolean);
                    System.out.println("\n" + a + " <= " + b + ": " + afirmacao + "\n");
                    op = TipoOperacao.MENOR_OU_IGUAL;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoBoolean);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
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