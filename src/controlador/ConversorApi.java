package controlador;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelo.Divisas;
import modelo.DivisasApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorApi {

    public static Divisas conversorDivisa (String divisaInicial, String divisaFinal, int valor_join) throws IOException, InterruptedException {

        try{
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/542579414d5a6a36ec8b0604/pair/"+divisaInicial+"/"+divisaFinal);

            HttpResponse<String> response;
            try (HttpClient client = HttpClient.newHttpClient()){
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(direccion)
                        .build();

                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            }

            Gson gson = (new GsonBuilder()).
                    setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .setPrettyPrinting()
                    .create();
            String json = response.body();
            DivisasApi miDivisa = gson.fromJson(json, DivisasApi.class);

            return new Divisas(miDivisa, valor_join);

        } catch (NumberFormatException var12) {
            System.out.println("Ocurrio un error");
            System.out.println(var12.getMessage());
        } catch (IllegalArgumentException var13) {
            System.out.println("Error de la URI, verifique la direccion.");
        } catch (DivisasException var14) {
            System.out.println(var14.getMessage());
        }
        return null;
    }
}
