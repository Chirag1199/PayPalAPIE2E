package bdd.paypalAPIE2E;

import bdd.pojo.Orders;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Main {

    public static void main(String[] args) {


       String response = given().log().all()
                .header("Content-Type", "application/json")
                .when().post("https://api-m.sandbox.paypal.com/v2/checkout/orders").then().extract().response().asString();

        System.out.println(response);



    }


}
