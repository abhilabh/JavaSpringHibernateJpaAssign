/*
 * Develop a java class with the following. 
 * a. Create a method String saveCountryCapital(String countryName, String capital) : 
 * The method should add the passed country and capital as key/value in the mapObj and 
 * b)return the appropriate value, try adding duplicate country name and capital.Key- Country Value - CapitalIndia DelhiJapan Tokyo
 *  Develop a method String getCapital(String countryName) which returns the capital for the country passed. 
 * If country is not available, then return ""No Country Found""
 * c. Develop a method String getCountry(String capitalName) which returns the country for the capital name. 
 * If capital is not available, then return ""No Capital Found""
 * d. Develop a method which iterates through the mapObj and creates another HashMap mapObj2 with Capital as the key and value as Country and returns the mapObj2 object.Key – Capital Value – Country   
 */

import java.util.HashMap;
import java.util.Map;

public class CountryCapitalMap {
    private Map<String, String> mapObj;

    public CountryCapitalMap() {
        this.mapObj = new HashMap<>();
    }

    public String saveCountryCapital(String countryName, String capital) {
        String previousCapital = mapObj.put(countryName, capital);
        if (previousCapital != null) {
            return "Updated capital for " + countryName + " is " + capital;
        } else {
            return "Added capital " + capital + " for " + countryName;
        }
    }

    public String getCapital(String countryName) {
        String capital = mapObj.get(countryName);
        if (capital != null) {
            return capital;
        } else {
            return "No Country Found";
        }
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : mapObj.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return "No Capital Found";
    }

    public Map<String, String> getCapitalCountryMap() {
        Map<String, String> mapObj2 = new HashMap<>();
        for (Map.Entry<String, String> entry : mapObj.entrySet()) {
            mapObj2.put(entry.getValue(), entry.getKey());
        }
        return mapObj2;
    }

    public static void main(String[] args) {
        CountryCapitalMap countryCapital = new CountryCapitalMap();

        // Add country and capital
        System.out.println(countryCapital.saveCountryCapital("India", "Delhi"));
        System.out.println(countryCapital.saveCountryCapital("Japan", "Tokyo"));

        // Add duplicate country and capital
        System.out.println(countryCapital.saveCountryCapital("India", "New Delhi"));

        // Get capital for a country
        System.out.println(countryCapital.getCapital("India"));
        System.out.println(countryCapital.getCapital("Japan"));
        System.out.println(countryCapital.getCapital("China"));

        // Get country for a capital
        System.out.println(countryCapital.getCountry("New Delhi"));
        System.out.println(countryCapital.getCountry("China"));

        // Get map with capital as key and country as value
        Map<String, String> capitalCountryMap = countryCapital.getCapitalCountryMap();
        for (Map.Entry<String, String> entry : capitalCountryMap.entrySet()) {
            System.out.println("Capital: " + entry.getKey() + ", Country: " + entry.getValue());
        }
    }
}
