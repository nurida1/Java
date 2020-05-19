package day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {
        //substring -// substring (beginning index, ending index);ending index is excluded
        String str = "Cybertek School is the best";
        //            012345678


        String schoolName = str.substring(0,8);
        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
        //                 012345678910..
        String firstName = fullName.substring(0,6);
        String lastName = fullName.substring(7,11+1);
        System.out.println(firstName);
        System.out.println(lastName);

        //full name = first name last name
        //gmail: lastName_firstname@gmail.com

        String Nurida = "Nurida Nurmambetova";
//                       0123456789...
        String firstname= Nurida.substring(0,6+1);
        String lastname = Nurida.substring(7,18+1);

        System.out.println(firstname);
        System.out.println(lastname);

     //   String gmail = lastname.concat("_").concat(firstname).concat("@gmail.com");
       String gmail = lastname+"_"+firstname+"@gmail.com";
        System.out.println(gmail);

        String s1 = "I love Java Programming Language";
        //           012345678..
            String classname = s1.substring(7);
            System.out.println(classname);

      //replace
        String s2 = "I like C# Programming C# C#";
               s2 = s2.replace("C#","Java");
            System.out.println(s2);

        String name = "COVID 18";
            name =  name.replace("8","9");
            System.out.println(name);
//replaceFirst
        String r1 = "I like C#, C# is fun, C# is cool";
        r1 =r1.replaceFirst("C#", "Java");
        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);







    }


}
