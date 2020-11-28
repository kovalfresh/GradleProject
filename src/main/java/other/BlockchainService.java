package other;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import services.HttpRequests;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class BlockchainService {

    private static String baseUri = "https://api.blockchain.info/";
    private static final RequestSpecification SPECIFICATION = new RequestSpecBuilder().setBaseUri(baseUri).build();
    private ObjectMapper objectMapper = new ObjectMapper();

    public ArrayList getListOfY() {

        ArrayList y = new ArrayList();
        BlockchainDay blockchainDay = null;
        blockchainDay = readValue(HttpRequests.executeGet(SPECIFICATION,"charts/market-price?timespan=30days&format=json", 200), BlockchainDay.class);

        for (int i = 0; i < 30; i++) {
            y.add(i, blockchainDay.getValues().get(i).getY());
        }

        Collections.reverse(y);
        return y;
    }

    private BlockchainDay readValue(String response, Class valueType) {

        BlockchainDay blockchainDay = null;

        try {
            blockchainDay = (BlockchainDay) objectMapper.readValue(response, valueType);
        } catch (IOException e) {
            e.printStackTrace();
        }
            return blockchainDay;
    }

}
