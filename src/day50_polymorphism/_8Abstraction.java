package day50_polymorphism;

interface I {
    void method2(); //public abstract
    //abstract void method3();
    abstract int method3();


}

abstract class A {
    public abstract void method1();

}




public class _8Abstraction { //hiding implementation details
                             //Concentrating on essentials/importance, without worrying the details
                             //2 ways to achieve Abstraction:
                             //1) Abstract  2) Interface
    /*

    Classes dessigned for browser:
    WebDriver:
        get():
        quit():

    ChromeDriver implements WebDriver:
        get():  opens from chrome
        quit(): closes the chrome only

    FireFoxDriver implements WebDriver:
        get():  opens from firefox
        quit(): closes the firefox only

    OperaDriver implements WebDriver:
        get():  opens from Opera
        quit(): closes the Opera only

        //ignore implementation details(without body) by providing abstract
        //abstract methods meant to be overriden

    abstract method: method without body
             meant to be override (cannot be final, static, private)

                    there are ONLY two ways to achieve abstraction:
                    1. abstract class: not concrete, cannot create object
                                       meant to be inherited (cannot be final)


                    2. Interface: we can implement multiple interfaces to a class (CANNOT BE FINAL)
                                  everything has public access modifier by default
                                  we can only have:
                                                variables: by default static and final
                                                methods: abstract method, static method, default method
                                                we cannot have: constructor, instance variables, instance methods, no blocks(static and instance)
       extends vs implements:
       class        extends      class
       interfaces   extends      interface
       class        implements   interface

       class extends class implements I1, I2 ...



     */

    //public abstract void method1(); u cannot create abstract method, because the class is not abstract





}
