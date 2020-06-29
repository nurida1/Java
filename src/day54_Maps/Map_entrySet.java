package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_entrySet {

    public static void main(String[] args) {
        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        countries.put("Tajikistan", "Dushanbe");
        countries.put("Kyrgyzstan", "Bishkek");
        countries.put("East Turkistan", "Urumqi");
        countries.put("USA", "Washington DC");
        countries.put("Pakistan", "Islamabad");

        //entrySet()

        String input = "usa";
        for ( Map.Entry<String, String> each :  countries.entrySet() ) {
           //System.out.println( each.getKey() + "'s, capital is: " + each.getValue());
            String countryName = each.getKey(); //get countries' name
            String cityName = each.getValue(); //get cities' name

            if (input.equalsIgnoreCase(countryName)) {
                System.out.println(cityName);
            }
        }
    }
        //Entry - is aplicable only for Maps

}
