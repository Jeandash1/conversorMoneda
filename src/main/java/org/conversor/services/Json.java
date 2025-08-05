package org.conversor.services;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json {
    public void guardarJson(GuardarConversion resultado) throws IOException{

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String nombreArchivo = "conversion_" + resultado.hashCode() + ".json";

        FileWriter archivo = new FileWriter(nombreArchivo + ".json");
        archivo.write(gson.toJson(nombreArchivo));
        archivo.close();
    }
}
