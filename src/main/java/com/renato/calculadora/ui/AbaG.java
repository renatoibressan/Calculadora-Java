package com.renato.calculadora.ui;
import com.renato.calculadora.io.HistoricoService;
import com.renato.calculadora.model.TipoOperacao;
import com.renato.calculadora.service.AlgebraLinearService;
import com.renato.calculadora.util.*;

import java.io.IOException;
import java.util.Scanner;

public class AbaG {
    public static void executarAbaG(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA G =====\n");
        int option = -1, casasDecimais, n, m, p, i, j, resultadoInt;
        int[] casas;
        double resultadoDouble;
        double[] v, v1, v2, resultadoVetor;
        int[][] M, A, B, resultadoMatriz;
        String load = "...", registro;
        AlgebraLinearService al = new AlgebraLinearService();
        HistoricoService historico = new HistoricoService("historico.txt");
        TipoOperacao op;
        do {
            casasDecimais = 0;
            System.out.println("45. Soma vetorial");
            System.out.println("46. Produto escalar");
            System.out.println("47. Norma vetorial");
            System.out.println("48. Soma matricial");
            System.out.println("49. Produto matricial");
            System.out.println("50. Determinante matricial");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opcoes acima: ");
            option = sc.nextInt();
            switch (option) {
                case 45:
                    System.out.print("\nDigite o tamanho dos vetores: ");
                    n = sc.nextInt();
                    while (n < 1 || n > 20) {
                        System.out.print("\nTamanho invalido para os vetores!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    v1 = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o elemento " + (i + 1) + " do primeiro vetor: ");
                        v1[i] = sc.nextDouble();
                    }
                    v2 = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o elemento " + (i + 1) + " do segundo vetor: ");
                        v2[i] = sc.nextDouble();
                    }
                    try {
                        resultadoVetor = al.somaVetorial(v1, v2);
                        casas = new int[n];
                        for (i = 0; i < n; i++) {
                            casas[i] = 0;
                        }
                        System.out.print("\nv1 + v2 = ");
                        for (i = 0; i < n; i++) {
                            if (!MathUtils.inteiroOuNao(resultadoVetor[i])) casas[i] = MathUtils.contarCasasDecimais(resultadoVetor[i]);
                            if (i == 0) System.out.print("[");
                            if (i > 0) System.out.print(", ");
                            System.out.print(String.format("%." + casas[i] + "f", resultadoVetor[i]));
                            if (i == n - 1) System.out.println("]\n");
                        }
                        op = TipoOperacao.SOMA_VETOR;
                        registro = op + "; " + FormatUtils.formatar(v1) + "; " + FormatUtils.formatar(v2) + "; " + FormatUtils.formatar(resultadoVetor);
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
                    System.out.print("\nDigite o tamanho dos vetores: ");
                    n = sc.nextInt();
                    while (n < 1 || n > 20) {
                        System.out.print("\nTamanho invalido para os vetores!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    v1 = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o elemento " + (i + 1) + " do primeiro vetor: ");
                        v1[i] = sc.nextDouble();
                    }
                    v2 = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o elemento " + (i + 1) + " do segundo vetor: ");
                        v2[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = al.produtoEscalar(v1, v2);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\n(v1.v2) = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.PRODUTO_ESCALAR;
                        registro = op + "; " + FormatUtils.formatar(v1) + "; " + FormatUtils.formatar(v2) + "; " + FormatUtils.formatar(resultadoDouble);
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
                    System.out.print("\nDigite o tamanho do vetor: ");
                    n = sc.nextInt();
                    while (n < 1 || n > 20) {
                        System.out.print("\nTamanho invalido para o vetor!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    v = new double[n];
                    for (i = 0; i < n; i++) {
                        System.out.print("Digite o elemento " + (i + 1) + " do vetor: ");
                        v[i] = sc.nextDouble();
                    }
                    try {
                        resultadoDouble = al.normaVetorial(v);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\n|v| = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.NORMA;
                        registro = op + "; " + FormatUtils.formatar(v) + "; " + FormatUtils.formatar(resultadoDouble);
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
                    System.out.print("\nDigite a quantidade de linhas das matrizes: ");
                    m = sc.nextInt();
                    while (m < 1 || m > 10) {
                        System.out.print("\nDimensao invalida!\nPor favor, tente novamente: ");
                        m = sc.nextInt();
                    }
                    System.out.print("\nDigite a quantidade de colunas das matrizes: ");
                    n = sc.nextInt();
                    while (n < 1 || n > 10) {
                        System.out.print("\nDimensao invalida!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    A = new int[m][n];
                    System.out.println("\nDigite os elementos da primeira matriz:");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            A[i][j] = sc.nextInt();
                        }
                    }
                    B = new int[m][n];
                    System.out.println("Digite os elementos da segunda matriz:");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            B[i][j] = sc.nextInt();
                        }
                    }
                    try {
                        resultadoMatriz = al.somaMatricial(A, B);
                        System.out.println("\nMatriz resultante:\n");
                        for (i = 0; i < m; i++) {
                            for (j = 0; j < n; j++) {
                                if (j > 0) System.out.print(" ");
                                System.out.print(resultadoMatriz[i][j]);
                            }
                            System.out.print("\n");
                        }
                        System.out.print("\n");
                        op = TipoOperacao.SOMA_MATRIZ;
                        registro = op + "; " + FormatUtils.formatar(A) + "; " + FormatUtils.formatar(B) + "; " + FormatUtils.formatar(resultadoMatriz);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 49:
                    System.out.print("\nDigite a quantidade de linhas da primeira matriz: ");
                    m = sc.nextInt();
                    while (m < 1 || m > 10) {
                        System.out.print("\nDimensao invalida!\nPor favor, tente novamente: ");
                        m = sc.nextInt();
                    }
                    System.out.print("\nDigite a quantidade de colunas da segunda matriz\n(Equivalente a quantidade de linhas da segunda matriz): ");
                    n = sc.nextInt();
                    while (n < 1 || n > 10) {
                        System.out.print("\nDimensao invalida!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    System.out.print("\nDigite a quantidade de colunas da segunda matriz: ");
                    p = sc.nextInt();
                    while (p < 1 || p > 10) {
                        System.out.print("\nDimensao invalida!\nPor favor, tente novamente: ");
                        p = sc.nextInt();
                    }
                    A = new int[m][n];
                    System.out.println("\nDigite os elementos da primeira matriz:");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            A[i][j] = sc.nextInt();
                        }
                    }
                    B = new int[n][p];
                    System.out.println("Digite os elementos da segunda matriz:");
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < p; j++) {
                            B[i][j] = sc.nextInt();
                        }
                    }
                    try {
                        resultadoMatriz = al.produtoMatricial(A, B);
                        System.out.println("\nMatriz resultante:\n");
                        for (i = 0; i < m; i++) {
                            for (j = 0; j < p; j++) {
                                if (j > 0) System.out.print(" ");
                                System.out.print(resultadoMatriz[i][j]);
                            }
                            System.out.print("\n");
                        }
                        System.out.print("\n");
                        op = TipoOperacao.PRODUTO_MATRIZ;
                        registro = op + "; " + FormatUtils.formatar(A) + "; " + FormatUtils.formatar(B) + "; " + FormatUtils.formatar(resultadoMatriz);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 50:
                    System.out.print("\nDigite a ordem da matriz: ");
                    n = sc.nextInt();
                    while (n < 1 || n > 3) {
                        System.out.print("\nOrdem de matriz invalida!\nPor favor, tente novamente: ");
                        n = sc.nextInt();
                    }
                    M = new int[n][n];
                    System.out.println("\nDigite os elementos da matriz:");
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < n; j++) {
                            M[i][j] = sc.nextInt();
                        }
                    }
                    try {
                        resultadoInt = al.determinanteMatricial(M);
                        System.out.println("\ndet(M) = " + resultadoInt + "\n");
                        op = TipoOperacao.DETERMINANTE;
                        registro = op + "; " + FormatUtils.formatar(M) + "; " + FormatUtils.formatar(resultadoInt);
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