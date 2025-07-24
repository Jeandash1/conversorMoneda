package org.conversor;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import org.conversor.models.Moneda;
import com.google.gson.Gson;

public class BuscarMoneda {

    public Moneda moneda(String base_code, Map<String, Double> conversion_rates) {

        String direccion = "https://v6.exchangerate-api.com/v6/c481330cf6a923e607df8780/latest/USD";

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
