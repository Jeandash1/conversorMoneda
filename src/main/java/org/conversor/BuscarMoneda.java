package org.conversor;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarMoneda {
    //public moneda buscar() {


    // se usa la API para obtener el tipo de cambio de con "pair y de ultimas el valor que desea convertir"
    String direccion = "https://v6.exchangerate-api.com/v6/c481330cf6a923e607df8780/pair/" + "USD/COP/200";

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(java.net.URI.create(direccion))
            .build();

    HttpResponse<String> response = null;

        /*try {


            return new Gson().fromJson(response.body(), moneda.class);

        }catch (IOException e) {

            throw new RuntimeException(e);

        }*/

    //}
}
