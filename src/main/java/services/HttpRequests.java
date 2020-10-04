package services;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class HttpRequests {

    public static String executeGet(RequestSpecification spec, String uri, int statusCode) {

        return given()
                .spec(spec)
                .when()
                .get(uri)
                .then()
                .assertThat()
                .statusCode(statusCode)
                .extract()
                .body()
                .asString();
    }
}
