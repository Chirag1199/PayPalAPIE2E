package bdd.body;

public class BodyJSONRequest {

    public static String checkOutOrderBody(){

        return "{\n" +
                "    \"intent\": \"CAPTURE\",\n" +
                "    \"purchase_units\": [\n" +
                "        {\n" +
                "            \"amount\": {\n" +
                "                \"currency_code\": \"USD\",\n" +
                "                \"value\": \"100.00\"\n" +
                "            }\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

}
