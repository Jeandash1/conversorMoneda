package org.conversor;

import java.util.Scanner;
import org.conversor.methods.Conversion;
import org.conversor.models.Moneda;
import org.conversor.services.GuardarConversion;
import org.conversor.services.Json;

public class Main {
    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);

        Conversion conversion = new Conversion();
        BuscarMoneda buscar = new BuscarMoneda();
        
        System.out.println("--  Bienvenido al conversor de monedas  -- \n");
        
        int opcion = 0; // Valor para salir del bucle
        while (opcion != 6) {
            System.out.println("""
            *****************************************
            
            Bienvenido al conversor de monedas.

            1) Dolar -> Peso argentino
            2) Dolar -> Peso Colombiano
            3) Real Brasileño -> Dolar
            4) Peso Mexicano -> Peso Colombiano
            5) Dolar -> Euro
            6) Salir

            ******************************************
            """);

            System.out.println("Seleccione una opción qeu se le da ej(1): ");
            opcion = escribir.nextInt();

            if(opcion == 6) {
                System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                return; // Salir del programa
            }
            String base = "", destino = ""; 
            switch (opcion) {
                case 1:
                    base = "USD";
                    destino = "ARS";

                    break;
                case 2:
                    base = "USD";
                    destino = "COP";
                    break;
                case 3:
                    base = "BRL";
                    destino = "USD";
                    break;
                case 4:
                    base = "MXN";
                    destino = "COP";
                    break;
                case 5:
                    base = "USD";
                    destino = "EUR";
                    break;
                default:
                System.out.println("Por favor, seleccione una opción válida.");
                break;
            }
            try{
                System.out.println("Ingrese la cantidad a convertir en %s: " +  base);
                double tasaCambio = escribir.nextDouble();

                Moneda moneda = buscar.moneda(base, tasaCambio);
                double resultado = conversion.convertir(moneda, destino, tasaCambio);
                System.out.printf("El resultado de la conversión de %.2f %s a %s es: %.2f%n", tasaCambio, base, destino, resultado);

                GuardarConversion data = new GuardarConversion(base, destino, tasaCambio, resultado);
                Json archivo = new Json();
                archivo.guardarJson(data);

            }catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }            
        }
    }
}