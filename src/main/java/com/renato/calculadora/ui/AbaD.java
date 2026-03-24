package com.renato.calculadora.ui;
import com.renato.calculadora.io.HistoricoService;
import com.renato.calculadora.model.TipoOperacao;
import com.renato.calculadora.service.TrigonometricaService;
import com.renato.calculadora.util.*;

import java.io.IOException;
import java.util.Scanner;

public class AbaD {
    public static void executarAbaD(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA D =====\n");
        int option = -1, casasDecimais, f;
        double x, razao, resultadoDouble;
        String load = "...", registro;
        TrigonometricaService trig = new TrigonometricaService();
        HistoricoService historico = new HistoricoService("historico.txt");
        TipoOperacao op;
        do {
            f = 0;
            casasDecimais = 0;
            System.out.println("23. Valor em radianos");
            System.out.println("24. Seno");
            System.out.println("25. Cosseno");
            System.out.println("26. Tangente");
            System.out.println("27. Arco seno");
            System.out.println("28. Arco cosseno");
            System.out.println("29. Arco tangente");
            System.out.println("30. Secante");
            System.out.println("31. Cossecante");
            System.out.println("32. Cotangente");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opcoes acima: ");
            option = sc.nextInt();
            switch (option) {
                case 23:
                    System.out.print("\nDigite o valor do angulo: ");
                    x = sc.nextDouble();
                    resultadoDouble = trig.valorRadianos(x);
                    if (!MathUtils.inteiroOuNao(x)) f = MathUtils.contarCasasDecimais(x);
                    if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                    System.out.println("\n" + String.format("%." + f + "f", x) + " = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "rad\n");
                    op = TipoOperacao.VALOR_RADIANOS;
                    registro = op + "; " + FormatUtils.formatar(x) + "; " + FormatUtils.formatar(resultadoDouble);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 24:
                    System.out.print("\nDigite o valor do angulo: ");
                    x = sc.nextDouble();
                    resultadoDouble = trig.seno(x);
                    if (!MathUtils.inteiroOuNao(x)) f = MathUtils.contarCasasDecimais(x);
                    if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                    System.out.println("\nsen(" + String.format("%." + f + "f", x) + ") = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    op = TipoOperacao.SENO;
                    registro = op + "; " + FormatUtils.formatar(x) + "; " + FormatUtils.formatar(resultadoDouble);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 25:
                    System.out.print("\nDigite o valor do angulo: ");
                    x = sc.nextDouble();
                    resultadoDouble = trig.cosseno(x);
                    if (!MathUtils.inteiroOuNao(x)) f = MathUtils.contarCasasDecimais(x);
                    if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                    System.out.println("\ncos(" + String.format("%." + f + "f", x) + ") = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                    op = TipoOperacao.COSSENO;
                    registro = op + "; " + FormatUtils.formatar(x) + "; " + FormatUtils.formatar(resultadoDouble);
                    try {
                        historico.salvarRegistro(registro);
                    } catch (IOException e) {
                        System.out.println("\nErro ao salvar histórico!\n");
                    }
                    break;
                case 26:
                    System.out.print("\nDigite o valor do angulo: ");
                    x = sc.nextDouble();
                    try {
                        resultadoDouble = trig.tangente(x);
                        if (!MathUtils.inteiroOuNao(x)) f = MathUtils.contarCasasDecimais(x);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\ntan(" + String.format("%." + f + "f", x) + ") = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.TANGENTE;
                        registro = op + "; " + FormatUtils.formatar(x) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 27:
                    System.out.print("\nDigite o valor da razao: ");
                    razao = sc.nextDouble();
                    try {
                        resultadoDouble = trig.arcoSeno(razao);
                        if (!MathUtils.inteiroOuNao(razao)) f = MathUtils.contarCasasDecimais(razao);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\narcsen(" + String.format("%." + f + "f", razao) + ") = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.ARCO_SENO;
                        registro = op + "; " + FormatUtils.formatar(razao) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 28:
                    System.out.print("\nDigite o valor da razao: ");
                    razao = sc.nextDouble();
                    try {
                        resultadoDouble = trig.arcoCosseno(razao);
                        if (!MathUtils.inteiroOuNao(razao)) f = MathUtils.contarCasasDecimais(razao);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\narccoss(" + String.format("%." + f + "f", razao) + ") = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.ARCO_COSSENO;
                        registro = op + "; " + FormatUtils.formatar(razao) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 29:
                    System.out.print("\nDigite o valor da razao: ");
                    razao = sc.nextDouble();
                    try {
                        resultadoDouble = trig.arcoTangente(razao);
                        if (!MathUtils.inteiroOuNao(razao)) f = MathUtils.contarCasasDecimais(razao);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\narctan(" + String.format("%." + f + "f", razao) + ") = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.ARCO_TANGENTE;
                        registro = op + "; " + FormatUtils.formatar(razao) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 30:
                    System.out.print("\nDigite o valor do angulo: ");
                    x = sc.nextDouble();
                    try {
                        resultadoDouble = trig.secante(x);
                        if (!MathUtils.inteiroOuNao(x)) f = MathUtils.contarCasasDecimais(x);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\nsec(" + String.format("%." + f + "f", x) + ") = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.SECANTE;
                        registro = op + "; " + FormatUtils.formatar(x) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 31:
                    System.out.print("\nDigite o valor do angulo: ");
                    x = sc.nextDouble();
                    try {
                        resultadoDouble = trig.cossecante(x);
                        if (!MathUtils.inteiroOuNao(x)) f = MathUtils.contarCasasDecimais(x);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\ncossec(" + String.format("%." + f + "f", x) + ") = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.COSSECANTE;
                        registro = op + "; " + FormatUtils.formatar(x) + "; " + FormatUtils.formatar(resultadoDouble);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 32:
                    System.out.print("\nDigite o valor do angulo: ");
                    x = sc.nextDouble();
                    try {
                        resultadoDouble = trig.cotangente(x);
                        if (!MathUtils.inteiroOuNao(x)) f = MathUtils.contarCasasDecimais(x);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimais = MathUtils.contarCasasDecimais(resultadoDouble);
                        System.out.println("\ncotan(" + String.format("%." + f + "f", x) + ") = " + String.format("%." + casasDecimais + "f", resultadoDouble) + "\n");
                        op = TipoOperacao.COTANGENTE;
                        registro = op + "; " + FormatUtils.formatar(x) + "; " + FormatUtils.formatar(resultadoDouble);
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