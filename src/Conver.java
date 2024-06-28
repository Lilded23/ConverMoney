import com.google.gson.*;

public class Conver {

    public Conver() {
    }

    public double converCurrency(String baseCurremcy, String targertCurrency){
        HttpClientService httpClientService = new HttpClientService();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        JsonObject apiBody = (JsonObject) JsonParser.parseString(httpClientService.getExchangeRate(baseCurremcy));
       // System.out.println(apiBody);
        double value = 0.0;

        if (apiBody.has("conversion_rates")){
            //se esta accediendo al json y buscando por la clave
            JsonObject  converRate = apiBody.getAsJsonObject("conversion_rates");
            if (converRate.has(targertCurrency)){
                return value=converRate.get(targertCurrency).getAsDouble();
            }
        }
        return value;
    }
}
