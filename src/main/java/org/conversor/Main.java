package org.conversor;

import java.util.Scanner;

import org.conversor.models.Moneda;

public class Main {
    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);

        BuscarMoneda buscar = new BuscarMoneda();
        System.out.println("--  Bienvenido al conversor de monedas  -- \n");

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