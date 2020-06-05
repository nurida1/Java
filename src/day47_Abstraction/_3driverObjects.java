package day47_Abstraction;

import javax.xml.bind.SchemaOutputResolver;

public class _3driverObjects {

    public static void main(String[] args) {
//        String URL = "https://www.google.com";
//        _1ChromeDriver driver = new _1ChromeDriver();
//                        driver.get("https:");
//

        _2ChromeDriver driver = new _2ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

        System.out.println("====================================");

        _4FirefoxDriver driver2 = new _4FirefoxDriver();
        driver2.get("https://www.goolge.com");
        driver2.quit();

        System.out.println("=====================================");
        _5OperaDriver driver3 = new _5OperaDriver();
        driver3.get("https://www.google.com");
        driver3.quit();


    }
}
