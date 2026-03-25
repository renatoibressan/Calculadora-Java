package com.renato.calculadora.service;
import com.renato.calculadora.model.UnidadeTemperatura;

public class TemperaturaService {
    public TemperaturaService() {
    }
    public double converterParaCelsius(double valor, UnidadeTemperatura unit) {
        switch (unit) {
            case CELSIUS: return valor;
            case FAHRENHEIT: return (valor - 32.0) / 1.8;
            case KELVIN: return valor - 273.15;
            default: throw new IllegalArgumentException("\nEscala inexistente!\n");
        }
    }
    public double converterDeCelsius(double valor, UnidadeTemperatura unit) {
        switch (unit) {
            case CELSIUS: return valor;
            case FAHRENHEIT: return valor * 1.8 + 32.0;
            case KELVIN: return valor + 273.15;
            default: throw new IllegalArgumentException("\nEscala inexistente!\n");
        }
    }
    public double converterTemperatura(double valor, UnidadeTemperatura unitInicial, UnidadeTemperatura unitFinal) {
        if (unitInicial == unitFinal) return valor;
        double valorCelsius = converterParaCelsius(valor, unitInicial);
        return converterDeCelsius(valorCelsius, unitFinal);
    }
}