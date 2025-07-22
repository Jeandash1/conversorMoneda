package org.conversor;

import java.io.FileWriter;
import java.io.IOException;
import org.conversor.models.Moneda;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json {
    public void guardarJson(Moneda moneda) throws IOException{

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter archivo = new FileWriter(moneda.base_code() + ".json");
        archivo.write(gson.toJson(moneda));
        archivo.close();
        
    }
}
