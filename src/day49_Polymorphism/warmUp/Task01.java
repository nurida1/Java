package day49_.warmUp;

public class Task01 {

}
    //1. create an interface named Edible
    //abstract method: eat();
    interface Edible {
        public abstract void eat ();
    }

    //2. create an interface named Drinkable that can inherit from Edible
    //abstract method: drink();
    interface Drinkable extends Edible {
        public static void drink() {
        }
    }
    //3. create an class named Burger that can inherit from Edible
    //            variables: name, size
    //    method: toString();
    //    create a constructor that can initialize instance variables
//        public class Burger implements Edible {
//
//            String name;
//            String size;
//
//            public String toString () {
//                return name + size ;
//            }
//
//            //4. create another class called IceCoffee  that can inherit from Drinkable
//    //            variable: size
//    //    method: toString()
//    //    create constructor that can set the size
//    //    fix any error might come up
//            public
//       }
//
//
//}


