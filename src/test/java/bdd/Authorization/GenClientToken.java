package bdd.Authorization;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class GenClientToken {


    public static void main(String[] args) {

        String clientTokenResponse = given().headers("Authorization", "Bearer " + GenAccessToken.generateAccessToken()).
                headers("Content-Type", "application/json").
                contentType(ContentType.JSON).
                when().log().all().
                post("https://api-m.sandbox.paypal.com/v1/identity/generate-token")
                .then().log().all().statusCode(200).extract().response().asString();

        JsonPath js = new JsonPath(clientTokenResponse);
        String client_token = js.getString("client_token");

        System.out.println(client_token);



    }
}
