package com.renato.calculadora.model;

public enum TipoUnidade {
    S(1.0, "tempo"),
    MIN(60.0, "tempo"),
    H(3600.0, "tempo"),
    MM(0.001, "comprimento"),
    CM(0.01, "comprimento"),
    M(1.0, "comprimento"),
    KM(1000.0, "comprimento"),
    CM2(0.0001, "area"),
    M2(1.0, "area"),
    KM2(1000000.0, "area"),
    CM3(0.000001, "volume"),
    M3(1.0, "volume"),
    ML(0.001, "capacidade"),
    L(1.0, "capacidade"),
    G(0.001, "massa"),
    KG(1.0, "massa"),
    T(1000.0, "massa");
    private final double fator;
    private final String tipo;
    TipoUnidade(double fator, String tipo) {
        this.fator = fator;
        this.tipo = tipo;
    }
    public double getFator() {
        return fator;
    }
    public String getTipo() {
        return tipo;
    }
    public static TipoUnidade medida(String unit) {
        switch (unit.toLowerCase()) {
            case "s": return S;
            case "min": return MIN;
            case "h": return H;
            case "mm": return MM;
            case "cm": return CM;
            case "m": return M;
            case "km": return KM;
            case "cm2": return CM2;
            case "m2": return M2;
            case "km2": return KM2;
            case "cm3": return CM3;
            case "m3": return M3;
            case "ml": return ML;
            case "l": return L;
            case "g": return G;
            case "kg": return KG;
            case "t": return T;
            default: throw new IllegalArgumentException("\nUnidade de medida inexistente!\n");
        }
    }
}