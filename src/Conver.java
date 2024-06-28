import com.google.gson.*;

public class Conver {

    public static double converCurrency(String baseCurremcy, String targertCurrency){
        HttpClientService httpClientService = new HttpClientService();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        JsonObject apiBody = (JsonObject) JsonParser.parseString(httpClientService.getExchangeRate(baseCurremcy));
        double value = 0.0;

        if (apiBody.has(targertCurrency)){
            
        }


    }
}
