package com.renato.calculadora.service;
import com.renato.calculadora.model.TipoUnidade;

public class ConversorService {
    public ConversorService() {
    }
    public double converterMedida(double valor, TipoUnidade unitInicial, TipoUnidade unitFinal) {
        if (!(unitInicial.getTipo()).equals(unitFinal.getTipo())) throw new IllegalArgumentException("\nUnidades incompatíveis!\n");
        double base = valor * unitInicial.getFator();
        return base / unitFinal.getFator();
    }
}