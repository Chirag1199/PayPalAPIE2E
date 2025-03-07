package bdd.Orders;

import bdd.Authorization.GenAccessToken;
import bdd.body.BodyJSONRequest;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import static io.restassured.RestAssured.given;

public class CreateOrder {

    public static String orderID(){

        String create_order_response = given().headers("Authorization", "Bearer " + GenAccessToken.generateAccessToken()).
                headers("Content-Type", "application/json").
                contentType(ContentType.JSON).
                body(BodyJSONRequest.checkOutOrderBody()).
                when().log().all().
                post("https://api-m.sandbox.paypal.com/v2/checkout/orders")
                .then().log().all().statusCode(201).extract().response().asString();

        System.out.println(create_order_response);

        JsonPath js2 = new JsonPath(create_order_response);
        String orderID = js2.getString("id");
        return orderID;

    }
}
