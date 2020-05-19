package day40_Encapsulation;

public class Person_Objects {

    public static void main(String[] args) {
        Person Zarina = new Person("Zarina");
        // now through the object name ==> I can get the name (public instance variable)
        System.out.println( Zarina.name );
        //System.out.println( Zarina.SSN );

        Zarina.setSSN(123456);
        System.out.println("Zarina' SSN " + Zarina.getSSN() );  //0

        //System.out.println( Zarina.ID ); //we cannot directly acces to private data, apply rules of encapsulation (getter, setter)
        Zarina.setID(567);
        System.out.println( "Zarina' ID: " + Zarina.getID() );

    }



}
