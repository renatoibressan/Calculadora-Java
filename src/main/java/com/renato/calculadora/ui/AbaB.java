package com.renato.calculadora.ui;
import com.renato.calculadora.io.HistoricoService;
import com.renato.calculadora.model.TipoOperacao;
import com.renato.calculadora.service.SequenciasService;
import com.renato.calculadora.util.*;

import java.io.IOException;
import java.util.Scanner;

public class AbaB {
    public static void executarAbaB(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA B =====\n");
        int option = -1, casasDecimais, n, a, b;
        double a1, razao, resultadoDouble;
        long resultadoLong;
        String load = "...", registro;
        SequenciasService seq = new SequenciasService();
        HistoricoService historico = new HistoricoService("historico.txt");
        TipoOperacao op;
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
                        op = TipoOperacao.FATORIAL;
                        registro = op + "; " + FormatUtils.formatar(n) + "; " + FormatUtils.formatar(resultadoLong);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 10:
                    System.out.print("\nDigite um numero natural: ");
                    n = sc.nextInt();
                    try {
                        resultadoLong = seq.termoFibonacci(n);
                        System.out.println("\nF" + n + " = " + resultadoLong + "\n");
                        op = TipoOperacao.FIBONACCI;
                        registro = op + "; " + FormatUtils.formatar(n) + "; " + FormatUtils.formatar(resultadoLong);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
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
                    op = TipoOperacao.SOMATORIO;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoLong);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
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
                    op = TipoOperacao.PRODUTORIO;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoLong);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
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
                        op = TipoOperacao.TERMO_PA;
                        registro = op + "; " + FormatUtils.formatar(a1) + "; " + FormatUtils.formatar(razao) + "; " + FormatUtils.formatar(n) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
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
                        op = TipoOperacao.SOMA_PA;
                        registro = op + "; " + FormatUtils.formatar(a1) + "; " + FormatUtils.formatar(razao) + "; " + FormatUtils.formatar(n) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
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
                        op = TipoOperacao.TERMO_PG;
                        registro = op + "; " + FormatUtils.formatar(a1) + "; " + FormatUtils.formatar(razao) + "; " + FormatUtils.formatar(n) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
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
                        op = TipoOperacao.SOMA_PG;
                        registro = op + "; " + FormatUtils.formatar(a1) + "; " + FormatUtils.formatar(razao) + "; " + FormatUtils.formatar(n) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
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