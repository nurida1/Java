package day14_StringClass;

public class practise {
    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail); //true

        if (result) {
            System.out.println("Logged in");
        }

        System.out.println("=================================");
        /*
        valid password MUST contain a special characters such as (!, _, $)
        valid password should not contain spaces
         */

        String PassWord = "mmasd 1235";
        if (PassWord.contains(" ")) {
            System.out.println("Password cannot have space in it");
        } else {
            System.out.println("valid password");
//starts with
            System.out.println("=================================");
            /*
            every website has "www." at the beginning of the web address
            */

            String webAddress = "Www.amazon.com";
                    webAddress = webAddress.toLowerCase();

            if (webAddress.startsWith("www.")) {
                                 //true
                System.out.println("valid");
            }
        }
    }
}
