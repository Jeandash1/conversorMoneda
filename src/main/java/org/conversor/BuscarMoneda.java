package org.conversor;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.conversor.models.Moneda;
import com.google.gson.Gson;

public class BuscarMoneda {

    public Moneda moneda(String base_code, String target_code, double conversion_rate, double conversion_result) {


        // se usa la API para obtener el tipo de cambio de con "pair y de ultimas el valor que desea convertir"
        String direccion = "https://v6.exchangerate-api.com/v6/c481330cf6a923e607df8780/pair/" + 
            base_code + "/" + target_code + "/" + conversion_rate;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create(direccion))
                .build();

        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        }catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error al buscar la moneda: " + e.getMessage(), e);

        }

    }

    
}
