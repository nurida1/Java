package day14_StringClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class StringManipulations3 {

    public static void main(String[] args) {
        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        //equals
        System.out.println(str1.equals(str2));  //false

        //equalsIgnoreCase
        System.out.println(str1.equalsIgnoreCase(str2));  //true, ignores case sensitivity

        //contains
        String s1 = "Cybertek School";

        boolean r1 = s1.contains("school");  //true
        System.out.println(r1);

//startsWith

        System.out.println("==============================");

        String s3 = "United States";
        System.out.println(s3.startsWith("U")); //true

        String s4 = "Cybertek School";
        System.out.println(s4.endsWith("l")); // true
        System.out.println(s4.endsWith("School"));  //true

        System.out.println(s4.endsWith("Cybertek")); //false

        System.out.println("=========================");
/*
every single gmail address ends with @gmail.com
 */
        String email = "CybertekSchool@Yahoo.com";
        if (email.endsWith("gmail.com")) {
            System.out.println("valid Gmail");
        } else {
            System.out.println("Invalid gmail");
        }



    }
}



