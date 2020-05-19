package day25_MethodsRecap;
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
    //getDriver1(); //method is passing a parameter, argument is mandatory

        String str = getDriver1("Cybertek");  //FIREFOX
 //     System.out.println(str);  or u can put print st-t in return statement, but it is not necessary
        System.out.println(str);

        String str2 = getDriver2("ChRoMe");
        System.out.println(str2);

        String str3 = getDriver3("FireFox");
        System.out.println(str3);

    }
// USE SWITCH ST-T:
    public static String getDriver1 (String browserName) {
        String result = "";
               //FIREFOX
        switch (browserName.toLowerCase().replace(" ", "")) {  //"ChromE".toLowerCase() ==> chrome   // u cannot use ignorecase- boolean expression. " " and "" to remove empty string
            case "chrome": result = "Chrome Driver";  //if upper case change "chrome" to "CHROME".
                            break;

            case "firefox": result = "Firefox Driver";
                            break;

            case "safari": result = "Safari Driver";
                            break;

            case "opera": result = "Opera Driver";
                          break;

            case "edge": result = "Edge Driver";
                          break;

            default: result = "Invalid Driver";

        }
          //  System.out.println(result); u don't need it, u need to declare in main method
             return result; // because we declared String result to  get browsers

}

// USE ELSE IF ST-T:
    public static String getDriver2 (String browserName) {
        browserName = browserName.toLowerCase(); //ignored case sensitivity
        String result = "";
        if (browserName.equals("chrome")) {
            result = "Chrome Driver";
        } else if (browserName.equals("firefox")) {
            result = "Firefox Driver";
        } else if (browserName.equals("safari")) {
            result = "Safari Driver";
        } else if (browserName.equals("edge")) {
            result = "Edge Driver";
        } else if (browserName.equals("opera")) {
            result = "Opera Driver";
        }else {
            result = "Invalid Driver";
    }
            return result;
    }

// USE TERNARY
    // : () ?, :, ()?
    public static String getDriver3 (String browserName){
        browserName = browserName.toLowerCase();
        String result = (browserName.equals("chrome"))? "Chrome Driver"
                        : (browserName.equals("firefox"))? "Firefox Driver"
                        : (browserName.equals("safari"))? "Safari Driver"
                        : (browserName.equals("edge"))? ("Edge Driver")
                        : (browserName.equals("opera"))? ("Opera Driver")
                        : "Invalid Driver";

            return result;
    }

    // USE RETURN ST-T: instead of ELSE IF
    public static String getDriver4 (String browserName) {
        browserName = browserName.toLowerCase(); //ignored case sensitivity

        if (browserName.equals("chrome")) {
            return "Chrome Driver";
        } else if (browserName.equals("firefox")) {
            return "Firefox Driver";
        } else if (browserName.equals("safari")) {
            return "Safari Driver";
        } else if (browserName.equals("edge")) {
            return "Edge Driver";
        } else if (browserName.equals("opera")) {
            return"Opera Driver";
        }else {
            return "Invalid Driver";
        }
    }

    // USE RETURN ST-T: instead of SWITCH
    public static String getDriver5 (String browserName) {

        switch (browserName.toLowerCase().replace(" ", "")) {  //"ChromE".toLowerCase() ==> chrome   // u cannot use ignorecase- boolean expression. " " and "" to remove empty string
            case "chrome": return "Chrome Driver";  //if upper case change "chrome" to "CHROME".

            case "firefox": return  "Firefox Driver";

            case "safari": return "Safari Driver";

            case "opera": return "Opera Driver";

            case "edge": return "Edge Driver";

            default: return "Invalid Driver";

        }
    }

    // USE RETURN: instead of TERNARY
    // : () ?, :, ()?
    public static String getDriver6 (String browserName){
        browserName = browserName.toLowerCase();
        return (browserName.equals("chrome"))? "Chrome Driver"
                : (browserName.equals("firefox"))? "Firefox Driver"
                : (browserName.equals("safari"))? "Safari Driver"
                : (browserName.equals("edge"))? ("Edge Driver")
                : (browserName.equals("opera"))? ("Opera Driver")
                : "Invalid Driver";

    }
}


