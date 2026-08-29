import java.util.HashMap;
import java.util.Map;

class CountryCapital {

    public static void main(String[] args) {
        // 1. Create a HashMap called countryCapitals
        Map<String, String> countryCapitals = new HashMap<>();

        // 2. Add entries
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("India", "New Delhi");

        // 3. Retrieve the capital of France and print it
        String capitalOfFrance = countryCapitals.get("France");
        System.out.println("Capital of France: " + capitalOfFrance);

        // 4. Check Germany
        if (!countryCapitals.containsKey("Germany")) {
            System.out.println("Not found");
        }

        // 5. Remove France
        countryCapitals.remove("France");

        // 6. Check if France exists
        if (countryCapitals.containsKey("France")) {
            System.out.println("Exists");
        } else {
            System.out.println("Not exists");
        }
    }
}