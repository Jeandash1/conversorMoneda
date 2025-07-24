package org.conversor.methods;

import org.conversor.models.Moneda;

public class Conversion {
    
    public double convertir(String base_code, String destino, double tasaCambio){
        Moneda moneda = new Moneda(base_code, null);
        
        Double tasa = moneda.conversion_rates().get(destino);

        if (tasa == null) {
            throw new IllegalArgumentException("Tasa de cambio no disponible para la conversión de " + base_code + " a " + destino);

        }
        return tasa * tasaCambio;
    }
    
}
