package com.renato.calculadora.ui;
import com.renato.calculadora.io.HistoricoService;
import com.renato.calculadora.model.TipoOperacao;
import com.renato.calculadora.service.EstatisticaService;
import com.renato.calculadora.util.*;

import java.io.IOException;
import java.util.Scanner;

public class AbaF {
    public static void executarAbaF(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA F =====\n");
        int option = -1, casasDecimais, n, i, limite = 100;
        double[] dados;
        double resultadoDouble;
        String load = "...", registro;
        EstatisticaService stats = new EstatisticaService();
        HistoricoService historico = new HistoricoService("historico.txt");
        TipoOperacao op;
        do {
            casasDecimais = 0;
            System.out.println("41. Média");
            System.out.println("42. Moda");
            System.out.println("43. Mediana");
            System.out.println("44. Variância");
            System.out.println("45. Desvio padrão");
            System.out.println("46. Maior dado");
            System.out.println("47. Menor dado");
            System.out.println("48. Amplitude");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opções acima: ");
            option = sc.nextInt();
            switch (option) {
                case 41:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    while (n < 1 || n > limite) {
                        System.out.print("\nQuantidade de dados inválida!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    System.out.print("\n");
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.media(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nMédia: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.MEDIA;
                        registro = op + "; " + FormatUtils.formatar(dados) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 42:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    while (n < 1 || n > limite) {
                        System.out.print("\nQuantidade de dados inválida!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    System.out.print("\n");
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.moda(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nModa: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.MODA;
                        registro = op + "; " + FormatUtils.formatar(dados) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 43:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    while (n < 1 || n > limite) {
                        System.out.print("\nQuantidade de dados inválida!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    System.out.print("\n");
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.mediana(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nMediana: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.MEDIANA;
                        registro = op + "; " + FormatUtils.formatar(dados) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 44:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    while (n < 2 || n > limite) {
                        System.out.print("\nQuantidade de dados inválida!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    System.out.print("\n");
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.variancia(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nVariância: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.VARIANCIA;
                        registro = op + "; " + FormatUtils.formatar(dados) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 45:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    while (n < 2 || n > limite) {
                        System.out.print("\nQuantidade de dados inválida!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    System.out.print("\n");
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.desvioPadrao(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nDesvio padrão: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.DESVIO_PADRAO;
                        registro = op + "; " + FormatUtils.formatar(dados) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 46:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    while (n < 1 || n > limite) {
                        System.out.print("\nQuantidade de dados inválida!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    System.out.print("\n");
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.maiorDado(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nMaior dado: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.MAIOR_DADO;
                        registro = op + "; " + FormatUtils.formatar(dados) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 47:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    while (n < 1 || n > limite) {
                        System.out.print("\nQuantidade de dados inválida!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    System.out.print("\n");
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.menorDado(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nMenor dado: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.MENOR_DADO;
                        registro = op + "; " + FormatUtils.formatar(dados) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 48:
                    System.out.print("\nDigite a quantidade de dados desejada: ");
                    n = sc.nextInt();
                    while (n < 1 || n > limite) {
                        System.out.print("\nQuantidade de dados inválida!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    System.out.print("\n");
                    dados = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o valor do dado " +  (i + 1) + ": ");
                        dados[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = stats.amplitude(dados);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nAmplitude: " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.AMPLITUDE;
                        registro = op + "; " + FormatUtils.formatar(dados) + "; " + FormatUtils.formatar(resultadoDouble);
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
                    System.out.print("\nOpção " + option + " inválida!\n\nRetornando ao menu da aba C");
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