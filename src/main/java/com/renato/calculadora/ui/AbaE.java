package com.renato.calculadora.ui;
import com.renato.calculadora.io.HistoricoService;
import com.renato.calculadora.model.TipoOperacao;
import com.renato.calculadora.service.NumerosService;
import com.renato.calculadora.util.*;

import java.io.IOException;
import java.util.Scanner;

public class AbaE {
    public static void executarAbaE(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA E =====\n");
        int option = -1, n, a, b, resultadoInt;
        boolean resultadoBoolean;
        String afirmacao;
        String load = "...", registro;
        NumerosService num = new NumerosService();
        HistoricoService historico = new HistoricoService("historico.txt");
        TipoOperacao op;
        do {
            System.out.println("33. MDC");
            System.out.println("34. MMC");
            System.out.println("35. Primo ou nao");
            System.out.println("36. Quantidade de divisores");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opcoes acima: ");
            option = sc.nextInt();
            switch (option) {
                case 33:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    a = Math.abs(a);
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    b = Math.abs(b);
                    if (a > b) {
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                    resultadoInt = num.mdc(a, b);
                    System.out.println("\nMDC de " + a + " e " + b + ": " + resultadoInt + "\n");
                    op = TipoOperacao.MDC;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoInt);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 34:
                    System.out.print("\nDigite o primeiro numero: ");
                    a = sc.nextInt();
                    a = Math.abs(a);
                    System.out.print("Digite o segundo numero: ");
                    b = sc.nextInt();
                    b = Math.abs(b);
                    if (a > b) {
                        int temp = a;
                        a = b;
                        b = temp;
                    }
                    resultadoInt = num.mmc(a, b);
                    System.out.println("\nMMC de " + a + " e " + b + ": " + resultadoInt + "\n");
                    op = TipoOperacao.MMC;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoInt);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 35:
                    System.out.print("\nDigite um numero natural: ");
                    n = sc.nextInt();
                    try {
                        resultadoBoolean = num.primoOuNao(n);
                        afirmacao = MathUtils.primoOuNao(resultadoBoolean);
                        System.out.println("\n" + n + ": numero " + afirmacao + "\n");
                        op = TipoOperacao.PRIMO;
                        registro = op + "; " + FormatUtils.formatar(n) + "; " + FormatUtils.formatar(resultadoBoolean);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 36:
                    System.out.print("\nDigite um numero inteiro nao nulo: ");
                    n = sc.nextInt();
                    try {
                        resultadoInt = num.quantidadeDivisores(n);
                        System.out.println("\n" + n + " possui " + resultadoInt + " divisores\n");
                        op = TipoOperacao.DIVISORES;
                        registro = op + "; " + FormatUtils.formatar(n) + "; " + FormatUtils.formatar(resultadoInt);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (ArithmeticException e) {
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