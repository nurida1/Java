package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;
//put(key, value)
public class Map_intro {
    public static void main(String[] args) {
        Map<String, Double> employeeInfo = new LinkedHashMap<>();

        //to put:
        employeeInfo.put("Zarina", 120_000.00); //size =1, because they are paired
        employeeInfo.put("Bakhodir", 110_000.50);// now size = 2 there are two pairs
        System.out.println("employeeInfo = " + employeeInfo); //employeeInfo = {Zarina=120000.0, Bakhodir=110000.5}
        System.out.println(employeeInfo.size()); //2

        //to get salary:
        //employeeInfo.get(0); // u need to give a key to get salary
        System.out.println(employeeInfo.get("Zarina")); //120_000.00
        System.out.println(employeeInfo.get("Bakhodir")); //110_000.00
        //in Map you don't have index, you have key

        //to remove second person:
        System.out.println(employeeInfo.remove("Bakhodir"));
        System.out.println(employeeInfo); //{Zarina=120000.0}
        System.out.println(employeeInfo.size()); //1
        //size is dynamic

        //map doesn't accept duplicates: removes previous matchin key , and safe last inserted one
        employeeInfo.put("Zarina", 130_000.0); //
        System.out.println(employeeInfo); //{Zarina=130000.0}

    }

}
