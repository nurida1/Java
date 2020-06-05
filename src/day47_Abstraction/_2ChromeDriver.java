package day47_Abstraction;

public final class _2ChromeDriver extends _1RemoteWebDriver { //it's red because to remind to override the method in RemoteWebDriver class
    //in regular class u don't need abstract, only methods with body
    //final because I don't want it to be inherited to other classes, so it cannot be extended by other classes

    @Override
    public void get(String URL) { //in ovverriding return type (void) should be same . Protected type cannot use in different package, only if sub class
        System.out.println("Opening " + URL + " in chrome browser");

    }
    //Am I going to create an object from class?
//if yes - cannot be abstract
//if no - can be abstarct class

    //abstract is not concrete
    //object should be concrete, from the body that is actually exist and implementation is not hidden

    @Override
    public void quit () {
        System.out.println("Closing the chrome browser");
    }




}
