
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.IOException;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class JsonJava {
    public static void main(String[] args) 
		    throws MalformedURLException, IOException, JsonException{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode parser = mapper.readTree(new URL("https://jsonplaceholder.typicode.com/users/"));
        for (Iterator<JsonNode> i = parser.iterator(); i.hasNext();) {
		JsonNode noh = i.next();
            System.out.println("==========================");
            System.out.println(noh.path("id").asLong());
            System.out.println(noh.path("name").asText());
            System.out.println(noh.path("email").asText());
            System.out.println("==========================");
        }
        
        Reader reader = Files.newBufferedReader(Paths.get("https://jsonplaceholder.typicode.com/comments/"));
        JsonObject  parser2 = (JsonObject) Jsoner.deserialize(reader);
        JsonArray comentarios = (JsonArray) parser2.get("postId");
        comentarios.forEach(System.out::println);
    }
}
