package com.renato.calculadora.io;
import java.io.*;

public class HistoricoService {
    private String caminhoArquivo;
    public HistoricoService(String nomeArquivo) {
        this.caminhoArquivo = nomeArquivo;
    }
    public void salvarRegistro(String registro) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            writer.write(registro);
            writer.newLine();
        }
    }
     public void carregarHistorico() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println("\n" + linha + "\n");
                System.out.println("--------------------------------------------------------------");
            }
        }
    }
}