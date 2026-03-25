package com.renato.calculadora.model;

public enum UnidadeTemperatura {
    CELSIUS,
    FAHRENHEIT,
    KELVIN;
    public static UnidadeTemperatura escala(char unit) {
        switch (Character.toUpperCase(unit)) {
            case 'C': return CELSIUS;
            case 'F': return FAHRENHEIT;
            case 'K': return KELVIN;
            default: throw new IllegalArgumentException("\nEscala inexistente!\n");
        }
    }
}