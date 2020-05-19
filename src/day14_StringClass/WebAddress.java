package day14_StringClass;

/*write a program that can validate if a web address is valid
 valid web address:
 MUST start with www.
 Must ends with .com, or .edu, or .net, or .gov
                .COM      .EDU    .NET      .GOV
*/
public class WebAddress {

    public static void main(String[] args) {

        String website = "cybertek.www.com";
        website = website.toLowerCase();

        boolean validEnding = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov");

        if (website.startsWith("www") && validEnding) {
//            if (website.endsWith(".com")) {
            System.out.println("Valid address");
            } else {
            System.out.println("Invalid address");
        }
    }
}
