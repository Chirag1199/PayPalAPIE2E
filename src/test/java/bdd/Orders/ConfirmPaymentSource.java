package bdd.Orders;

import bdd.Authorization.GenAccessToken;
import bdd.body.ConfirmPaymentBody;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class ConfirmPaymentSource {

    public static void main(String[] args) {

        String orderID = CreateOrder.orderID();

        String confirmPaymentResponse = given().headers("Authorization", "Bearer " + GenAccessToken.generateAccessToken()).
                headers("Content-Type", "application/json").
                body(ConfirmPaymentBody.bodyConfirmPaymentSoure()).
                when().log().all().
                post("https://api-m.sandbox.paypal.com/v2/checkout/orders/" + orderID + "/confirm-payment-source")
                .then().log().all().statusCode(200).extract().response().asString();

        JsonPath js = new JsonPath(confirmPaymentResponse);
        String status = js.getString("status");
        System.out.println(status);
    }
}
