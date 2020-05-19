package day40_Encapsulation;

import day40_Encapsulation.Credentials;

public class CredentialsObject {

    public static void main(String[] args) {

        Credentials AnnaFacebook = new Credentials();

        System.out.println(AnnaFacebook.getUserName() ); // null : we have not set them yet
        System.out.println( AnnaFacebook.getPassWord() ); // null : we have not set them yet

        // to set UserName and PassWord => we use setter method to set private variables:

        AnnaFacebook.setUserName( "A.paulura" );
        AnnaFacebook.setPassWord( "1234567" );

        // Now if we try to print them using the getter method ==> it will return us the values:
        System.out.println( AnnaFacebook.getUserName() ); //A.Paliura
        System.out.println( AnnaFacebook.getPassWord() ); // ******* because that is what we used to get it in the getter method





    }


}
