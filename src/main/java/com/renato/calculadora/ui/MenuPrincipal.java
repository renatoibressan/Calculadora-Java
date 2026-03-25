package com.renato.calculadora.ui;
import com.renato.calculadora.io.HistoricoService;
import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {
    public static void executarMenuPrincipal(Scanner sc) throws InterruptedException {
        System.out.println("\n====== CALCULADORA BRESSAN ======\n");
        System.out.println("Desenvolvido por: Renato Ikeda Bressan");
        char option = 'X';
        String load = "...";
        HistoricoService historico = new HistoricoService("historico.txt");
        do {
            System.out.print("\n");
            System.out.println("A. Aba A: operações aritméticas");
            System.out.println("B. Aba B: operações sequenciais");
            System.out.println("C. Aba C: operações de comparação");
            System.out.println("D. Aba D: operações trigonométricas");
            System.out.println("E. Aba E: operações numéricas");
            System.out.println("F. Aba F: operações estatísticas");
            System.out.println("G. Aba G: operações vetoriais/matriciais");
            System.out.println("0. Encerrar o programa");
            System.out.println("1. Carregar histórico");
            System.out.println("2. Limpar histórico");
            System.out.print("\nSelecione uma das opcoes acima: ");
            option = Character.toUpperCase(sc.next().charAt(0));
            switch (option) {
                case 'A':
                    System.out.print("\nAbrindo a aba A");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.print("\n");
                    AbaA.executarAbaA(sc);
                    break;
                case 'B':
                    System.out.print("\nAbrindo a aba B");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.print("\n");
                    AbaB.executarAbaB(sc);
                    break;
                case 'C':
                    System.out.print("\nAbrindo a aba C");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.print("\n");
                    AbaC.executarAbaC(sc);
                    break;
                case 'D':
                    System.out.print("\nAbrindo a aba D");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.print("\n");
                    AbaD.executarAbaD(sc);
                    break;
                case 'E':
                    System.out.print("\nAbrindo a aba E");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.print("\n");
                    AbaE.executarAbaE(sc);
                    break;
                case 'F':
                    System.out.print("\nAbrindo a aba F");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.print("\n");
                    AbaF.executarAbaF(sc);
                    break;
                case 'G':
                    System.out.print("\nAbrindo a aba G");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.print("\n");
                    AbaG.executarAbaG(sc);
                    break;
                case '0':
                    System.out.print("\nEncerrando o programa");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.println("\n");
                    break;
                case '1':
                    System.out.print("\nCarregando o histórico");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.println("\n");
                    try {
                        historico.carregarHistorico();
                    } catch (IOException e) {
                        System.out.println("\nErro ao carregar histórico!\n");
                    }
                    break;
                case '2':
                    System.out.print("\nLimpando o histórico");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.println("\n");
                    try {
                        historico.limparHistorico();
                        System.out.println("\nHistórico limpo com sucesso!\n");
                    } catch (IOException e) {
                        System.out.println("\nErro ao limpar histórico!\n");
                    }
                    break;
                default:
                    System.out.print("\nOpção " + option + " inválida!\n\nRetornando ao menu principal");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.print("\n");
                    sc.nextLine();
            }
        } while (option != '0');
    }
}