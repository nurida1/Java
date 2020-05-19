package Practise.day25;
/*
1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
 */

public class Driver {
    public static void main(String[] args) {

    String str1 = getDriver1("chrome");
        System.out.println(str1);

        String str2 = getDriver2("fiReFox");
        System.out.println(str2);

        String str3 = getDriver3("OpERA");
        System.out.println(str3);
    }




    public static String getDriver1 (String browserName) {
        String result = "";

        switch (browserName.toLowerCase().replaceFirst(" ","")) {

            case ("chrome") :
               return  "Chrome Driver";
            case ("opera") :
                return  "Opera Driver";
            case ("firefox") :
                return  "Firefox Driver";


        }

        return  result; }

//If st-t
    public static String getDriver2 (String browserName) {
        browserName = browserName.toLowerCase();
        if (browserName.equals("chrome")) {
            return "Chrome Driver";
        }else if (browserName.equals("firefox")) {
            return "Firefox Driver";
        }else if (browserName.equals("safari")) {
           return"Safari Driver";
        }else if (browserName.equals("edge")) {
            return "Edge Driver";
        }else if (browserName.equals("opera")) {
            return "Opera Driver";
        }else {
            return "Invalid";
        }

    }
//Ternary:

    public static String getDriver3 (String browserName) {

        browserName = browserName.toLowerCase();
       return  (browserName.equals("chrome"))? "Chrome Driver"
                : (browserName.equals("firefox"))? "firefox Driver"
                :(browserName.equals("safari"))? "Safari Driver"
                :(browserName.equals("Edge"))? "Edge Driver"
                :(browserName.equals("opera"))? "Opera Driver"
                : "Invalid";

    }

}