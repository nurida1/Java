package day37_Constructors;
/*
Regular Methods:
AccessModifier Specifier  ReturnType methodName(Parameter){
        statements;
        }
AccessModifier: public, protected, default, private
Specifier:      static, abstract, final, synchronized
ReturnType:     void, any primitive and non primitive - THIS IS A MUST TO GIVE
methodName:     any name is fine                      - THIS IS A MUST TO GIVE
parameter:      any dataTyp
Constructor:
            very special method. Every class MUST have
            if we don't create a constructor ==> compiler will create one for us (non-argument one) - default constructor
Access-Modifier   methodName(Parameter){
        statements;
        }
class Test{
        }
   creating objects using 'new' keyword: in order to create object ==> we have to have CONSTRUCTOR
        Test obj = new Test();
 className objectName = new Constructor
 NO CLASS EXISTS WITHOUT CONSTRUCTOR
 Every class must have a constructor
 MethodName MUST match with className
 */
public class ConstructorIntro {

    // public method() {} doesn't work //method name MUST to be same as class name

    public ConstructorIntro( int a ) {  //Constructor with argument

        System.out.println("Constructor with argument of int");
    }

    public static void main(String[] args) {

        // compiler already created a constructor (it is hidden at the moment)
        // sometimes we might have to create a constructor on our own
        // first we give AM (accessModifier) then we give methodName (Must be same with className)

        // to create object from this class we can do the following:
        //      c10_ConstructorsIntro obj = new c10_ConstructorsIntro();
        // the compiler already created this Constructor for us - default constructor

        // now since we created our Constructor now, the compiler will not create a default one for us
        // and because we created our own with a parameter ==> we have to pass a parameter when creating our object
        // if we don't pass a parameter when creating our object like the following :
        //   c10_ConstructorIntro obj = new c10_ConstructorIntro(); //
        //   ==> compiler error because it uses the existing constructor which is the one that takes int argument

        //ConstructorIntro obj = new ConstructorIntro( ); //object MUST be created with existing constructor

        ConstructorIntro obj2 = new ConstructorIntro(10); //Constructor with argument of int

        ConstructorIntro obj3 = new ConstructorIntro(10);





    }






}
