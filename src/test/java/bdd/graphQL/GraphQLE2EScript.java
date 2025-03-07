package bdd.graphQL;

import org.testng.Assert;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;

public class GraphQLE2EScript {

    public static void main(String[] args) {

    String response =
      given().log().all().
              header("Content-Type",
                      "application/json").body("{\"query\":\"query ($id: ID!, $page: Int!) {\\n  character(id: $id) {\\n    id\\n    name\\n    status\\n    type\\n    gender\\n  }\\n  episodes(page: $page) {\\n    info {\\n      count\\n      pages\\n      next\\n      prev\\n    }\\n  }\\n  location(id: $id) {\\n    id\\n    name\\n    type\\n    dimension\\n    created\\n  }\\n}\\n\",\"variables\":{\"id\":\"10\",\"page\":3},\"extensions\":{}}\n").
              when().post("https://rickandmortyapi.com/graphql")
              .then().extract().response().asString();

        System.out.println(response);

        JsonPath jsonPath = new JsonPath(response);
        String characterName =  jsonPath.getString("data.character.name");
        Assert.assertEquals(characterName,"Alan Rails");
    }
}
