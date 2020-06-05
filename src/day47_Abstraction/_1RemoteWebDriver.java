package day47_Abstraction;

public abstract class _1RemoteWebDriver {
    //public FINAL class RemoveWebDriver { YOU CANNOT USE FINAL

    protected abstract void get(String URL); //public protected default, in sub class same or more visible
    //PRIVATE abstract void get(String URL);       YOU CANNOT OVERRIDE
    //public abstract STATIC void get(String URL); YOU CANNOT USE OVERRIDE
    //public abstract FINAL void get(String URL);  YOU CANNOT USE OVERRIDE

    public abstract void quit(); //public or protected for quit method. Should be abstract to hide implementation



}






