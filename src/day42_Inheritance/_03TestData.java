package day42_Inheritance;

public class _03TestData extends _03Data {

    /*
    public
    default
    protected
     */

    public static void main(String[] args) {

        System.out.println( _03TestData.publicData );
        System.out.println( _03TestData.protectedData );
        System.out.println( _03TestData.defaultData );
//        System.out.println( _03TestData.privateData ); compile error, private can never be inherited
    }





}
