package com.renato.calculadora.ui;
import com.renato.calculadora.io.HistoricoService;
import com.renato.calculadora.model.*;
import com.renato.calculadora.service.ConversorService;
import com.renato.calculadora.service.TemperaturaService;
import com.renato.calculadora.util.FormatUtils;
import com.renato.calculadora.util.MathUtils;

import java.io.IOException;
import java.util.Scanner;

public class AbaH {
    public static void executarAbaH(Scanner sc) throws InterruptedException {
        System.out.println("\n===== ABA H =====\n");
        int option = -1, casasDecimaisVI, casasDecimaisRF;
        double valor, resultadoDouble;
        char escala1, escala2;
        String load = "...", registro, unit1, unit2, valorInicial, resultadoFinal;
        ConversorService conv = new ConversorService();
        TemperaturaService temp = new TemperaturaService();
        TipoUnidade unitInicial, unitFinal;
        UnidadeTemperatura escalaInicial, escalaFinal;
        HistoricoService historico = new HistoricoService("historico.txt");
        TipoOperacao op;
        do {
            casasDecimaisVI = 0;
            casasDecimaisRF = 0;
            System.out.println("55. Conversão de medidas");
            System.out.println("56. Conversão de temperaturas");
            System.out.println("0. Retornar ao menu principal");
            System.out.print("\nEscolha uma das opções acima: ");
            option = sc.nextInt();
            switch (option) {
                case 55:
                    System.out.println("\nUnidades de medida disponíveis:");
                    System.out.println("Tempo: segundos(s), minutos(min), horas(h)");
                    System.out.println("Comprimento: metros(m), quilômetros(km), centímetros(cm), milímetros(mm)");
                    System.out.println("Área: metros quadrados(m2), quilômetros quadrados(km2), cenímetos quadrados(cm2)");
                    System.out.println("Volume: metros cúbicos(m3), centímetros cúbicos(cm3)");
                    System.out.println("Capacidade: litros(l), mililitros(ml)");
                    System.out.println("Massa: quilogramas(kg), gramas(g), toneladas(t)");
                    System.out.print("\nDigite o valor da medida: ");
                    valor = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Digite a unidade de medida inicial: ");
                    unit1 = sc.nextLine();
                    unit1 = unit1.toLowerCase();
                    unitInicial = TipoUnidade.medida(unit1);
                    System.out.print("Digite a unidade de medida final: ");
                    unit2 = sc.nextLine();
                    unit2 = unit2.toLowerCase();
                    unitFinal = TipoUnidade.medida(unit2);
                    try {
                        resultadoDouble = conv.converterMedida(valor, unitInicial, unitFinal);
                        if (!MathUtils.inteiroOuNao(valor)) casasDecimaisVI = MathUtils.contarCasasDecimais(valor);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimaisRF = MathUtils.contarCasasDecimais(resultadoDouble);
                        valorInicial = String.format("%." + casasDecimaisVI + "f", valor);
                        resultadoFinal = String.format("%." + casasDecimaisRF + "f", resultadoDouble);
                        System.out.println("\n" + valorInicial + unit1 + " = " + resultadoFinal + unit2 + "\n");
                        op = TipoOperacao.CONVERSAO_MEDIDAS;
                        registro = op + "; " + FormatUtils.formatar(valor) + "; " + FormatUtils.formatar(unit1) + "; " + FormatUtils.formatar(resultadoDouble) + "; " + FormatUtils.formatar(unit2);
                        try {
                            historico.salvarRegistro(registro);
                        } catch (IOException e) {
                            System.out.println("\nErro ao salvar histórico!\n");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 56:
                    System.out.println("\nEscalas disponíveis:");
                    System.out.println("Celsius(C)\nFahrenheit(F)\nKelvin(K)");
                    System.out.print("\nDigite o valor da temperatura: ");
                    valor = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Digite a escala inicial: ");
                    escala1 = sc.nextLine().charAt(0);
                    escala1 = Character.toUpperCase(escala1);
                    escalaInicial = UnidadeTemperatura.escala(escala1);
                    System.out.print("Digite a escala final: ");
                    escala2 = sc.nextLine().charAt(0);
                    escala2 = Character.toUpperCase(escala2);
                    escalaFinal = UnidadeTemperatura.escala(escala2);
                    try {
                        resultadoDouble = temp.converterTemperatura(valor, escalaInicial, escalaFinal);
                        if (!MathUtils.inteiroOuNao(valor)) casasDecimaisVI = MathUtils.contarCasasDecimais(valor);
                        if (!MathUtils.inteiroOuNao(resultadoDouble)) casasDecimaisRF = MathUtils.contarCasasDecimais(resultadoDouble);
                        valorInicial = String.format("%." + casasDecimaisVI + "f", valor);
                        resultadoFinal = String.format("%." + casasDecimaisRF + "f", resultadoDouble);
                        System.out.println("\n" + valorInicial + escala1 + " = " + resultadoFinal + escala2 + "\n");
                        op = TipoOperacao.CONVERSAO_TEMPERATURAS;
                        registro = op + "; " + FormatUtils.formatar(valor) + "; " + FormatUtils.formatar(escala1) + "; " + FormatUtils.formatar(resultadoDouble) + "; " + FormatUtils.formatar(escala2);
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