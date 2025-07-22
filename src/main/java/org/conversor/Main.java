package org.conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner escribir = new Scanner(System.in);

        BuscarMoneda buscar = new BuscarMoneda();
        System.out.println("--  Bienvenido al conversor de monedas  -- \n");

        System.out.println("Escriba el tipo de cambio que desea consultar: \n" + "DEA\tDirham de los Emiratos Árabes Unidos\n" +
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
                "KYD\tDólar de las Islas Caimán\n" +
                "MXN\tPeso mexicano\n" +
                "PEN\tSol peruano\n" +
                "RUB\tRublo ruso\n" +
                "USD\tDólar estadounidense\n" +
                "UYU\tPeso uruguayo\n" +
                "XCD\tDólar del Caribe Oriental\n" +
                "ZAR\tRand sudafricano\tSudáfrica\r\n"

        );

        System.out.println("Escriba el tipo de cambio: ");

    }
}