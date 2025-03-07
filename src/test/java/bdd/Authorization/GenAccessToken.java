package bdd.Authorization;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import java.util.Base64;

import static io.restassured.RestAssured.given;

public class GenAccessToken {

    public static String generateAccessToken(){

        String clientId = "AUv8rrc_P-EbP2E0mpb49BV7rFt3Usr-vdUZO8VGOnjRehGHBXkSzchr37SYF2GNdQFYSp72jh5QUhzG";
        String clientSecret = "EMnAWe06ioGtouJs7gLYT9chK9-2jJ--7MKRXpI8FesmY_2Kp-d_7aCqff7M9moEJBvuXoBO4clKtY0v";
        String credentials = clientId + ":" + clientSecret;
        String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());

        String access_token_response = given().
                header("Authorization", "Basic " + encodedCredentials).
                contentType(ContentType.URLENC).
                formParams("grant_type", "client_credentials").
                when().log().all().
                post("https://api-m.sandbox.paypal.com/v1/oauth2/token").asString();


        System.out.println(access_token_response);
        JsonPath js1 = new JsonPath(access_token_response);
        return js1.getString("access_token");
    }
}
