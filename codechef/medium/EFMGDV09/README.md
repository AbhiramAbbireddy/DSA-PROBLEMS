# EFMGDV09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Country-Capital Mapping

Let's work on a problem based on  **`Hashmap`**  to enhance your knowledge. You are going to create a program that stores the capital cities of several countries. You will use a  **`HashMap`**  to `map` country names (as `String` keys) to their corresponding capital cities (as `String` values).

 **Task to perform:** 

- Create a HashMap: Create a HashMap called countryCapitals to store the country-capital mappings.
- Add entries: Add the following countries and their capitals to the countryCapitals HashMap: USA: Washington D.C. France: Paris Japan: Tokyo India: New Delhi
- Retrieve a capital: Retrieve the capital city of France and print it to the console.
- Handle missing entries: Try to retrieve the capital city of Germany. Since Germany is not in the HashMap, print "Not found".
- Remove a country: Remove "France" from the HashMap.
- Check if country exists: Check if "France" exists in the HashMap and print "Exists" if it does; otherwise, print "Not exists".

 **Output format:** 

```
Capital of France: Paris
Not found
Not exists

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T14:46:28.694Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV09)