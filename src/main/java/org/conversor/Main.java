package org.conversor;

import java.util.Scanner;
import org.conversor.models.Moneda;

public class Main {
    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);

        BuscarMoneda buscar = new BuscarMoneda();
        System.out.println("--  Bienvenido al conversor de monedas  -- \n");
        
        int opcion = 0; // Valor para salir del bucle
        while (opcion != 7) {
            System.out.println("""
            *****************************************
            
            Bienvenido al conversor de monedas.

            1) Dolar -> Peso argentino
            2) Dolar -> Peso Colombiano
            3) Real Brasileño -> Dolar
            4) Peso Mexicano -> Peso Colombiano
            5) Dolar -> Euro
            6) Peso argentino -> Real Brasileño
            7) Salir

            ******************************************
            """);

            System.out.println("Seleccione una opción valida: ");
            opcion = escribir.nextInt();

            if (opcion == 7) {
                System.out.println("Gracias por usar el converson de monedas :)");
            }

            switch (opcion) {
                case 1:
                    base_code = "USD";
                    destino = "ARS";

                    break;
                case 2:
                    base_code = "USD";
                    destino = "COP";
                    break;
                case 3:
                    base_code = "BRL";
                    destino = "USD";
                    break;
                case 4:
                    base_code = "MXN";
                    destino = "COP";
                    break;
                case 5:
                    base_code = "USD";
                    destino = "EUR";
                    break;
                default:
                System.out.println("Por favor, seleccione una opción válida.");
                continue;
            }

            try{
                System.out.println("Escriba el tipo de cambio: ");
                var base_code = escribir.nextLine();

                Moneda moneda = buscar.moneda(base_code);
                System.out.println(moneda);

                Json archivo = new Json();
                archivo.guardarJson(moneda);

            }catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }            
        }
    }
}