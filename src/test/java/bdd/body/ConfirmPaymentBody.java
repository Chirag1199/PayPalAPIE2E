package bdd.body;

public class ConfirmPaymentBody {

    public static String bodyConfirmPaymentSoure(){

        return "{\n" +
                "    \"payment_source\": {\n" +
                "        \"card\": {\n" +
                "            \"number\": \"4111111111111111\",\n" +
                "            \"expiry\": \"2035-12\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }
}
