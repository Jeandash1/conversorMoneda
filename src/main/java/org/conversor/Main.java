package org.conversor;

import java.util.Scanner;

import org.conversor.models.Moneda;

public class Main {
    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);

        BuscarMoneda buscar = new BuscarMoneda();
        System.out.println("--  Bienvenido al conversor de monedas  -- \n");

        System.out.println("Escriba el tipo de cambio que desea consultar: \n" + 
            "ARS\tPeso argentino\n" +
            "AUD\tDólar australiano\n" +
            "BRL\tReal brasileñon \n" +
            "CAD\tDólar canadiense\n" +
            "CLP\tPeso chileno\n" +
            "COP\tPeso colombiano\n" +
            "CUP\tPeso cubano\n" +
            "EUR\tUnión Europea\n" +
            "HKD\tDólar de Hong Kong\n" +
            "INR\tRupia india\n" +
            "JPY\tYen japonés\n" +
            "MXN\tPeso mexicano\n" +
            "PEN\tSol peruano\n" +
            "RUB\tRublo ruso\n" +
            "USD\tDólar estadounidense\n" +
            "UYU\tPeso uruguayo\n" 
        );

        try{
            System.out.println("Escriba el tipo de cambio: ");
            var base_code = escribir.nextLine();

            System.out.println("Escriba la moneda que desa convertir");
            var target_code = escribir.nextLine();

            System.out.println("Escriba el valor que desea convertir ");
            var conversion_rate = Double.valueOf(escribir.nextDouble());

            Moneda moneda = buscar.moneda(base_code, target_code, conversion_rate, 0);
            System.out.println(moneda);

        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        

    }
}