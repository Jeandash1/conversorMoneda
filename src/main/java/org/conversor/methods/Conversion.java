package org.conversor.methods;

import org.conversor.models.Moneda;

public class Conversion {
    public double convertir(Moneda moneda, String destino, double tasaCambio) {
        double tasa = moneda.conversion_rates().get(destino.toUpperCase());
        

        if (tasa == 0) {
            throw new IllegalArgumentException("Tasa de cambio no disponible para la conversión de " + tasa + " a " + destino);

        }
        return tasa * tasaCambio;
    }  
}
