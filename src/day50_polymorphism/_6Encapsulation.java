package day50_polymorphism;

public class _6Encapsulation { //hiding data by giving private access modifier

   //private final String username = "Cybertek"; //final data u cannot modify it, but u can read
   private String username = "Cybertek"; //final data u cannot modify it, but u can read

   public String getUsername() { //read only - returns the private data
       return username;
   }

   public void setUsername (String username) { //write only - assigning the argument to private variable
       this.username = username;
   }

}

class Test {
    public static void main(String[] args) {
        _6Encapsulation obj = new _6Encapsulation();
        //System.out.println( obj.username ); private is not accessible
        System.out.println( obj.getUsername() );

        //obj.username= "Cybertek";
        obj.setUsername("Cybertek");

        System.out.println( obj.getUsername() );



    }
}