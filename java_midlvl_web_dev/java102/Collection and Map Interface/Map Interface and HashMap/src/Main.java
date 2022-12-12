import java.util.HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();

        country.put("TR", "Türkiye");
        country.put("GR", "Germany");
        country.put("EN", "England");

        // country.remove("EN");
        // System.out.println(country.get("EN"));

        for (String countryKey : country.keySet()) {
            System.out.println(countryKey);
        }

        for (String countryValue : country.values()) {
            System.out.println(countryValue);
        }
        
        for (String countryKeyValue : country.keySet()) {
            System.out.println("Key: " + countryKeyValue + ", Value: " + country.get(countryKeyValue));
        }
    }
}