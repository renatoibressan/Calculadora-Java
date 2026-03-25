package com.renato.calculadora.ui;
import com.renato.calculadora.io.HistoricoService;
import com.renato.calculadora.model.TipoOperacao;
import com.renato.calculadora.service.AritmeticaService;
import com.renato.calculadora.util.*;

import java.io.IOException;
import java.util.Scanner;

public class AbaA {
    public static void executarAbaA(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA A =====\n");
        int option = -1, casasDecimais, f, a, b, n, resultadoInt;
        double m, resultadoDouble;
        String load = "...", registro;
        AritmeticaService arit = new AritmeticaService();
        HistoricoService historico = new HistoricoService("historico.txt");
        TipoOperacao op;
        do {
            f = 0;
            casasDecimais = 0;
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Resto");
            System.out.println("6. Potenciação");
            System.out.println("7. Raiz quadrada");
            System.out.println("8. Módulo");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opções acima: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("\nDigite a primeira parcela: ");
                    a = sc.nextInt();
                    System.out.print("Digite a segunda parcela: ");
                    b = sc.nextInt();
                    resultadoInt = arit.adicao(a, b);
                    System.out.println("\n" + a + " + " + b + " = " + resultadoInt + "\n");
                    op = TipoOperacao.ADICAO;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoInt);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 2:
                    System.out.print("\nDigite o minuendo: ");
                    a = sc.nextInt();
                    System.out.print("Digite o subtraendo: ");
                    b = sc.nextInt();
                    resultadoInt = arit.subtracao(a, b);
                    System.out.println("\n" + a + " - " + b + " = " + resultadoInt + "\n");
                    op = TipoOperacao.SUBTRACAO;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoInt);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 3:
                    System.out.print("\nDigite o primeiro fator: ");
                    a = sc.nextInt();
                    System.out.print("Digite o segundo fator: ");
                    b = sc.nextInt();
                    resultadoInt = arit.multiplicacao(a, b);
                    System.out.println("\n" + a + " * " + b + " = " + resultadoInt + "\n");
                    op = TipoOperacao.MULTIPLICACAO;
                    registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoInt);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 4:
                    System.out.print("\nDigite o dividendo: ");
                    a = sc.nextInt();
                    System.out.print("Digite o divisor: ");
                    b = sc.nextInt();
                    try {
                        resultadoDouble = arit.divisao(a, b);
                        if (a % b != 0) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\n" + a + " / " + b + " = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.DIVISAO;
                        registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("\nDigite o dividendo: ");
                    a = sc.nextInt();
                    System.out.print("Digite o divisor: ");
                    b = sc.nextInt();
                    try {
                        resultadoInt = arit.resto(a, b);
                        System.out.println("\n" + a + " % " + b + " = " + resultadoInt + "\n");
                        op = TipoOperacao.RESTO;
                        registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoInt);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.print("\nDigite a base: ");
                    a = sc.nextInt();
                    System.out.print("Digite o expoente: ");
                    b = sc.nextInt();
                    try {
                        resultadoDouble = arit.potenciacao(a, b);
                        if (b < 0) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\n" + a + " ^ " + b + " = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.POTENCIACAO;
                        registro = op + "; " + FormatUtils.formatar(a) + "; " + FormatUtils.formatar(b) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    System.out.print("\nDigite uma base real não negativa: ");
                    m = sc.nextDouble();
                    try {
                        resultadoDouble = arit.raizQuadrada(m);
                        if (!MathUtils.inteiroOuNao(m)) f = MathUtils.contarCasasDecimais(m);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\n" + String.format("%." + f + "f", m) + " ^ 1/2 = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.RAIZ_QUADRADA;
                        registro = op + "; " + FormatUtils.formatar(m) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    System.out.print("\nDigite um número inteiro: ");
                    n = sc.nextInt();
                    resultadoInt = arit.modulo(n);
                    System.out.println("\n|" + n + "| = " + resultadoInt + "\n");
                    op = TipoOperacao.MODULO;
                    registro = op + "; " + FormatUtils.formatar(n) + "; " + FormatUtils.formatar(resultadoInt);
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
                    System.out.print("\nOpção " + option + " inválida!\n\nRetornando ao menu da aba A");
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