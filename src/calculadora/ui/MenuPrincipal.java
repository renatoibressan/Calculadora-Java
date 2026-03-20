package calculadora.ui;
import java.util.Scanner;

public class MenuPrincipal {
    public static void executarMenuPrincipal(Scanner sc) throws InterruptedException {
        System.out.println("\n====== CALCULADORA BRESSAN ======\n");
        System.out.println("Desenvolvido por: Renato Ikeda Bressan");
        char option = 'X';
        String load = "...";
        do {
            System.out.print("\n");
            System.out.println("A. Aba A: operacoes aritmeticas");
            System.out.println("B. Aba B: operacoes sequenciais");
            System.out.println("C. Aba C: operacoes de comparacao");
            System.out.println("D. Aba D: operacoes trigonometricas");
            System.out.println("E. Aba E: operacoes teoricas");
            System.out.println("F. Aba F: operacoes estatisticas");
            System.out.println("0. Encerrar o programa");
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
                case '0':
                    System.out.print("\nEncerrando o programa");
                    Thread.sleep(750);
                    for (char c : load.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(150);
                    }
                    System.out.print("\n");
                    break;
                default:
                    System.out.print("\nOpcao " + option + " invalida!\n\nRetornando ao menu principal");
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