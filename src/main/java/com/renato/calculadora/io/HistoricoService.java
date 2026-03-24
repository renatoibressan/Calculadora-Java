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
    // public void carregarHistorico() throws IOException {
    // }
}