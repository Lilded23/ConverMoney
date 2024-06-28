import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientService {
    private String apiKey = "aa85940a46e837b123c8638e";

    public HttpClientService() {
    }
    public String getExchangeRate(String baseCurrency){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(" https://v6.exchangerate-api.com/v6/aa85940a46e837b123c8638e/latest/"+baseCurrency))
                .build();
        try {
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            return response.body();
        }catch (Exception e){
            return "Error al cargar los datos de la API ";
        }
    }

}
