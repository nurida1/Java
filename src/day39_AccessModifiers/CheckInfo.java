package day39_AccessModifiers;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println("Name is: " + PersonalInfo.name );
        System.out.println("Gender: " + PersonalInfo.gender );

 //       System.out.println("Grade " + PersonalInfo.grade ); // private cannot be called in other because its private

//        System.out.println("SSN: " + PersonalInfo.SSN );
//        System.out.println("SSN: " + PersonalInfo.ID );

        System.out.println("Age: " + PersonalInfo.age );

        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name );
        System.out.println(obj.gender );

        System.out.println(obj.grade);
        System.out.println(obj.age);

        //System.out.println(obj.SSN);
        //System.out.println(obj.ID);

    }




}
