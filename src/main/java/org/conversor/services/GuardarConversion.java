package org.conversor.services;

public class GuardarConversion {
    private String base;
    private String destino;
    private double tasaCambio;
    private double resultado;

    public GuardarConversion(String base, String destino, double tasaCambio, double resultado) {
        this.base = base;
        this.destino = destino;
        this.tasaCambio = tasaCambio;
        this.resultado = resultado;
    }
    
}
