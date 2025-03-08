package bdd.DeserializationTesting;

import bdd.Authorization.GenAccessToken;
import bdd.Orders.CreateOrder;
import bdd.Pojo.OrderDetails;

import static io.restassured.RestAssured.given;

public class ShowOrderAPITesting {

    public static void main(String[] args) {

        String orderID = CreateOrder.orderID();

        OrderDetails orderDetails = given().headers("Authorization", "Bearer " + GenAccessToken.generateAccessToken()).
                headers("Content-Type", "application/json").
                when().log().all().
                get("https://api-m.sandbox.paypal.com/v2/checkout/orders/" + orderID)
                .then().log().all().statusCode(200).extract().response().as(OrderDetails.class);

        /* The return type of .as(OrderDetails.class) is OrderDetails, which is a class type (not "class" itself) */

        System.out.println(orderDetails.getId());
        System.out.println(orderDetails.getStatus());
    }
}
