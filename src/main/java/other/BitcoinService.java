package other;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import services.HttpRequests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BitcoinService {

    private static String baseUri = "https://apiv2.bitcoinaverage.com/";
    private static final RequestSpecification SPECIFICATION = new RequestSpecBuilder().setBaseUri(baseUri).build();
    private ObjectMapper objectMapper = new ObjectMapper();

    public void getListOfAverages() {


        List<BitcoinDay> bitcoinDay = null;

            bitcoinDay = readValue(HttpRequests.executeGet(SPECIFICATION,"indices/global/history/BTCUSD?period=alltime", 200), BitcoinDay.class);

        for (int i = 0; i < 30; i++) {
            System.out.println("Average" + " " + (i+1) + " " + "=" + " " + bitcoinDay.get(i).getAverage());
        }
    }

        private List<BitcoinDay> readValue(String response, Class valueType) {

            List<BitcoinDay> bitcoinDay = null;

            try {
                bitcoinDay = objectMapper.readValue(response, objectMapper.getTypeFactory().constructCollectionType(List.class, valueType));
            } catch (IOException e) {
                e.printStackTrace();
            }

            return bitcoinDay;
        }
    }