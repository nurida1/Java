package day42_Inheritance;

public class _04TestData2 extends _04Accessmodifiers {
/*
publicVariable
protectedVariable
defaultVariable

publicMethod()
protectedMethod()
defaultMethod()
 */
    public static void main(String[] args) {

        System.out.println( _04TestData2.publicVariable );
        System.out.println( _04TestData2.protectedVariable );
        System.out.println( _04TestData2.defaultVariable );
//        System.out.println( _04TestData2.private );

        _04TestData2.publicMethod();
        _04TestData2.protectedMethod();
        _04TestData2.defaultMethod();



    }


}
